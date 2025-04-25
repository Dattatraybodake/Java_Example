package exception_handling;

public class Null_Pointer_Exception
{
	static int a[];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1");
		try
		{
			a[0]=100;
			System.out.println(+a[0]);
		}
		catch(NullPointerException ex)
		{
			System.out.println("Ex: "+ex);
		}
		System.out.println("2");
	}
}