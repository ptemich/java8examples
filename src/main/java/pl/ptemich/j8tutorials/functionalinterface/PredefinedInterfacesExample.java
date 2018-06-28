/**
 * 
 */
package pl.ptemich.j8tutorials.functionalinterface;

import java.util.function.Function;

/**
 * 
 * 
 *  java,util.function
 *  
 *  
 * @author Brutusek
 *
 */
public class PredefinedInterfacesExample {

  public void exampleMethod() {
    
    /**
     * przkeszta³ca wejsciowy Integer na String
     */
    Function<Integer, String> fun = new Function<Integer, String>() {
        @Override
        public String apply(Integer in) {
          return String.valueOf(in);
        }
    };
    
    System.out.println(fun.apply(2));
   
  }
  
}
