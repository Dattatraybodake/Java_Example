package array_examples;

import java.util.Scanner;

public class Array_Matrix_Rotaion {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in); // Create a Scanner object for user input

		int a[][]=new int[3][3]; // Declare a 2D array of size 3x3 to store image pixels

		System.out.println("Enter the elements in array ");
		for(int i=0;i<a.length;i++) 
		{
			for(int j=0;j<a[i].length;j++) 
			{
				a[i][j]=sc.nextInt(); // Populate the 2D array with user input
			}
		}

		System.out.println("Display the Array");
		for(int i=0;i<a.length;i++) 
		{
			for(int j=0;j<a[i].length;j++) 
			{
				System.out.printf("\t"+a[i][j]); // Print the original array
			}
			System.out.println("\n");
		}

		// Transpose Matrix
		for(int i=0;i<a.length;i++) 
		{
			for(int j=i;j<a.length;j++) 
			{
				int temp=a[i][j]; // Swap elements across the main diagonal
				a[i][j]=a[j][i];
				a[j][i]=temp;
			}
		}

		System.out.println("Transpose Matrix");
		for(int i=0;i<a.length;i++) 
		{
			for(int j=0;j<a[i].length;j++) 
			{
				System.out.printf("\t"+a[i][j]); // Print the transposed array
			}
			System.out.println("\n");
		}

		// Rotate Matrix
		for(int i=0;i<a.length;i++) 
		{
			for(int j=0;j<a[0].length/2;j++) 
			{
				int temp2=a[i][j]; // Rotate elements clockwise by swapping columns
				a[i][j]=a[i][3-j-1];
				a[i][3-j-1]=temp2;
			}
		}

		System.out.println("Rotate Matrix");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.printf("\t"+a[i][j]); // Print the rotated array
			}
			System.out.println("\n");
		}
	}

}
