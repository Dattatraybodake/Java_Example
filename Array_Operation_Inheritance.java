package inheritance;

import java.util.Scanner;

interface ArrayOperation
{
	void performOperation(int x[]);
}

class Sorting implements ArrayOperation
{
	public void performOperation(int x[])
	{
		for(int i=0;i<x.length;i++)
		{
			for(int j=i+1;j<x.length;j++)
			{
				if(x[i]>x[j])
				{
					int temp=x[i];
					x[i]=x[j];
					x[j]=x[i];
				}

			}
		}
		for(int i=0;i<x.length;i++)
		{
			System.out.println(+x[i]);
		}
	}

}

class Insertion implements ArrayOperation
{
	public void performOperation(int x[])
	{


	}
}
class Deletion implements ArrayOperation
{
	int ind;
	void setIndex(int index)
	{
		ind=index;
	}
	public void performOperation(int x[])
	{


		for(int i=0;i<x.length;i++)
		{
			int index=x[0];
			if(index==x[i])
			{
				index--;
				for(int j=6;j<x.length;j--)
				{
					x[i]=x[i+1];
				}
			}
		}
		System.out.println("Display After Delete");
		for(int i=0;i<x.length-1;i++)
		{
			System.out.println("Array= "+x[i]);
		}
	}
}

public class Array_Operation_Inheritance{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a[],i;
		a=new int[6];
		System.out.println("Enter the Array Elements");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}

		System.out.println("Display the Array Elements");
		for(i=0;i<a.length;i++)
		{
			System.out.println("The Array is: "+a[i]);
		}


		do
		{
			System.out.println("Enter your Choise: ");
			int choise=sc.nextInt();
			switch (choise)
			{
			case 1:
				System.out.println("The Sorting Array Are: ");
				Sorting sr=new Sorting();
				sr.performOperation(a);
				break;
			case 2: 
				System.out.println("The Insertion of Array is: ");
				Insertion in=new Insertion();
				in.performOperation(a);
				break;
			case 3:
				System.out.println("The Deletion of Array is: ");
				System.out.println("Enter the index to be delete");
				int index=sc.nextInt();
				Deletion dl=new Deletion();
				dl.setIndex(index);
				dl.performOperation(a);
				break;
			default:
				System.out.println("Wrong Input");
				break;
			}
		}while(i!=0);
	}
}
