package collection_list_arraylist;
import java.util.ArrayList;

public class ArrayList_Remove_char
{
    public static void main(String[] args)
    {
        // Initialize an ArrayList of type String to store string elements
        ArrayList<String> al = new ArrayList<>();

        // Display the initial size of the ArrayList
        System.out.println("Initial size of al: " + al.size());

        // Add elements to the ArrayList
        al.add("D");  // Add "D" to the list
        al.add("a");  // Add "a" to the list
        al.add("t");  // Add "t" to the list
        al.add("t");  // Add "t" (duplicate) to the list
        al.add("a");  // Add "a" (duplicate) to the list

        // Display the size of the ArrayList after adding elements
        System.out.println("Size of ArrayList after adding elements: " + al.size());

        // Display the contents of the ArrayList
        System.out.println("Contents of ArrayList: " + al);

        // Remove an element from the ArrayList by its index
        al.remove(1);  // Remove the element at index 1 (which is "a")

        // Remove an element from the ArrayList by its value
        al.remove("t");  // Remove the first occurrence of "t"

        // Display the size of the ArrayList after removing elements
        System.out.println("Size of ArrayList after removing elements: " + al.size());

        // Display the updated contents of the ArrayList
        System.out.println("Contents of ArrayList after removal: " + al);
    }
}
