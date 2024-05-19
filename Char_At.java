package string; // Package declaration indicating the package name

// Class to demonstrate accessing characters of a string using charAt() method
class Char_At
{
	// Main method
	public static void main(String[] args) 
	{
		String s = "Dattatray"; // Input string

		int l = s.length(); // Length of the string

		// Loop through each character of the string
		for (int i = 0; i < l; i++) 
		{
			char ch = s.charAt(i); // Get the character at index i
			System.out.printf("%c = s[%d]\n", ch, i); // Print the character and its index
		}
	}
}
