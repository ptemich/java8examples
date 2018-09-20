/**
 * 
 */
package pl.ptemich.j8tutorials.methodininterface;

/**
 * @author Brutusek
 *
 */
public class Implementation implements InterfaceA, InterfaceB {

  
  /**
   * Jeœli dwa bazowe interfejsy maj¹ t¹ sam¹ metodê domyœln¹ to kompilator zadba o wymóg ich implmentacji
   */
  @Override
  public String printMe() {
    // to nie zadziala -> super.printMe();
    return InterfaceA.super.printMe();
  }
  
}
