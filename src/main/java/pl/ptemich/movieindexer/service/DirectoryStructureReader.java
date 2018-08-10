/**
 * 
 */
package pl.ptemich.movieindexer.service;

import java.io.File;

import pl.ptemich.movieindexer.model.ParsingResult;

/**
 * @author Przemek
 *
 */
public interface DirectoryStructureReader {

  void readMoviesFromPath(ParsingResult result, File folder);
  
}
