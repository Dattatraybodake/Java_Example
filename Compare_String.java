package string; // Package declaration indicating the package name

// Class to demonstrate comparing two strings lexicographically
public class Compare_String {

	// Main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = new String("Datta"); // First string
		String s1 = new String("datta"); // Second string

		System.out.println("First String= "+s);
		System.out.println("Second String: "+s1);
		// Compare the strings lexicographically
		int result = s1.compareTo(s);

		// Check if the strings are the same or different
		if (result == 0) {
			System.out.println("String is Same"); // Print if strings are same
		} else {
			System.out.println("Above String is Different"); // Print if strings are different
		}
	}
}
