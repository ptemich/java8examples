/**
 * 
 */
package pl.ptemich.designpatterns.strategy;

import org.junit.Test;

/**
 * @author qasx
 *
 */
public class StrategyDemo {

  @Test
  public void demo() {
    Team team = new Team(new StrategyA());
    System.out.println(team.playGame());
    
    // change strategy
    team.setStrategy(new StrategyB());
    System.out.println(team.playGame());
  }
  
}
