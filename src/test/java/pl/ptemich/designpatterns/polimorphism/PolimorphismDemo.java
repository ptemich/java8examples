package pl.ptemich.designpatterns.polimorphism;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class PolimorphismDemo {

  @Test 
  public void demo() {
    
    InterfaceDefinition handle1 = new ClassA();
    InterfaceDefinition handle2 = new ClassB();
    
    System.out.println(handle1.printSomething());
    System.out.println(handle2.printSomething());
    
    List<InterfaceDefinition> list = new ArrayList<>();
    list.add(handle1);
    list.add(handle2);
    System.out.println("From list:\n");
    list.stream().forEach(elem -> System.out.println(elem.printSomething()));
  }
  
}
