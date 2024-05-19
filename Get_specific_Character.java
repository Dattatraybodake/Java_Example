// Demonstrating the usage of the getChars() method to extract a portion of a string into a character array.
package string;

// Class to demonstrate the getChars() method
class Get_specific_Character {
    // Main method
    public static void main(String []args) {
        String s = " This is a demo of getChar Method"; // Input string
        int start = 10; // Start index
        int end = 14; // End index (exclusive)
        char buf[] = new char[end - start]; // Character array to store the extracted portion

        // Extracting the specified portion of the string into the character array
        s.getChars(start, end, buf, 0);

        // Printing the extracted portion as a string
        System.out.println(buf);
    }
}
