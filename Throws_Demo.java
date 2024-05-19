package exception;

public class Throws_Demo {
	static void throwOne() throws IllegalAccessException
	{
		System.out.println("Inside throwOne.");
		throw new IllegalAccessException("demo");
		
	}
	public static void main(String[] args) throws IllegalAccessException {
		// TODO Auto-generated method stub
		try
		{
			throwOne();

		}catch(IllegalAccessException e)
		{
			System.out.println("caught "+e);
		}
	}

}
