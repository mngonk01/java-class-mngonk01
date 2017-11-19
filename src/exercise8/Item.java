package exercise8;

/**
 * Class Item
 * @author mngonk01
 */
public abstract class Item {
  protected final long id;
  protected final String title;
  protected int quantity;

  /**
   * Constructor
   * @param id new id
   * @param title new title
   * @param quantity new quantity
   */
  public Item(long id, String title, int quantity) {
    this.id = id;
    this.title = title;
    this.quantity = quantity;
  }
  
  /**
   * Get the id
   * @return the id
   */
  public long getId() {
    return id;
  }
  
  /**
   * Get the title
   * @return the title
   */
  public String getTitle() {
    return title;
  }
  
  /**
   * Get the quantity
   * @return the quantity
   */
  public int getQuantity() {
    return quantity;
  }
  
  /**
   * Set the quantity
   * @param quantity new quantity
   */
  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }
  
  /**
   * Get the item availability
   * @return true if quantity > 0
   */
  public boolean isAvailable() {
    return (quantity > 0);
  }

  /**
   * Check out an item (decrease quantity by 1, if possible
   */
  public void checkout() {
    if (isAvailable()) {
      quantity--;
    }
  }

  /**
   * Check in an item
   */
  public void checkin() {
    quantity++;
  }
  
  @Override
  public String toString() {
    String s = "We have ";
    
    if (quantity > 1) {
      s += quantity + " copies";
    } else {
      s += "a copy";
    }
    
    s += " of " + title;
    
    return s;
  }

  /**
   * Get the item information
   * @return item information, type-specific
   */
  public abstract String getInfo();
  
}