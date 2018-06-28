/**
 * 
 */
package pl.ptemich.j8tutorials.methodininterface;

/**
 * @author Brutusek
 *
 */
public interface InterfaceA {

  default String printMe() {
    return "DEF InterfaceA";
  }
  
  default String printMeA() {
    return "print me A";
  }
  
}
