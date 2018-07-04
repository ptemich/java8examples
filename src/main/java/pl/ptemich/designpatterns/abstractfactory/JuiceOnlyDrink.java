/**
 * 
 */
package pl.ptemich.designpatterns.abstractfactory;


/**
 * @author qasx
 *
 */
public class JuiceOnlyDrink implements Drink {

  @Override
  public void drink() {
    System.out.println("No alcohol today !!!");
  }

}
