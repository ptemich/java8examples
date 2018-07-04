/**
 * 
 */
package pl.ptemich.designpatterns.abstracfactory;

import org.junit.Test;

import pl.ptemich.designpatterns.abstractfactory.AbstractDrinkFactory;
import pl.ptemich.designpatterns.abstractfactory.Drink;
import pl.ptemich.designpatterns.abstractfactory.SauberDrinkFactory;
import pl.ptemich.designpatterns.abstractfactory.StandardDrinkFactory;

/**
 * @author qasx
 *
 */
public class AbstractFactoryDemo {
  
  @Test
  public void demo() {
    AbstractDrinkFactory abstractFactory = new StandardDrinkFactory();
    Drink drink = abstractFactory.mixDrinkWith("VODKA");
    drink.drink();
    
    abstractFactory = new SauberDrinkFactory();
    drink = abstractFactory.mixDrinkWith("VODKA");
    drink.drink();
  }

}
