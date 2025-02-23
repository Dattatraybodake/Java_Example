import java.util.Scanner;

public class Array_DeleteElement {

	// Method to insert elements into the array
	private static void insertElement(int[] a, Scanner get) {
		int i=0;
		System.out.println("Enter the Element for Insert in the Array:");
		for(i=0;i<a.length;i++)
		{
			a[i]=get.nextInt();
		}
	}

	// Method to display elements of the array
	private static void displayElement(int[] a) {
		System.out.println("The Array Elements Are: ");
		for(int element:a)
		{
			System.out.println(element);
		}
	}

	// Method to delete an element from the array by index
	private static int[] deleteElement(int[] a, int index) {
		// Check if the index is valid
		if (index < 0 || index >= a.length) {
			System.out.println("Invalid index. No element deleted.");
			return a; // Return the original array if index is invalid
		}

		// Create a new array with one less element
		int[] newArray = new int[a.length - 1];

		// Copy elements before the deleted index
		for (int i = 0; i < index; i++) {
			newArray[i] = a[i];
		}

		// Copy elements after the deleted index, shifting them left
		for (int i = index + 1; i < a.length; i++) {
			newArray[i - 1] = a[i];
		}

		return newArray; // Return the new array with the element removed
	}
	public static void main(String[] args)
	{
		int choise=0;
		int index=0;
		Scanner sc=new Scanner(System.in);
		int[] a=new int[5];
		
		do
		{
			System.out.println("Enter the Choise Number: ");
			choise=sc.nextInt();
			switch(choise)
			{
			case 1:
				insertElement(a, sc);
				break;
			case 2:
				displayElement(a);
				break;
			case 3: 
				System.out.println("Enter the index to delete element: ");
				index = sc.nextInt();
				a = deleteElement(a, index);  // Re-assign array after deletion
				break;
			default:
				if (choise != 0) {
					System.out.println("Wrong Choice");
				}			}
		}while(choise!=0);	
		sc.close(); // Close the scanner to avoid resource leak
	}
}