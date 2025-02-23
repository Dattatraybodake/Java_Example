package array_examples;
import java.util.Scanner;

public class Array_SearchElement {
	
    // Method to insert elements into the array
	private static void insertElement(int[] a, Scanner get) {
		System.out.println("Enter the Element for Insert into Array: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=get.nextInt();
		}	
	}

    // Method to display elements of the array
	private static void displayElement(int[] a) {
		System.out.println("The Array Elements Are:");
		for(int element: a)
		{
			System.out.println(element);
		}
	}

    // Method to search for an element (not yet implemented properly)
	private static boolean searchElement(int[] a,int value) {

		for(int i=0;i<a.length;i++)
		{
			if(a[i]==value)
			{
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int choise=0;
		int value=0;
		Scanner sc = new Scanner(System.in);
		int[] a= new int[5];
		do
		{
			System.out.println("Enter your Choise: ");
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
				
				System.out.println("Enter the value For you Serach: ");
				value=sc.nextInt();
				boolean found= searchElement(a,value);
				if(found)
				{
					System.out.println("The value is Found in Array");
				}
				else
				{
					System.out.println("The Value is Not Found In Array: ");
				}
				break;
			default:
				if(choise!=0)
				{
					System.out.println("Wrong Choise Entered");
				}
			}
		}while(choise!=0);
		sc.close(); // Close the scanner to avoid resource leak
	}
}