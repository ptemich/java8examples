package pl.ptemich.designpatterns.abstractfactory;


public class SauberDrinkFactory implements AbstractDrinkFactory {

  @Override
  public Drink mixDrinkWith(String string) {
    // ignore requested liquid - always return JuiceDrink
    return new JuiceOnlyDrink();
  }

}
