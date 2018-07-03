package pl.ptemich.designpatterns.command;

import org.junit.Test;

public class CommandDemo {

  @Test
  public void demo() {
    Receiver receiver = new Receiver();
    System.out.println(receiver.getVolume());
    
    IncreaseVolumeCommand increase = new IncreaseVolumeCommand(receiver);
    DecreaseVolumeCommand decrease = new DecreaseVolumeCommand(receiver);
    
    CommandInvoker invoker = new CommandInvoker();
    invoker.addCommand(increase);
    invoker.addCommand(increase);
    invoker.addCommand(increase);
    invoker.addCommand(increase);
    invoker.launchCommands();
    
    System.out.println(receiver.getVolume());
    
    
    invoker.addCommand(decrease);
    invoker.addCommand(decrease);
    invoker.launchCommands();
    System.out.println(receiver.getVolume());
  }
  
}
