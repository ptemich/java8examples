/**
 * 
 */
package pl.ptemich.j8tutorials.methodininterface;

/**
 * @author Brutusek
 *
 */
public interface InterfaceB {

  default String printMe() {
    return "DEF InterfaceB";
  }
  
}
