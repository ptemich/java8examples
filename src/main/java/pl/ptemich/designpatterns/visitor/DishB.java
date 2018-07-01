/**
 * 
 */
package pl.ptemich.designpatterns.visitor;

/**
 * @author qasx
 */
public class DishB extends Dish {

  @Override
  public void accept(Visitor visitor) {
    visitor.visit(this);
  }

}
