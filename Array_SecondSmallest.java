package array_examples;
import java.util.Scanner;

public class Array_SecondSmallest {
	private static void insertElements(int[] a, Scanner sc) {
		System.out.println("Enter the Element for Insert into Array: ");
		for(int i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}
	}

	public static void displayElements(int[] a)
	{
		System.out.println("The Array Elements accepted from User is: ");
		for(Object obj: a)
		{
			System.out.println(obj);
		}	
	}
	public static void findElement(int[] arr)
	{
		if(arr.length<2)
		{
			System.out.println("Array Should Have atleast 2 elements...");
			return;
		}

		//Step: Initialize the two smallest values
		int min1= Integer.MAX_VALUE;
		int min2 = Integer.MAX_VALUE;

		//Step: Traverse the array
		for (int element : arr) {
			if(element < min1)
			{
				min2=min1;
				min1=element;
			}
			else if(element<min2 && element!=min1)
			{
				min2=element;
			}
		}

		// Step: Print the second smallest element
		if(min2==Integer.MAX_VALUE)
		{
			System.out.println("There is Not Smallest Value.");
		}
		else
		{
			System.out.println("The Second Smallest Number is: "+min2);
		}
	}
	public static void main(String[] args)
	{
		int []arr= new int[5];
		Scanner sc = new Scanner(System.in);

		// Method Calling
		insertElements(arr, sc);
		displayElements(arr);
		findElement(arr);
		
		// Close the scanner
		sc.close();
	}	
}