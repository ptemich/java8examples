/**
 * 
 */
package pl.ptemich.j8tutorials.functionalinterface;

import java.util.function.Function;

/**
 * @author Przemek
 *
 */
public class InlineInterface {

  Function<Double, Double> demo = (s)-> s * s;
  
  double value = demo.apply(2.0);
  
}
