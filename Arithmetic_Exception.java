package exception;
public class Arithmetic_Exception {
	public static void main(String[] args) {
		/* 
		int a,b;
		System.out.println("1");
		System.out.println("2");
		a=10;
		b=0;
			int c=a/b;
			System.out.println("Division: "+c);		
			System.out.println("Logic 1: ");
			System.out.println("Logic 2: ");

		   Above Program generate error because we will try to value is divisible by 0.
		   and in java any value divisible by zero then exception is found.
		   to solve above exception we solve using try and catch block.
		 */

		int a,b;
		a=10;
		b=0;
		System.out.println("The A value is: "+a);
		System.out.println("The B Value is: "+b);
		try
		{
			int c=a/b;
			System.out.println("Division: "+c);	
		}
		catch(ArithmeticException e)
		{
			System.out.println("Above Exception Occur in Program: " +e);		
		}
		System.out.println("Logic 1: ");
		System.out.println("Logic 2: ");
	}

}
