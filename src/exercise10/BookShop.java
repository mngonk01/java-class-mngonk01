package exercise10;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Class BookShop
 * @author mngonk01
 */
public class BookShop {
  private ArrayList<Book> catalog;
  
  /**
   * Constructor that initializes the catalog to an empty ArrayList
   */
  public BookShop() {
    catalog = new ArrayList<Book>();
  }
  
  /**
   * Constructor that initializes the catalog from given file
   * @param filename file name
   */
  public BookShop(String filename) throws FileNotFoundException {
    this();
    
    BufferedReader reader = new BufferedReader(new FileReader(filename));
    String line;
    
    try {
      while ((line = reader.readLine()) != null) {
        String[] fields = line.split(",");
      
        catalog.add(new Book(fields[0], 
                             fields[1], 
                             Double.parseDouble(fields[2]), 
                             Integer.parseInt(fields[3]))); 
      }
      
      reader.close();
    } catch (IOException e) {
    }
  }
  
  /**
   * Constructor that takes another object of type BookShop as a
   * parameter and makes a copy of it
   * @param anotherBookShop another BookShop object
   */
  public BookShop(BookShop anotherBookShop) {
    this();
    
    for (Book book : anotherBookShop.catalog) {
      catalog.add(new Book(book));
    }
  }
  
  /**
   * Adds a book object to the catalog
   * @param book book object
   */
  public void addNewTitle(Book book) {
    catalog.add(book);
  }
  
  /**
   * Returns the size of the catalog
   * @return the size of the catalog
   */
  public int size() {
    return catalog.size();
  }
  
  /**
   * Applies the provided discount (given as percentage) to all books
   * in the catalog
   * @param discountPercent discount percentage
   */
  public void discountAll(Double discountPercent) {
    for (Book book : catalog) {
      book.setPrice(book.getPrice()*(1-discountPercent/100));
    }
  }
  
  /**
   * Prints all items in the catalog
   */
  public void printCatalog() {
    for (Book book : catalog) {
      System.out.print(book + "\n");
    }
  }
  
  /**
   * Orders the list based on provided comparator
   * @param comp Comparator object
   */
  public void order(Comparator<Book> comp) {
    Collections.sort(catalog, comp);
  }
  
  /**
   * Returns the catalog object
   * @return the catalog object
   */
  public ArrayList<Book> getCatalog() {
    return catalog;
  }
}