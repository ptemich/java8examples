package pl.ptemich.designpatterns.abstractfactory;


public class StandardDrinkFactory implements AbstractDrinkFactory {

  @Override
  public Drink mixDrinkWith(String liquid) {
    if (liquid.toLowerCase().contains("vodka")) {
      return new VodkaDrink();
    } else {
      return new MartiniDrink();
    }
  }

}
