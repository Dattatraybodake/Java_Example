package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input_Mismatch{

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner scc = new Scanner(System.in)) {
			int a,b;
			System.out.println("Enter any character");
			try
			{
				
			
			a=scc.nextInt();
			b=scc.nextInt();
			System.out.println("The Value is: "+a+"\t "+b);
			} catch(InputMismatchException ex)
			{
				System.out.println("These Exception  occur"+ex);
			}
		}
		System.out.println("Task3");
		System.out.println("task4");
	}
}
	