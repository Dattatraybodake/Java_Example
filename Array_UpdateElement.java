package array_examples;
import java.util.Scanner;
public class Array_UpdateElement {
	private static void addElement(int[] a, Scanner sc) {
		System.out.println("Insert Elements Into Array: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
	}
	private static void displayElement(int[] a) {
		System.out.println("The Array Elements Are:");
		for(int Element: a)
		{
			System.out.println(Element);	
		}
	}
	private static void updateElement(int[] a,int index, int newValue)
	{
		if(index >=0 && index<=a.length)
		{
			a[index]= newValue;
		}
		else
		{
			System.out.println("Index out of bound");
		}
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int[] a = new int[5];
		int choise = 0;
		int index=0; int newvalue=0;
		do
		{
			System.out.println("Enter your Choise Number: ");
			choise=sc.nextInt();
			switch(choise)
			{
			case 1:
				addElement(a, sc);
				break;
				
			case 2:
				displayElement(a);
				break;
				
			case 3:
				System.out.println("Enter the Index: ");
				index=sc.nextInt();
				
				System.out.println("Enter the Value:");
				newvalue= sc.nextInt();
				updateElement(a, index, newvalue);
				break;
					
			default:
				System.out.println("Wrong choise you are entered.");
			}
		}while(choise!=0);
	}
}