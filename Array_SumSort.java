package array_examples;
import java.util.Scanner;
public class Array_SumSort {
	private static void InsertElement(int[] a, Scanner sc) {
		System.out.println("Enter the elements that are Insert Into Array: ");

		for(int i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}
	}

	private static void displayElements(int[] arr)
	{
		System.out.println("\nThe Array Elements are: ");
		for(int elements: arr)
		{
			System.out.println(elements);
		}
	}

	private static void sortAscending(int[] a) {
		System.out.println("\nThe Ascending Order Sorting Array Elements are: ");
		for(int i = 0; i < a.length; i++) {
			for(int j = i + 1; j < a.length; j++) {
				if(a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			System.out.println(a[i]);
		}
	}

	private static void sortDescending(int[] a) {
		System.out.println("\nThe Ascending Order Sorting Array Elements are: ");
		for(int i = 0; i < a.length; i++) {
			for(int j = i + 1; j < a.length; j++) {
				if(a[i] < a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			System.out.println(a[i]);
		}
	}

	private static int findElementSum(int[] a) {
		int sum = 0;
		for(int element: a)
		{
			sum +=element;
		}
		return sum;
	}




	public static void main(String[] args) {
		int a[] = new int[5];
		Scanner sc = new Scanner(System.in);
		InsertElement(a, sc);
		displayElements(a);
		sortAscending(a);
		sortDescending(a);
		int ElementSum = findElementSum(a);
		System.out.println("\nThe sum of the elements is: " + ElementSum);
	}

	


}
