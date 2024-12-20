package abstraction_demo;  // Define the package name

// Abstract class Sunstar
abstract class Sunstar {
	
    // Abstract method printInfo, which must be implemented by subclasses
    abstract void printInfo();
}

// Employee class that extends the abstract class Sunstar
class Employee extends Sunstar {
	
    // Override the abstract method printInfo to provide implementation
    void printInfo() {
    	
        // Local variables inside the printInfo method
        String name = "Dattatray";  // Name of the employee
        int age = 21;  // Age of the employee
        float salary = 222.22f;  // Salary of the employee
        
        // Print the details of the employee
        System.out.println(name);  // Print the name
        System.out.println(age);   // Print the age
        System.out.println(salary);  // Print the salary
    }
}

// Main class to execute the program
public class Employee_info {
    public static void main(String[] args) {
    	
        // Create an instance of Employee class and assign it to the reference variable of type Sunstar
        Sunstar s = new Employee();
        
        // Call the printInfo method using the reference variable
        s.printInfo();  // This will print the employee's information: name, age, and salary
    }
}

/*
 * Explanation of Each Part:
Abstract Class Sunstar:
The Sunstar class is an abstract class, which means it cannot be instantiated directly.
The abstract method printInfo() is declared in this class, which does not have a body. This method must be implemented by any class that extends Sunstar.

Class Employee:
The Employee class extends the abstract class Sunstar.
It provides the implementation for the printInfo() method.

In this implementation:
String name = "Dattatray"; - a String variable holding the employee's name.
int age = 21; - an integer variable for the employee's age.
float salary = 222.22f; - a float variable for the employee's salary.
The method printInfo() prints the name, age, and salary to the console.

Class Employee_info (Main Class):
The Employee_info class contains the main method, which is the entry point for the program.

Inside the main method:
An object of the Employee class is created and assigned to a reference variable s of type Sunstar (the abstract superclass).
The printInfo() method is called on the reference s. Since s points to an instance of the Employee class, the printInfo() method from the Employee class is invoked, which prints the employee's details.
 */
