package pl.ptemich.pagechecker;

public class PageChecker {

  public static void main(String[] args) {
    
    UrlsExtractor extractor = new UrlsExtractor();
    extractor.extractUrls("https://www.vattenfall.de/");
      
  }

}
