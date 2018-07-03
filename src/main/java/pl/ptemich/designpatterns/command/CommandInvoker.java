/**
 * 
 */
package pl.ptemich.designpatterns.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author qasx
 *
 */
public class CommandInvoker {

  private List<Command> commands = new ArrayList<>();
  
  public void addCommand(Command command) {
    commands.add(command);
  }
  
  public void launchCommands() {
    commands.stream().forEach(command -> command.execute());
    commands.clear();
  }
  
}
