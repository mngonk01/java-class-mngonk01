package exercise10;

import java.util.Comparator;

/**
 * Class Book
 * @author mngonk01
 */
public class Book {
  private final String title;
  private final String author;
  private Double price;
  private final Integer year;
  
  /**
   * Constructor
   * @param title new book title
   * @param author new book author
   * @param price new book price
   * @param year new book year
   */
  public Book(String title, String author, double price, int year) {
    this.title = title;
    this.author = author;
    this.price = price;
    this.year = year;
  }
  
  /**
   * Copy constructor
   * @param book another book object
   */
  public Book(Book book) {
    this.title = book.getTitle();
    this.author = book.getAuthor();
    this.price = book.getPrice();
    this.year = book.getYear();
  }
  
  /**
   * Returns the book title
   * @return the book title
   */
  public String getTitle() {
    return title;
  }
  
  /**
   * Returns the book author
   * @return the book author
   */
  public String getAuthor() {
    return author;
  }
  
  /**
   * Returns the book price
   * @return the book price
   */
  public Double getPrice() {
    return price;
  }
  
  /**
   * Returns the book year
   * @return the book year
   */
  public Integer getYear() {
    return year;
  }
  
  /**
   * Sets the book price
   * @param price new book price
   */
  public void setPrice(double price) {
    this.price = price;
  }
  
  /**
   * Returns true if this book is equal to given book object
   * @param o book object
   */
  public boolean equals(Object o) {
    if (o instanceof Book) {
      Book b = (Book)o;
      
      return title.equals(b.title) && author.equals(b.author) && 
        year.equals(b.year);
    }
    
    return false;
  }
  
  /**
   * Returns the hash code value of this book object
   * @return the hash code value of this book object
   */
  public int hashCode() {
    return title.hashCode() + author.hashCode() + 
      price.hashCode() + year;
  }
  
  /**
   * Returns the string representing this book object
   * @return the string representing this book object
   */
  public String toString() {
    return String.format("%s (%d) by %s costs $%.2f", 
      title, year, author, price);
  }
}

class ByTitle implements Comparator<Book> {
  /**
   * Compare book objects by title
   * @return comparison value
   */
  public int compare(Book b1, Book b2) {
    return b1.getTitle().compareTo(b2.getTitle());
  }
}

class ByAuthor implements Comparator<Book> {
  /**
   * Compare book objects by author
   * @return comparison value
   */
  public int compare(Book b1, Book b2) {
    return b1.getAuthor().compareTo(b2.getAuthor());
  }
}

class ByPrice implements Comparator<Book> {
  /**
   * Compare book objects by price
   * @return comparison value
   */
  public int compare(Book b1, Book b2) {
    return b1.getPrice().compareTo(b2.getPrice());
  }
}

class ByYear implements Comparator<Book> {
  /**
   * Compare book objects by year
   * @return comparison value
   */
  public int compare(Book b1, Book b2) {
    return b1.getYear().compareTo(b2.getYear());
  }
}