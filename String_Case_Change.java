package string; // Package declaration indicating the package name

// Class to demonstrate changing case of a string
class String_Case_Change
{
    // Main method
    public static void main(String []args) 
    {
        String s = "Dattatray Bodake"; // Input string
        
        // Convert the string to upper case
        String upper = s.toUpperCase();
        
        // Convert the string to lower case
        String lower = s.toLowerCase();

        // Print the upper case string
        System.out.println("Uppercase: " + upper);
        
        // Print the lower case string
        System.out.println("LowerCase: " + lower);
    }
}