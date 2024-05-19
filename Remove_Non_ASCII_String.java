package string;

// Class to removing non-ASCII characters from a string
public class Remove_Non_ASCII_String {
    
    // Main method
    public static void main(String [] args) {
        System.out.println("Using Non ASCII characters"); // Printing a message
        
        String str = "Instance¡of¥java"; // String with non-ASCII characters
        System.out.println(str); // Printing the original string
        
        // Removing non-ASCII characters using regular expression
        str = str.replaceAll("[^\\p{ASCII}]", "");
        
        System.out.println("\n After removing non ASCII chars:"); // Printing a message
        System.out.println(str); // Printing the modified string
    }
}
