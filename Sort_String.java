package string;

public class Sort_String {
	public static void main(String[] args) {
		String original = "dattatray"; // Original string

		int j = 0; // Variable for iteration
		char temp = 0; // Temporary variable for swapping

		char[] chars = original.toCharArray(); // Convert string to character array

		// Sorting the characters in the array alphabetically using bubble sort
		for (int i = 0; i < chars.length; i++) {
			for (j = 0; j < chars.length; j++) {
				if (chars[j] > chars[i]) {
					temp = chars[i];
					chars[i] = chars[j];
					chars[j] = temp;
				}
			}
		}
		
		System.out.println("Sorted Characters Are: ");
		// Printing the sorted characters
		for (int k = 0; k < chars.length; k++) {
			System.out.print(chars[k]);
		}
	}
}
