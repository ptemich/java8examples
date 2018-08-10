/**
 * 
 */
package pl.ptemich.movieindexer.model;

import java.util.ArrayList;

/**
 * @author Przemek
 *
 */
public class MovieLocations extends ArrayList<String> {

  public boolean isMultipleLocations() {
    if (size() > 1) {
      return true;
    }
    
    return false;
  }
  
}
