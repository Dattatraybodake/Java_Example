package abstraction_demo;  // Define the package for the program

// Abstract class Geometry that different shapes
abstract class Geometry {

    // Abstract methods for calculating the area of different shapes
    abstract void rectangle_area(int height, int width);  // Method for rectangle area
    abstract void square_area(int side);                  // Method for square area
    abstract void circle_area(float radius);              // Method for circle area
}

// Class Easy extends Geometry and implements the abstract methods
class Easy extends Geometry {

    // Implementation of the method to calculate the area of a circle
    @Override
    public void circle_area(float radius) 
    {
        // Formula for the area of a circle: π * radius^2
        float ar = 3.14f * radius * radius;  // Calculate area
        System.out.println("Area of Circle is: " + ar);  // Print the calculated area
    }

    // Implementation of the method to calculate the area of a rectangle
    @Override
    public void rectangle_area(int height, int width) 
    {
        // Formula for the area of a rectangle: height * width
        int ar = height * width;  // Calculate area
        System.out.println("Area of rectangle is: " + ar);  // Print the calculated area
    }

    // Implementation of the method to calculate the area of a square
    @Override
    public void square_area(int side) 
    {
        // Formula for the area of a square: side * side
        int ar = side * side;  // Calculate area
        System.out.println("Area of Square is: " + ar);  // Print the calculated area
    }

}

public class AreaApplication {

    public static void main(String[] args) 
    {
        // Main method to execute the program
        
        // Create an object of the Easy class, which implements Geometry methods
        Easy obj = new Easy();
        
        // Call the methods to calculate the area of different shapes
        obj.rectangle_area(12, 13);  // Rectangle with height=12, width=13
        obj.circle_area(2.2f);        // Circle with radius=2.2
        obj.square_area(12);          // Square with side=12
    }
}

/*
Explanation of the Code:
Abstract Class Geometry:
This is an abstract class that defines three abstract methods: rectangle_area(), square_area(), and circle_area(). These methods don't have any implementation here; they only provide the method signature.
The Geometry class is meant to be extended by other classes that will provide the implementation for these methods.

Concrete Class Easy:
The Easy class extends the Geometry class and provides concrete implementations for the abstract methods.

circle_area(float radius): Calculates the area of a circle using the formula 
𝜋 × radius2
π × radius 2.

rectangle_area(int height, int width): Calculates the area of a rectangle using the formula 
height × width
height × width.

square_area(int side): Calculates the area of a square using the formula 
side × side
side×side.

Main Class AreaApplication:
In the main() method, an object of the Easy class is created (Easy obj = new Easy();).
This object is used to call the methods (rectangle_area(), circle_area(), and square_area()) to compute and print the areas of different shapes:

A rectangle with height 12 and width 13.
A circle with radius 2.2.
A square with side 12.
 */
