/**
 * 
 */
package pl.ptemich.designpatterns.visitor;


/**
 * @author qasx
 *
 */
public abstract class Dish {

  public abstract void accept(Visitor visitor);  
  
}
