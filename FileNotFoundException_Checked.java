package exception_handling;
import java.io.*;

public class FileNotFoundException_Checked {
	public static void main(String[] args)
	{
		try
		{
			FileReader f=new FileReader("dattatray.pdf");
		}
		catch(IOException ex)
		{
			System.out.println("The Exception is: "+ex);
		}	
	}
}