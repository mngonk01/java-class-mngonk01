package exercise8;

import java.util.ArrayList;

/**
 * Class DigitalMovie
 * MediaLIbrary code 2
 * @author mngonk01
 */
public class DigitalMovie extends Movie {
  private String service;

  /**
   * Constructor
   */
  public DigitalMovie(String service, String director, int releaseYear, long id, String title) {
    super(director, releaseYear, id, title, 1);
    this.service = service;
  }
  
  /**
   * Get the value of service
   * @return the value of service
   */
  public String getService() {
    return service;
  }

  /**
   * Set the value of service
   * @param service new value of service
   */
  public void setService(String service) {
    this.service = service;
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
   * Get detailed description of a digital movie
   * @return detailed description of a digital movie
   */
  public String getInfo() {
    return title + " (" + releaseYear + ") by " + director + " is available via " + service;
  }
}