package array_examples;
import java.util.*;

public class Array_Maximum_Element 
{
	public static void main(String x[]) 
	{
		Scanner xyz = new Scanner(System.in);
		int a[]; // Array declaration

		// Initializing the array with a size of 5
		a = new int[5];

		System.out.println("Enter values in array");
		for (int i = 0; i < a.length; i++) 
		{
			// Taking input values from the user and storing them in the array
			a[i] = xyz.nextInt();
		}

		int max = a[0]; // Initializing max with the first element of the array
		System.out.println("Display array values");
		for (int i = 0; i < a.length; i++) 
		{	
			// Printing the array values along with their indices
			System.out.printf("a[%d] ---->%d\n", i, a[i]);

			// Finding the maximum value in the array
			if (a[i] > max) 
			{ 
				max = a[i];
			}
		}

		// Printing the maximum value found in the array
		System.out.printf("Maximum value is %d\n", max);
	}
}
