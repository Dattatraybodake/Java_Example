package array_examples; // Declares that this class belongs to the "array" package

import java.util.Scanner; // Imports Scanner class from java.util package

public class Jagged_Array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); // Create a Scanner object for user input

		// Declare a jagged array of size 3x[], where the size of each row varies
		int a[][]=new int[3][]; 

		// Define the size of each row individually
		a[0]=new int[1]; // Row 0 has 1 element
		a[1]=new int[3]; // Row 1 has 3 elements
		a[2]=new int[2]; // Row 2 has 2 elements

		// Input values into the jagged array
	      System.out.println("Enter Elements in Array:");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=sc.nextInt(); // Populate the jagged array with user input
			}
		}

		// Display the jagged array
		System.out.println("Display The Elements: ");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print("\t"+a[i][j]); // Print each element of the jagged array
			}
			System.out.println("\n"); // Move to the next line after printing each row
		}
	}
}



