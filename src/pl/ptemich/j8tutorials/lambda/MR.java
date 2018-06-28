package pl.ptemich.j8tutorials.lambda;

import java.util.function.Function;

public class MR {

  
  
  public void metoda2NieStatyczna() {
    Function<Integer, String> foo = (x) -> String.valueOf(x);
    
    foo.apply(13);
  }
  
}
