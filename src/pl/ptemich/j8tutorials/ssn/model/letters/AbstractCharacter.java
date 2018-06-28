package pl.ptemich.j8tutorials.ssn.model.letters;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractCharacter implements NeuronData {

  private List<Double> data = new ArrayList<Double>();
  
  public AbstractCharacter() {
    init();
  }
  
  public abstract void init();
  
  @Override
  public List<Double> getData() {
    return data;
  }
  
  protected AbstractCharacter in(double entry) {
    data.add(entry);
    return this;
  }
  
}
