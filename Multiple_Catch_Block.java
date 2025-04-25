package exception_handling;

public class Multiple_Catch_Block {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[5];
		try
		{
			a[5]=506/0;
		}
		catch(ArithmeticException ex)
		{
			System.out.println("These Excption Occur="+ex);
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("These Exception Occur= "+ex);
		}
		catch(Exception e)
		{
			System.out.println("Parent Exception Occur="+e);
		}
		System.out.println("rest of the code");
	}
}