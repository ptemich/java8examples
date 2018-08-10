/**
 * 
 */
package pl.ptemich.movieindexer.model;

import java.util.HashMap;

/**
 * @author Przemek
 *
 */
public class ParsingResult extends HashMap<String, MovieLocations> {

  public void rgisterMovieLocation(String movieTitle, String movieLocation) {
    MovieLocations movieLocations = get(movieTitle);
    if (movieLocations == null) {
      movieLocations = new MovieLocations();
      put(movieTitle, movieLocations);
    }
    
    movieLocations.add(movieLocation);
  }

}
