/**
 * 
 */
package pl.ptemich.designpatterns.command;

/**
 * @author qasx
 */
public class Receiver {

  private int volume = 10;

  public void volumePlus(int vol) {
    volume += vol;
  }

  public String getVolume() {
    return "Current volume:" + volume;
  }

}
