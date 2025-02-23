package array_examples; // Declares that this class belongs to the "array" package
import java.util.Scanner; // Imports Scanner class from java.util package

public class Array_JaggedDemo {
	private static void insertElements(int[][] a, Scanner sc) {
		System.out.println("Enter the elements are insert into jagged Array: ");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]= sc.nextInt();
			}
		}
	}

	private static void displayElements(int[][] a) {
		System.out.println("Display the Array Elements: ");
		for(int[] element:a)
		{
			for(int j=0;j<element.length;j++) {
				System.out.print("\t"+element[j]); // Print each element of the jagged array
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); // Create a Scanner object for user input

		// Declare a jagged array of size 3x[], where the size of each row varies
		int a[][]=new int[3][];

		a[0]=new int[1]; // Row 0 has 1 element
		a[1]=new int[3]; // Row 1 has 3 elements
		a[2]=new int[2]; // Row 2 has 2 elements

		insertElements(a, sc);
		displayElements(a);
	}
}