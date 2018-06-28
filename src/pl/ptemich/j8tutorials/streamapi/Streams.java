package pl.ptemich.j8tutorials.streamapi;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

import org.junit.Test;

public class Streams {

  @Test
  public void processStream() {
    List<Integer> streamSource = Arrays.asList(2,3,6,9,0);
    Stream<Integer> stream = streamSource.stream();
    
    Predicate<Integer> oddNumber = x -> x % 2 == 0 ? true : false;
    Stream<Integer> oddNumbers = stream.filter(oddNumber);
    
    Consumer<Integer> printInt = x -> System.out.println(x);
    oddNumbers.forEach(printInt);
  }
  
}
