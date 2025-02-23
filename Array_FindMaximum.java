package array_examples;
import java.util.Scanner;
class Array_FindMaximum
{
	private static void insertElements(int[] a, Scanner sc) {
		System.out.println("Enter the element of array");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		sc.close();
	}
	private static void displayelements(int[] a) {
		System.out.println("The Array Elements are: ");
		for (int element : a) {
			System.out.println(element);
		}
	}
	private static int findmaximum(int[] a) {
		int max;
		max=a[0];
		for(int i=1; i<a.length; i++)
		{
			if(a[i]>max)
			{
				max = a[i];
			}
		}
		return max;
	}

	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];

		insertElements(a, sc);
		displayelements(a);
		System.out.println("The Maximum Element in Array Are: "+findmaximum(a));
	}	
}