package pl.ptemich.j8tutorials.optional;

import java.util.Optional;

public class OptExample {

  public void optionalTest() {
    Optional<String> optionalString = Optional.of("SDSDS");
    optionalString.ifPresent(null);
  }
  
}
