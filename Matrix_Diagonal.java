package array_examples;
import java.util.Scanner;
public class Matrix_Diagonal
{
	// Method for Accepth the elements form User.
	private static void addelement(int[][] matrix1)
	{
		Scanner xyz  = new Scanner(System.in);
		for(int i=0; i<matrix1.length;i++)
		{
			for(int j=0; j<matrix1[i].length; j++)
			{
				matrix1[i][j]=xyz.nextInt();
			}
		}
		xyz.close();
	}

	// Method For dipslay The Elements
	private static void displayElement(int[][] matrix)
	{
		for (int[] element : matrix) {
			for(int j=0; j<element.length; j++)
			{
				System.out.printf("\t"+element[j]);
			}
			System.out.printf("\n");
		}
	}

	// Method For Display The Diagonal Elements
	private static void diagonal(int[][] matrix)
	{
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(i==j)
				{
					System.out.print("\t"+matrix[i][j]);
				}
			}
			System.out.print("\n");
		}
	}
	
	// Method for display the Lower Diagonal Elements
	private static void lowerdiagonal(int[][]Matrix)
	{
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(i>j)
				{
					System.out.print("\t"+Matrix[i][j]);
				}
				
				//if you wants To print zero at lower diagonal
				/*
				 * if(i>j) printf("0"); else printf("%d\t",Matrix[i][j]);
				 */
			}
			System.out.print("\n");
		}
	}
	
	private static void upperdiagonal(int[][] Matrix) 
	{
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(i<j)
					System.out.printf("%d\t",Matrix[i][j]);
				else
					System.out.printf(" ");

					// To print zero at Upper diagonal
					/*
					 * if(i<j) printf("0 \t"); else printf("%d\t",Matrix[i][j]);
					 */
			}
			System.out.printf("\n");
		}
	}
	
	// Main Method to Call The Above Methods
	public static void main(String x[])
	{
		int[][] a=new int[3][3];
		int choice;
		Scanner sc= new Scanner(System.in);
		do
		{
			System.out.print("Enter your choice: ");
			choice = sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Insert the Element to Matrix:");
				addelement(a);
				break;
			case 2: 
				System.out.println("Display Upper Triangular matrix");
				displayElement(a);
				break;
			case 3:
				System.out.println("Display Diagonal matrix");
				diagonal(a);
				break;
			case 4:
				System.out.println("Display Lower Triangular matrix");
				lowerdiagonal(a);
				break;
			case 5:
				System.out.println("Display Upper Triangular matrix");
				upperdiagonal(a);
				break;
			default:
				System.out.println("Wrong Input Choise");
			}
		}
		while(choice!= 0);
		sc.close();
	}
}