/**
 * 
 */
package pl.ptemich.designpatterns.command;


/**
 * @author qasx
 *
 */
public class IncreaseVolumeCommand extends AbstractMusicPlayerCommand {

  
  public IncreaseVolumeCommand(Receiver receiver) {
    super(receiver);
  }
  
  @Override
  public void execute() {
    getReceiver().volumePlus(1);
  }
  
}
