package pl.ptemich.effective;

public class Room implements AutoCloseable {
  
  private String roomName;
  
  public Room(String roomName) {
    this.roomName = roomName;
  }
  
  @Override
  public void close() throws Exception {
    System.err.println("Auto closing works:" + roomName);
    throw new Exception("Failed");
  }
  
}
