package array_examples;

// Importing necessary classes
import java.util.Scanner;

// Main class for array operations
public class Array_Operation_Sort_Reverse_Odd_Even_Sum
{
	public static void main(String[] args) 
	{
		// Creating a scanner object for input
		Scanner sc = new Scanner(System.in);

		// Declaring variables
		int a[]; // Array to store elements
		int sum = 0; // Variable to store sum of elements
		a = new int[5]; // Initializing array of size 5
		int choise = 0; // Variable to store user's choice

		// Displaying menu for user input
		System.out.println(
							"Case 1: Accepts elements into the array.\r\n"
							+ "Case 2: Displays the elements of the array.\r\n"
							+ "Case 3: Reverses the elements of the array.\r\n"
							+ "Case 4: Sorts the elements of the array in ascending order.\r\n"
							+ "Case 5: Sorts the elements of the array in descending order.\r\n"
							+ "Case 6: Calculates the sum of elements in the array.\r\n"
							+ "case 7: Display The Even Numbers from array.\r\n"
							+ "case 8: Display the odd elements from an array.");
		
		// Menu-driven loop to perform array operations.
		do 
		{
			System.out.println("Enter Choice to Perform Operation on Array: ");
			choise = sc.nextInt();

			// Switch case to perform selected operation
			switch (choise) 
			{
			case 1: // Accept elements into the array
				System.out.println("\n==========Accept the Elements==========");
				System.out.println("Enter the Elements: ");
				for (int i = 0; i < a.length; i++)
				{
					a[i] = sc.nextInt();
				}
				System.out.println("Elements Accepted Successfully...");
				break;

			case 2: // Display array elements
				System.out.println("\n==========Display Array Elements==========");
				for (int i = 0; i < a.length; i++) 
				{
					System.out.println("\n" + i + "th index Value is= \t" + a[i]);
				}
				break;

			case 3: // Reverse array elements
				System.out.println("\n==========Reverse Array Elements==========");
				for (int i = 0, j = 4; i < 2; i++, j--) 
				{
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
				for (int i = 0; i < a.length; i++) 
				{
					System.out.println("The element= " + a[i]);
				}
				break;

			case 4: // Sort array elements in ascending order
				System.out.println("\n==========Sort Array Elements in Ascending Order==========");
				System.out.println("Sort the elements ");
				for (int i = 0; i < a.length; i++) 
				{
					for (int j = i + 1; j < a.length; j++)
					{
						if (a[i] > a[j]) {
							int temp = a[i];
							a[i] = a[j];
							a[j] = temp;
						}
					}
					System.out.println("\n" + i + "th index Value is= \t" + a[i]);
				}
				break;

			case 5: // Sort array elements in descending order
				System.out.println("\n==========Sort Array Elements in Descending Order==========");
				for (int i = 0; i < a.length; i++) {
					for (int j = i + 1; j < a.length; j++)
					{
						if (a[i] < a[j]) 
						{
							int temp = a[i];
							a[i] = a[j];
							a[j] = temp;
						}
					}
					System.out.println("\n" + i + "th index Value is= \t" + a[i]);
				}
				break;

			case 6: // Calculate sum of array elements
				System.out.println("\n==========Calculate Sum of Array Elements==========");
				for (int i = 0; i < a.length; i++) 
				{
					sum += a[i];
				}
				System.out.println("The sum of all array elements is: " + sum);
				break;
				
			case 7: // Operation to display even elements from the array
				System.out.println("Display The Even Number using Array");
				for(int i=0;i<a.length;i++)
				{
					if(a[i]%2 == 0)
					{
						System.out.println("This is Even Element from Array: "+a[i]);
					}
				}
			break;
			
			case 8: // Operation to display odd elements from the array
				System.out.println("Display The Odd Elements form an Array: ");
				for(int i=0;i<a.length;i++)
				{
					if(a[i]%2 != 0)
					{
						System.out.println("This is Even Element from Array: "+a[i]);
					}
				}
			break;
				
			default: // Display message for invalid choice
				System.out.println("Invalid Choise Number Entered.");
			}	
		} while (choise != 0); // Continue loop until user chooses to exit
	}
}
