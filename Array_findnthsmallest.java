package array_examples;
import java.util.*;
public class Array_findnthsmallest {
	
	private static void insertElement(int[] a, Scanner sc) {
		System.out.println("Enter the Elements in Array: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
	}
	
	private static void displayElements(int[] a) {
		System.out.println("Display the Element in Array: ");
		for(int elements:a) {
			System.out.println(elements);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int [] a=new int[5];
		insertElement(a, sc);
		displayElements(a);
	}
}