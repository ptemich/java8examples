/**
 * 
 */
package pl.ptemich.movieindexer.service;

import java.util.List;

import pl.ptemich.movieindexer.model.Movie;

/**
 * @author Przemek
 *
 */
public interface DirectoryStructureReader {

  List<Movie> readMoviesFromPath();
  
}
