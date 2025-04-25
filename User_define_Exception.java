package exception_handling;
import java.util.Scanner;
class NumberException extends Exception
{
	private static final long serialVersionUID = 1L;

	public String getOdd()
	{
		return "odd";
	}
}
class CheckException
{
	void verifyOdd(int no) throws NumberException
	{
		if(no%2!=0)
		{
			NumberException ne=new NumberException();
			throw ne;
		}
		else
		{
			System.out.println("Even Number");
		}
	}
}
public class User_define_Exception {
	public static void main(String[] args) throws NumberException {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			System.out.println("Task 1");
			System.out.println("task 2");
			try
			{
				int a=sc.nextInt();
				CheckException ne=new CheckException();
				ne.verifyOdd(a);
			}
			catch(Exception ex)
			{
				System.out.println("\t "+ex);
			}
		}
		System.out.println("Task 3");
		System.out.println("Task 4");
	}
}

// In Above code, we Will Print first 2 Statements And Exception Occur.
// We are write, That code in try catch block and then if we store odd number then Show Exception Name And if we show Even Number
// then Even Number is Display