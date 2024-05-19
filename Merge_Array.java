package constructor;
import java.util.Scanner;
class Merger
{
	int a[];
	int b[];
	int c[];
	Merger(int a[],int b[],int c[])
	{
		this.a=a;
		this.b=b;
		this.c=c;
	}
	void showArray()
	{
		System.out.println("Display First array Elements");
		for(int i=0;i<a.length;i++)
		{
			System.out.println("The FIrst Array is: "+a[i]);
		}

		System.out.println("Display Second array Elements");
		for(int i=0;i<b.length;i++)
		{
			System.out.println("The FIrst Array is: "+b[i]);
		}
	}

	void mergertwoArray()
	{
		int start=0, end=b.length-1;
		for (int j = 0; j <c.length; j++) 
		{
			if(j%2==0)
			{
				c[j]=a[start];
				start++;
			}
			else 
			{
				c[j]=b[end];
				end--;
			}     
		}
		System.out.println("Merger Array Are: ");
		for(int i = 0;i<c.length;i++)
		{
			System.out.println("Merge Array Are: "+c[i]);
		}
	}
}

public class Merge_Array {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int a[] = new int[5];
		int b[] = new int[5];
		int c[] = new int[10];

		Merger mr=new Merger(a,b,c);
		System.out.println("Enter the Elements in First array: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();		
		}

		System.out.println("Enter the Elements in Second array: ");
		for(int i=0;i<b.length;i++)
		{
			b[i]=sc.nextInt();
		}
		mr.showArray();
		mr.mergertwoArray();
	}
}

