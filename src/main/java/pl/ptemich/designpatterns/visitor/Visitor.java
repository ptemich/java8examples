/**
 * 
 */
package pl.ptemich.designpatterns.visitor;


/**
 * @author qasx
 *
 */
public class Visitor {

  public void visit(DishA dish) {
    System.out.println("Visit - DishA");
  }
  
  public void visit(DishB dish) {
    System.out.println("Visit - DishB");
  }
  
  // tricky part - not part of the Visitor pattern
  public void visit(Dish dish) {
    System.out.println("Visit - Dish");
  }  
  
}
