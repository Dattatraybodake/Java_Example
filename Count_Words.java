// Importing necessary Java libraries
package string;
import java.util.Scanner;

// Class to count the number of words in a given Line
public class Count_Words {
	
    // Main method
    public static void main(String[] args) {
        System.out.println("Enter the string"); // Prompting user to input a string
        
        Scanner sc = new Scanner(System.in); // Creating a Scanner object to read input
        
        String s = sc.nextLine(); // Reading the input string
        
        // Splitting the input string into words using space as delimiter
        String[] words = s.trim().split(" ");
        
        // Printing the number of words in the input string
        System.out.println("Number of words in the Line = " + words.length);
    }}
