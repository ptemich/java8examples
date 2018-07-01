/**
 * 
 */
package pl.ptemich.designpatterns.visitor;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**
 * @author qasx
 *
 */
public class VisitorDemo {

  @Test
  public void demo() {
    List<Dish> objectsToVisit = new ArrayList<Dish>();
    
    objectsToVisit.add(new DishB());
    objectsToVisit.add(new DishA());
    
    final Visitor visitor = new Visitor();
    objectsToVisit.stream().forEach(toVisit -> toVisit.accept(visitor));
    
    // tricky part - not part of the Visitor pattern
    System.out.println("Tricky part: \n");
    objectsToVisit.stream().forEach(toVisit -> visitor.visit(toVisit));
  }
  
}
