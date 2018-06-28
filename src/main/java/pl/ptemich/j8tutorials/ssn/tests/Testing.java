package pl.ptemich.j8tutorials.ssn.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import pl.ptemich.j8tutorials.ssn.model.ActivationFunction;
import pl.ptemich.j8tutorials.ssn.model.Neuron;
import pl.ptemich.j8tutorials.ssn.model.NeuronInput;

public class Testing {

  private static ActivationFunction unipolar = x -> x > 0 ? 1 : 0;
  
  private static ActivationFunction bipolar = x -> x > 0 ? 1 : -1;
  
  
  @Test
  public void testWeight() {
    NeuronInput ni = new NeuronInput();
    ni.setWeight(0.2);
    ni.setInputValue(0.3);
    ni.calculateOutput();
    assertEquals(0.06, ni.getOutputValue(), 0);
  }
  
  @Test
  public void testPerceptron() {
    int inputVectorSize = 6;
    
    // Neuron per = new Neuron(inputVectorSize);
    
    double[] input = new double[inputVectorSize];
    input[0] = 0.1;
    input[1] = 0.1;
    input[2] = 0.1;
    input[3] = 0.1;
    input[4] = 0.1;
    input[5] = 0.1;
    
    
    Neuron per = new Neuron(input, bipolar);
    
    per.readData(input);
    
    per.calculatePotential();
    double potential = per.getPotential();    
    assertEquals(0.06, potential, 0.0000001);
    
    per.calculateOutputValue();
    double outputValue = per.getOutputValue();
    assertEquals(1, outputValue, 0);
    
    per.setExpectedOutput(0.5);
    
    input[0] = -0.1;
    input[1] = -0.1;
    input[2] = -0.1;
    input[3] = -0.1;
    input[4] = -0.1;
    input[5] = -0.1;
    
    per.readData(input);
    
    per.calculatePotential();
    potential = per.getPotential();    
    assertEquals(-0.06, potential, 0.0000001);
    
    per.calculateOutputValue();
    outputValue = per.getOutputValue();
    assertEquals(-1, outputValue, 0);
  }
}

