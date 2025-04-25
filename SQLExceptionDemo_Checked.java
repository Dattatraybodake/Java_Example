package exception_handling;
import java.sql.Connection;
import java.sql.DriverManager;

public class SQLExceptionDemo_Checked {
	public static void main(String[] args)
	{
		try
		{
			Connection conn= DriverManager.getConnection("invalidurl","root","root");
		}
		catch(Exception e)
		{
			System.out.println("The Exception is"+e);
		}
	}
}