package collection_list_arraylist;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_ReverseElement
{

    public static void main(String[] args)
    {
        // Initialize an ArrayList of String type to store numeric values as strings
        ArrayList<String> Listofints = new ArrayList<>();

        // Add elements to the ArrayList
        Listofints.add("1");    // Add "1" to the list
        Listofints.add("3");    // Add "3" to the list
        Listofints.add("9");    // Add "9" to the list
        Listofints.add("18");   // Add "18" to the list

        // Display the ArrayList before reversing
        System.out.println("Before Reverse: " + Listofints);

        // Reverse the elements in the ArrayList using the Collections.reverse() method
        Collections.reverse(Listofints);

        // Display the ArrayList after reversing
        System.out.println("After Reverse: " + Listofints);
    }
}