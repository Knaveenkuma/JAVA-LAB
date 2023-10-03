
public class MyClass1 {
    protected int protectedField = 42;
    int defaultField = 24;
}
// File: mypackage.pack2.MyClass2.java
//package mypackage.pack2;

public class MyClass2 {
    protected int protectedField = 99;
    int defaultField = 77;
}
// File: mypackage.pack3.MySubclass.java
//package mypackage.pack3;

import mypackage.pack1.MyClass1;
import mypackage.pack2.MyClass2;

public class MySubclass extends MyClass1 {
    public void accessProperties() {
        // Accessing protected fields is allowed in subclasses
        int protectedValue = protectedField;
        System.out.println("Protected Field (from MyClass1): " + protectedValue);

        // Attempting to access default fields from another package results in a compilation error
        // int defaultValue = defaultField; // This line would cause a compilation error
    }
}



