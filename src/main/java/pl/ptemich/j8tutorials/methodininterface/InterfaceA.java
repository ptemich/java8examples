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
    return "InterfaceA version of printMe";
  }
  
  static String staticPrintMe() {
    return "Static printing method";
  }
  
}
