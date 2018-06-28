package pl.ptemich.j8tutorials.ssn.model;

public class Neuron {

  /**
   * "c"  
   */
  private static final double LEARNING_FACTOR = 1;
  
  private NeuronInput[] neuronInputs;

  private int inputVectorSize;

  private double potential;

  private ActivationFunction aFunc;

  private double output;
  
  private double expectedOutput;
  
  private double learningSignal;

  public Neuron(int inputVectorSize, ActivationFunction aFunc) {
    this.aFunc = aFunc;
    this.inputVectorSize = inputVectorSize;
    neuronInputs = new NeuronInput[inputVectorSize];

    for (int inputIdx = 0; inputIdx < inputVectorSize; inputIdx++) {
      neuronInputs[inputIdx] = new NeuronInput();
    }
  }

  public Neuron(double[] initialWeights, ActivationFunction aFunc) {
    this.aFunc = aFunc;
    inputVectorSize = initialWeights.length;
    neuronInputs = new NeuronInput[inputVectorSize];

    for (int inputIdx = 0; inputIdx < inputVectorSize; inputIdx++) {
      double initialWeight = initialWeights[inputIdx];
      neuronInputs[inputIdx] = new NeuronInput();
      neuronInputs[inputIdx].setWeight(initialWeight);
    }
  }

  public void readData(double[] inputData) {
    for (int inputIdx = 0; inputIdx < inputVectorSize; inputIdx++) {
      double input = inputData[inputIdx];
      neuronInputs[inputIdx].setInputValue(input);
    }
  }

  public void calculatePotential() {
    potential = 0.0;

    for (NeuronInput neuronInput : neuronInputs) {
      neuronInput.calculateOutput();
      potential += neuronInput.getOutputValue();
    }
  }

  public double getPotential() {
    return potential;
  }

  public void calculateOutputValue() {
    output = aFunc.activate(potential);
  }

  public double getOutputValue() {
    return output;
  }

  public void setExpectedOutput(double expectedOutput) {
    this.expectedOutput = expectedOutput;
  }

  void calculateLearningSignal() {
//    for (int inputIdx = 0; inputIdx < inputVectorSize; inputIdx++) {
//      neuronInputs[inputIdx].calculateLearningFactor(ou);
//    }
//    
//    learningSignal = LEARNING_FACTOR * output * 
  }
  
}
