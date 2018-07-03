/**
 * 
 */
package pl.ptemich.designpatterns.command;

/**
 * @author qasx
 */
public abstract class AbstractMusicPlayerCommand implements Command {

  private Receiver receiver;

  protected AbstractMusicPlayerCommand(Receiver receiver) {
    this.receiver = receiver;
  }

  public Receiver getReceiver() {
    return receiver;
  }

}
