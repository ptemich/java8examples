package pl.ptemich.j8tutorials.pagechecker;

public class PageChecker {

  public static void main(String[] args) {
    
    UrlsExtractor extractor = new UrlsExtractor();
    extractor.extractUrls("https://www.vattenfall.de/");
      
  }

}
