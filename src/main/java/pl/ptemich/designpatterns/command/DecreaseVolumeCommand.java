/**
 * 
 */
package pl.ptemich.designpatterns.command;

/**
 * @author qasx
 */
public class DecreaseVolumeCommand extends AbstractMusicPlayerCommand {

  public DecreaseVolumeCommand(Receiver receiver) {
    super(receiver);
  }

  @Override
  public void execute() {
    getReceiver().volumePlus(-1);
  }

}
