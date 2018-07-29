/**
 * 
 */
package pl.ptemich.movieindexer.model;

import java.nio.file.Path;

/**
 * @author Przemek
 *
 */
public class Movie {

  private String title;

  private Path location;

  public Movie(String title, Path location) {
    this.title = title;
    this.location = location;
  }
  
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Path getLocation() {
    return location;
  }

  public void setLocation(Path location) {
    this.location = location;
  }

}
