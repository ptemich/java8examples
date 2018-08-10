package pl.ptemich.ssn.model;

@FunctionalInterface
public interface ActivationFunction {

  double activate(double potential);
  
}
