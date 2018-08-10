package pl.ptemich.movieindexer.service;

import java.io.File;

import org.junit.Test;

import pl.ptemich.movieindexer.model.ParsingResult;

/**
 * @author Przemek
 *
 */
public class DirectoryStructureReaderImplTest {

  @Test
  public void listRoot() {
    DirectoryStructureReader reader = new DirectoryStructureReaderImpl();
    ParsingResult result = new ParsingResult();
    File rootFolder = new File("C:\\Workspace\\java8examples");
    reader.readMoviesFromPath(result, rootFolder);
    result.entrySet().stream()
    .filter(movie -> movie.getValue().isMultipleLocations())
    .forEach(movie -> System.out.println(movie.getKey() +  " -> " + movie.getValue()));
  }
}
