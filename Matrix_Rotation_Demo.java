package array_examples;

import java.util.Scanner;

public class Matrix_Rotation_Demo {
	private static void InsertElements(int[][] a, Scanner sc) {
		System.out.println("Enter the elements in array ");
      for (int i = 0; i < a.length; i++) {
          for (int j = 0; j < a[i].length; j++) {
              a[i][j] = sc.nextInt(); // Populate the 2D array with user input
          }
      }
	}

	private static void DisplayElements(int[][] a) {
		// Display the Original Matrix
      System.out.println("Display the Array");
      for (int[] element : a) {
          for (int j = 0; j < element.length; j++) {
              System.out.printf("\t" + element[j]); // Print the original array
          }
          System.out.println("\n"); // Newline after each row
      }		
	}

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Create a Scanner object for user input

        int a[][] = new int[3][3]; // Declare a 2D array of size 3x3 to store matrix elements
        
        InsertElements(a, sc);
        DisplayElements(a);
        RotateMatrix(a);   
        sc.close(); // Close the scanner to avoid resource leaks
    }

	private static void RotateMatrix(int[][] a) {
		// Transpose Matrix (swap rows and columns)
      for (int i = 0; i < a.length; i++) {
          for (int j = i; j < a.length; j++) {
              int temp = a[i][j]; // Temporary variable for swapping
              a[i][j] = a[j][i];  // Swap elements across the main diagonal
              a[j][i] = temp;
          }
      }

      // Display the Transposed Matrix
      System.out.println("Transpose Matrix");
      for (int[] element : a) {
          for (int j = 0; j < element.length; j++) {
              System.out.printf("\t" + element[j]); // Print the transposed array
          }
          System.out.println("\n"); // Newline after each row
      }

      // Rotate Matrix Clockwise
      for (int i = 0; i < a.length; i++) {
          for (int j = 0; j < a[0].length / 2; j++) {
              int temp2 = a[i][j]; // Temporary variable for swapping
              a[i][j] = a[i][3 - j - 1]; // Swap elements to rotate the matrix
              a[i][3 - j - 1] = temp2;
          }
      }

      // Display the Rotated Matrix (Clockwise)
      System.out.println("Rotate Matrix");
      for (int[] element : a) {
          for (int j = 0; j < element.length; j++) {
              System.out.printf("\t" + element[j]); // Print the rotated array
          }
          System.out.println("\n"); // Newline after each row
      }

      // Rotate Matrix by 90 Degrees Anti-Clockwise
      System.out.println("Rotate Matrix by 90 Degrees Anti-clockwise: \n");
      for (int i = 2; i >= 0; i--) {
          for (int j = 0; j <= 2; j++) {
              System.out.print("" + a[j][i] + "\t"); // Print the rotated matrix in anti-clockwise direction
          }
          System.out.println("\n"); // Newline after each row
      }	
	}	
}