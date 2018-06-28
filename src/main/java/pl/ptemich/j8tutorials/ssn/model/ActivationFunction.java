package pl.ptemich.j8tutorials.ssn.model;

@FunctionalInterface
public interface ActivationFunction {

  double activate(double potential);
  
}
