package pl.ptemich.designpatterns.mediator;


/**
 * @author qasx
 *
 */
public class User {

  private String userName;
  
  private Mediator mediator;
  
  public User(String userName, Mediator mediator) {
    this.userName = userName;
    this.mediator = mediator;
  }
    
  public void receiveMessage(String message) {
    System.out.println(userName + " received message: " + message);
  }
  
  public void sendMessage(String message) {
    System.out.println("User " + userName + " is sending a message: " + message);
    mediator.sendMessage(message);
  }
  
}
