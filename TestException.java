package exception_handling;

import java.util.Scanner;

public class TestException {
	private static int age;
	
	static void validate() throws InvalidAgeException
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Age: ");
		age= sc.nextInt();
		if(age<18)
		{
			throw new InvalidAgeException("Invalid age!. You are not Eligible");
		}
		else
		{
			System.out.println("Welcome you are validate");
		}
	}
public static void main(String[] args) {
		try
		{
			validate();
		}
		catch(Exception ex)
		{
			System.out.println("\"Caught an Exception: \\n \""+ex);
		}
	}
}