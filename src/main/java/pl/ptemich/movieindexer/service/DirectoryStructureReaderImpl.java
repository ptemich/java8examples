package pl.ptemich.movieindexer.service;

import java.io.File;

import pl.ptemich.movieindexer.model.ParsingResult;

/**
 * @author Przemek
 *
 */
public class DirectoryStructureReaderImpl implements DirectoryStructureReader {

  @Override
  public void readMoviesFromPath(ParsingResult result, File folder) {
    if (reachedParsinLimit(result)) {
      return;
    }
    
    System.out.println("Read from folder: " + folder.getPath());
    if (folder.exists() && folder.isDirectory()) {
      File[] files = folder.listFiles();
      if (files != null) {
        for (File file : files) {
          checkFile(result, file);
        }
      }
    }
  }

  private boolean reachedParsinLimit(ParsingResult result) {
    return result.size() > 10;
  }

  private void checkFile(ParsingResult result, File file) {
    if (file.isDirectory()) {
      readMoviesFromPath(result, file);
    } else if (file.isFile()) {
      result.rgisterMovieLocation(file.getName(), file.getPath());
    }
  }
  

}
