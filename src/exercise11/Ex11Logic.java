package exercise11;

import java.util.Collection;

/**
 * Exercise 11 logic
 * @author mngonk01
 */
public class Ex11Logic {
  
  /**
   * Task 1
   * @param <T>
   * @param item
   * @return length of the parameter's string representation
   */
  public <T> int strLen(T item) {
    return item.toString().length();
  }
  
  /**
   * Task 2
   * @param <T>
   * @param item1
   * @param item2
   * @param item3
   * @return the greater of three parameters
   */
  public <T extends Comparable<T>> T greater(T item1, T item2, T item3) {
    T item = item1;
    
    if (item2.compareTo(item) > 0) {
      item = item2;
    }
    
    if (item3.compareTo(item) > 0) {
      item = item3;
    }
    
    return item;
  }
  
  /**
   * Task 3
   * @param <T>
   * @param list of objects
   * print a list of items
   */
  public <T> void printList(T list) {
    System.out.print(list + " ");
  }
  
  /**
   * Task 4
   * @param <T>
   * @param list of objects
   * @return the smallest item in the collection
   */
  public <T extends Comparable<T>> T findMinItem(Collection<T> list) {
    T minItem = null;
    
    for (T item : list) {
      if (minItem == null || item.compareTo(minItem) < 0) {
        minItem = item;
      }
    }
    
    return minItem;
  }
}

  /**
   * Task 5
   * @param <T>
   * @param <U>
   * A class with two data members, T fuzz and U buzz
   * Implement the constructor, getters, setters, and toString
   */
class Foo<T, U> {
  private T fuzz;
  private U buzz;
  
  /**
   * Constructor
   * @param fuzz new fuzz value
   * @param buzz new buzz value
   */
  public Foo(T fuzz, U buzz) {
    this.fuzz = fuzz;
    this.buzz = buzz;
  }
  
  /**
   * Returns the value of fuzz
   * @return the value of fuzz
   */
  public T getFuzz() {
    return fuzz;
  }
  
  /**
   * Returns the value of buzz
   * @return the value of buzz
   */
  public U getBuzz() {
    return buzz;
  }
  
  /**
   * Sets the value of fuzz
   * @param fuzz new value
   */
  public void setFuzz(T fuzz) {
    this.fuzz = fuzz;
  }
  
  /**
   * Sets the value of buzz
   * @param buzz new value
   */
  public void setBuzz(U buzz) {
    this.buzz = buzz;
  }
  
  /**
   * Returns the string representing this class object
   * @return the string representing this class object
   */
  public String toString() {
    return "Foo{fuzz=" + fuzz + ", buzz=" + buzz + "}";
  }
}