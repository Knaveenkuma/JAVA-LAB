public class MathOperations {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }
}
//package mypackage.pack2;

public class StringOperations {
    public String concatenate(String str1, String str2) {
        return str1 + str2;
    }

    public String reverse(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
}
//package mypackage.pack3;

public class Calculator {
    public int multiply(int a, int b) {
        return a * b;
    }

    public String divide(int a, int b) {
        if (b == 0) {
            return "Cannot divide by zero.";
        }
        return String.valueOf(a / b);
    }
}
//package mypackage;

//import mypackage.pack1.MathOperations;
//import mypackage.pack2.StringOperations;
//import mypackage.pack3.Calculator;

public class Main {
    public static void main(String[] args) {
        // Create instances of the classes from pack1, pack2, and pack3
        MathOperations math = new MathOperations();
        StringOperations stringOps = new StringOperations();
        Calculator calculator = new Calculator();

        // Test the methods and print the results
        int sum = math.add(5, 3);
        int difference = math.subtract(10, 4);
        String concatenated = stringOps.concatenate("Hello, ", "world!");
        String reversed = stringOps.reverse("Java is fun");
        int product = calculator.multiply(6, 7);
        String divisionResult = calculator.divide(10, 2);
        String divisionByZero = calculator.divide(8, 0);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Concatenated String: " + concatenated);
        System.out.println("Reversed String: " + reversed);
        System.out.println("Product: " + product);
        System.out.println("Division Result: " + divisionResult);
        System.out.println("Division By Zero: " + divisionByZero);
    }
}
