package exception;

public class Number_Format_Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*
		System.out.println("1");
		System.out.println("2");
		
			String s="12345 ";
			int a=Integer.parseInt(s);
			System.out.println("a: "+a);
				
		System.out.println("3");
		System.out.println("4");
		System.out.println("5");
		System.out.println("6");
		
		Above Program generate Exception because we will try to write / convert value number to string all value converted but 
		space value or any symbol cannot be changed  and generate exception for us... and Break the code and not display next output.
		to solve this error, we use try catch block;
	*/
		
		System.out.println("1");
		System.out.println("2");
		try
		{
			String s="12345 ";
			int a=Integer.parseInt(s);
			System.out.println("a: "+a);
		}
		catch(NumberFormatException ex)
		{
			System.out.println(""+ex);
		}
		System.out.println("3");
		System.out.println("4");
	}
}