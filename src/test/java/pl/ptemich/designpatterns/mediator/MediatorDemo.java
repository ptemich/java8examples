package pl.ptemich.designpatterns.mediator;

import org.junit.Test;

/**
 * @author qasx
 *
 */
public class MediatorDemo {

  @Test
  public void demo() {
    Mediator mediator = new Mediator();
    
    User maks = new User("Maks", mediator);
    mediator.registerUser(maks);
    
    User robert = new User("Robert", mediator);
    mediator.registerUser(robert);
    
    User tata = new User("Przemek", mediator);
    mediator.registerUser(tata);    
    
    User mama = new User("Ania", mediator);    
    mama.sendMessage("na obiad");
  }
  
}
