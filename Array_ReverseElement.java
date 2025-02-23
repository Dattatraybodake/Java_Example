package array_examples;
import java.util.Scanner;

public class Array_ReverseElement
{
	private static void addElement(int a[], Scanner xyz)
	{
		int i;
		System.out.println("Enter the Elements in Array: ");
		for(i=0; i<a.length;i++)
		{
			a[i]=xyz.nextInt();	
		}
	}

	private static void displayElement(int[] a) {
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
	private static void reverseElement(int[] a) {
		for (int i = 0, j = 4; i < 2; i++, j--)
		{
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
		}
		for (int element : a) {
			System.out.println("The element= " + element);
		}
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a[]=new int[5]; // Initializing array of size 5
		int choise = 0; // Variable to store user's choice
		do
		{
			System.out.println("Enter Choice to Perform Operation on Array: ");
			choise = sc.nextInt();

			switch (choise)
			{
			case 1:
				addElement(a,sc);
				break;

			case 2: 			
				displayElement(a);
				break;

			case 3: // Reverse array elements
				System.out.println("\n==========Reverse Array Elements==========");
				reverseElement(a);
				break;

			default: 
				System.out.println("Invalid Choise Number Entered.");
			}
		} while (choise != 0); // Continue loop until user chooses to exit
	}
}