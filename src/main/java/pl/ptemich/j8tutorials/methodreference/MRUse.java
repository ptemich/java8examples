package pl.ptemich.j8tutorials.methodreference;

import java.util.function.Supplier;

public class MRUse {

  public void m2() {
    Supplier<String> sup = MR::metoda1;
    MR nmr = new MR();
    Supplier<String> m2 = nmr::metoda2NieStatyczna; // to jest zajebiste - wskaznik do metody :)
    
    
    
    
    System.out.println(sup.get());
    System.out.println(m2.get());
  }
  
}
