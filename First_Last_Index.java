// Demonstrating the usage of indexOf() and lastIndexOf() methods to find the position of substrings within a StringBuffer.
package string;

// Class to demonstrate indexOf() and lastIndexOf() methods
public class First_Last_Index {

    // Main method
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Dattatray Nathu Bodake"); // StringBuffer instance
        
        int i; // Variable to store index
        
        System.out.println("String is: "+sb);
        // Finding the first occurrence of the substring "Dattatray"
        i = sb.indexOf("Dattatray");
        System.out.println("First Index: " + i);
        
        // Finding the last occurrence of the substring "Bodake"
        i = sb.lastIndexOf("Bodake");
        System.out.println("Last Index: " + i);
    }
}
