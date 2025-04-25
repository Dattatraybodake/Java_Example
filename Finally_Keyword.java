package exception_handling;
import java.util.Scanner;

public class Finally_Keyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (Scanner sc = new Scanner(System.in)) {
			int a,b;

			System.out.println("Enter the value: ");
			a=sc.nextInt();
			b=sc.nextInt();
			try
			{
				int c=a/b;
				System.out.println("The C= "+c);
			}
			catch(ArithmeticException ex)
			{
				System.out.println("These Exception Occur: "+ex);
			}
			finally
			{
				System.out.println("I am Finally block");
			}
		}
		System.out.println("task 3");
		System.out.println("Task 4");
	}
}