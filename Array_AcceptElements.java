package array_examples;
import java.util.Scanner;

public class Array_AcceptElements {
	
	public static void main(String[] args) {
		/*
		//Method 1: Accept the Elements from user declaration of array.
		int a[]=new int[]{1,5,6,4,8};
		// Display The Array elements
		System.out.println("Display the Array Elements");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		 */

		// Method 2: Accept The Element From User Using Scanner Method.
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		
		System.out.println("Accept The Array Elements From User");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}

		//Display the Array Elements.
		System.out.println("Display the Array Elements");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(+a[i]);
		}
		sc.close();
	}
}