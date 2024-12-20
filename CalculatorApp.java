package abstraction_demo;

// Abstract class Calculator
abstract class Calculator {
    int a;  // Declare an integer variable 'a'
    int b;  // Declare an integer variable 'b'

    // Method to set the values of 'a' and 'b'
    void setvalue(int x, int y) {
        a = x;  // Set the value of 'a'
        b = y;  // Set the value of 'b'
    }

    // Abstract method to calculate and return the result
    abstract int getResult();
}

// Subclass Add that extends Calculator and implements the getResult method
class Add extends Calculator {
    // Override the getResult method to return the sum of 'a' and 'b'
	
    int getResult() {
        return a + b;  // Return the sum of 'a' and 'b'
    }
}

// Subclass Sub that extends Calculator and implements the getResult method
class Sub extends Calculator {
    // Override the getResult method to return the difference of 'a' and 'b'
	
    int getResult() {
        return a - b;  // Return the difference between 'a' and 'b'
    }
}

// Subclass Mul that extends Calculator and implements the getResult method
class Mul extends Calculator {
	
    // Override the getResult method to return the product of 'a' and 'b'
    int getResult() {
        return a * b;  // Return the product of 'a' and 'b'
    }
}

// Subclass Div that extends Calculator and implements the getResult method
class Div extends Calculator {
	
    // Override the getResult method to return the quotient of 'a' divided by 'b'
    int getResult() {
        return a / b;  // Return the quotient of 'a' divided by 'b'
    }
}

// Main class to test the Calculator functionality
public class CalculatorApp {
    public static void main(String x[]) {
    	
        // Create an object of the Add class
        Add ad = new Add();
        
        ad.setvalue(10, 12);  // Set values for 'a' and 'b'
        System.out.println("Addition is: " + ad.getResult());  // Print the result of addition
        
        // Create an object of the Sub class
        Sub sb = new Sub();
        sb.setvalue(22, 15);  // Set values for 'a' and 'b'
        System.out.println("Subtraction is: " + sb.getResult());  // Print the result of subtraction
        
        // Create an object of the Mul class
        Mul ml = new Mul();
        ml.setvalue(2, 8);  // Set values for 'a' and 'b'
        System.out.println("Multiplication is: " + ml.getResult());  // Print the result of multiplication
        
        // Create an object of the Div class
        Div dv = new Div();
        dv.setvalue(15, 5);  // Set values for 'a' and 'b'
        System.out.println("Division is: " + dv.getResult());  // Print the result of division
    }
}


/*
Explanation of the Code with Comments:
Abstract Class Calculator:
The class Calculator defines two integer variables a and b.
The setvalue(int x, int y) method is used to set the values of a and b.
The getResult() method is abstract, which means it doesn't have a body. This method must be implemented by the subclasses.

Subclasses of Calculator:
Add: Implements the getResult() method to return the sum of a and b.
Sub: Implements the getResult() method to return the difference between a and b.
Mul: Implements the getResult() method to return the product of a and b.
Div: Implements the getResult() method to return the quotient of a divided by b.

In the CalculatorApp Class:
Each subclass (Add, Sub, Mul, Div) is instantiated.
The setvalue(int x, int y) method is called for each object to assign values to a and b.
The getResult() method is then called to compute the result based on the operation defined in each subclass (addition, subtraction, multiplication, or division).
The results are printed to the console.
*/
