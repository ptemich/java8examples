package pl.ptemich.designpatterns.strategy;


public class StrategyA implements Strategy {

  @Override
  public String executeStrategy() {    
    return "execute strategy A";
  }

}
