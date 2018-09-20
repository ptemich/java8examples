/**
 * 
 */
package pl.ptemich.effective;

import org.junit.Test;

/**
 * @author Przemek
 *
 */
public class RoomTest {

  @Test
  public void testAutoClosing() {
    try (Room room = new Room("kuchnia"); Room room2 = new Room("salon")) {
      System.err.println("Standard end");
    } catch (Exception e) {
      System.err.println("Thrown exception in close->Autocloseable");
    }
  }
  
}
