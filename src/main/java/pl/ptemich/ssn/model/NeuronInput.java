package pl.ptemich.ssn.model;

public class NeuronInput {

  private double weight;
  
  private double inputValue;
  
  private double outputValue;
  
  public void setWeight(double weight) {
    this.weight = weight;
  }

  public void setInputValue(double inputValue) {
    this.inputValue = inputValue;
  }

  public void calculateOutput() {
    outputValue = weight * inputValue;
  }
  
  public double getOutputValue() {
    return outputValue;
  }

}
