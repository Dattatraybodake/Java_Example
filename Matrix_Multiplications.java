package array_examples;
import java.util.Scanner;

public class Matrix_Multiplications {
	
	// Accept the Elements Form User
	private static void addmatrix1(int[][] a) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Insert the Elements in Firts Matrix:");
		for(int i=0; i<a.length;i++)
		{
			for(int j=0; j<a[i].length; j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
	}

	private static void addmatrix2(int[][] b) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Insert the Elements in Second Matrix:");
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
	}

	//Display the Elements form matrix
	private static void displaymatrix1(int[][] a) {
		System.out.println("Matrix:1- Elements: ");
		for(int i=0; i<a.length;i++)
		{
			for(int j=0; j<a[i].length; j++)
			{
				System.out.printf("\t"+a[i][j]);
			}
			System.out.printf("\n");
		}
	}

	private static void displaymatrix2(int[][] b) {
		// TODO Auto-generated method stub

		System.out.println("Matrix:2- Elements");
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
				System.out.printf("\t"+b[i][j]);
			}
			System.out.printf("\n");
		}	
	}

	//Logic for Matrix Multiplication
	private static void multiplication(int[][] a, int[][] b, int[][] c) {
		System.out.println("Matrix Multiplication:");
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				c[i][j]=0;
				for(int k=0;k<3;k++)
				{
					c[i][j]+=a[i][k]*b[k][j];
				}
			}
		}	
	}
	private static void displayresult(int[][] a, int[][] b, int[][] c) {
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
				System.out.printf("\t"+c[i][j]);
			}
			System.out.println("\n");
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[][]a=new int[3][3];
		int[][]b = new int[3][3];
		int[][]c= new int[3][3];
		int choise;
		do
		{
			System.out.println("Enter the Choise number: ");
			choise=sc.nextInt();

			switch(choise)
			{
			case 1:
				addmatrix1(a);
				addmatrix2(b);
				break;
			case 2:
				displaymatrix1(a);
				displaymatrix2(b);
				break;
			case 3:
				multiplication(a,b,c);
				displayresult(a,b,c);
				break;
			default:
				System.out.println("Wrong input");
			}
		}while(choise!=0);
	}
}