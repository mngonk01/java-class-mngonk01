package exercise8;

/**
 * Class EBook
 * MediaLIbrary code 4
 * @author mngonk01
 */
public class EBook extends Book {
  private final String format;
  
  /**
   * Constructor
   */
  public EBook(String format, String author, int publishingYear, long id, String title) {
    super(author, publishingYear, id, title, 1);
    this.format = format;
  }
  
  /**
   * Get the book format
   * @return the value of format
   */
  public String getFormat() {
    return format;
  }
  
  /**
   * Check out 
   */
  public void checkout() {
    // do nothing
  }

  /**
   * Check in
   */
  public void checkin() {
    // do nothing
  }
  
  /**
   * Get detailed description of an ebook
   * @return detailed description of an ebook
   */
  public String getInfo() {
    return author + " (" + publishingYear + "). " + title + " is available for " + format;
  }
}