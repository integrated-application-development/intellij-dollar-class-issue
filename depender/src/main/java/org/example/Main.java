package org.example;

import org.example.test.Test;
import org.example.test.With$Dollar;

public class Main {

  public static void main(String[] args) {
    With$Dollar d = null;
    // using the problem class directly is fine
    System.out.println(d.foo);

    Test t = null;
    // using the problem class indirectly through a field is not fine
    System.out.println(t.topLevelWithDollar.foo);

    // but it's fine when the problem class is defined as a nested class
    System.out.println(t.nestedWithDollar.foo);
  }
}