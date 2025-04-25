package exception_handling;
class Division
{
	void setDiv(int x,int y) throws ArithmeticException
	{
		int c=x/y;
		System.out.println("The Result is:" +c);
	}
}

public class Throws_keyword_Example {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Task 1");
		System.out.println("task 2");

		//		Division dv=new Division();
		//		dv.setDiv(12, 0);
		// The above statement occur exception that is, ArithmeticException.so jvm block the Above xcpetion code.
		// So solution is exception part taking in try block.

		try
		{
			Division dv=new Division();
			dv.setDiv(8, 0);
		}
		catch(ArithmeticException ex)
		{
			System.out.println("\t"+ex);
		}
		System.out.println("Task 3");
		System.out.println("task 4");
	}
}
