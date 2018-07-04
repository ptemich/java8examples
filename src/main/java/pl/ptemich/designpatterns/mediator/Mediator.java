package pl.ptemich.designpatterns.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author qasx
 *
 */
public class Mediator {
  
  private List<User> users = new ArrayList<>();
  
  public void registerUser(User user) {
    users.add(user);
  }
  
  public void sendMessage(String message) {
    users.stream().forEach(user -> user.receiveMessage(message));
  }

  
  

}
