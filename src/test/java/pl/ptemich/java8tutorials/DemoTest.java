package pl.ptemich.java8tutorials;

import org.junit.Test;

import pl.ptemich.j8tutorials.methodininterface.Implementation;

/**
 * @author Przemek
 *
 */
public class DemoTest {

  @Test
  public void defaultAndStaticInterfaceMethods() {
    Implementation impl = new Implementation();
    System.out.println(impl.printMe());
  }
  
}
