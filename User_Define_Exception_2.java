package exception;

class UserDefinedException extends Exception  
{  
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UserDefinedException(String str)  
    {  
        // Calling constructor of parent Exception  
        super(str);  
    }  
}  
// Class that uses above MyException  
public class User_Define_Exception_2   
{  
    public static void main(String args[])  
    {  
        try  
        {  
            // throw an object of user defined exception  
            throw new UserDefinedException("This is user-defined exception");  
        }  
        catch (UserDefinedException ude)  
        {  
            System.out.println("Caught the exception");  
            // Print the message from MyException object  
            System.out.println(ude.getMessage());  
        }  
    }  
}   