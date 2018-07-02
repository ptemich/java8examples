/**
 * 
 */
package pl.ptemich.designpatterns.strategy;


/**
 * @author qasx
 *
 */
public class Team {

  private Strategy strategy;
  
  public Team(Strategy strategy) {
    this.strategy = strategy;
  }
  
  public String playGame() {
    return "play match: " + strategy.executeStrategy();
  }

  public void setStrategy(Strategy strategy) {
    this.strategy = strategy;
  }
  
}
