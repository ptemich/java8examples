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
   * Je�li dwa bazowe interfejsy maj� t� sam� metod� domy�ln� to kompilator zadba o wym�g ich implmentacji
   */
  @Override
  public String printMe() {
    // TODO Auto-generated method stub
    return InterfaceA.super.printMe();
  }
  
}
