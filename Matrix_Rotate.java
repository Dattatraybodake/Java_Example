package array_examples;

import java.util.Scanner;

public class Matrix_Rotate {
	public static void main(String x[])
	{
		Scanner sc=new Scanner(System.in);
		int a[][]=new int[3][3];
		int i,j,temp;

		System.out.println("Enter the elements in array: ");
		//Accept the Array From the use
		for( i=0;i<a.length;i++)
		{
			for(j=0;j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}

		// Display the Array
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a[i].length;j++)
			{
				System.out.printf("\t"+a[i][j]);
			}
			System.out.println("\n");
		}

		for(i=0;i<a.length;i++)
		{
			for(j=i;j<a.length;j++)
			{
				temp=a[i][j];
				a[i][j]=a[j][i];
				a[j][i]=temp;
			}
		}

		System.out.println("The Transpose Matrix Are: ");
		// The Transpose Matrix are:
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a[i].length;j++)
			{
				System.out.print("\t"+a[i][j]);
			}
			System.out.println("\n");
		}

		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a[0].length/2;j++)
			{
				int temp2=a[i][j];
				a[i][j]=a[i][3-j-1];
				a[i][3-j-1]= temp2;
			}
		}

		//Display The rotate Matrix
		System.out.println("Display the rotated Matrix clockwise");
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a[i].length;j++)
			{
				System.out.print("\t"+a[i][j]);
			}
			System.out.println("\n");
		}
	}
}
