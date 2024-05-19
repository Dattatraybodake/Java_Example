package basic;
import java.util.Scanner;

public class Multiplication_Table_nth_Value {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);  

		// Enter number n for which we have to print the multiplication table.  
		System.out.print("Enter number: ");   

		//reading a number whose table is to be print  
		int num=sc.nextInt();  

		System.out.print("Enter range: ");       
		int range=sc.nextInt();  
		int i = 1;  

		//while loop starts from 1 and execute up to nth range,  
		while (i <= range)   
		{  
			//prints table of the entered number up to the range  
			System.out.println(num + " * " + i + " = "+ num * i);  

			//increments the value of i by 1  
			i++;  
		}  
	}
}
