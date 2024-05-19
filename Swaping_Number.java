package basic;
import java.util.Scanner;

public class Swaping_Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		
		// Prompting user to enter two numbers
		System.out.println("Enter two numbers: ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		//Step 1: Swapping without using a third variable
		a = a + b;
		b = a - b;
		a = a - b;
		
		// Step 2: Swapping using a third variable
//		int t = a;
//		a = b;
//		b = t;
		
		// Printing the exchanged values
		System.out.println("The exchange value of A: " + a + "\t B: " + b);
	}
}