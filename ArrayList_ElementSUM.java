package collection_list_arraylist;
import java.util.ArrayList;

public class ArrayList_ElementSUM
{
    public static void main(String args[])
    {
        // Create an ArrayList of Integer type to store the elements
        ArrayList<Integer> al = new ArrayList<>();

        // Add elements to the ArrayList
        al.add(1);   // Add 1 to the list
        al.add(5);   // Add 5 to the list
        al.add(7);   // Add 7 to the list
        al.add(12);  // Add 12 to the list

        // Print the contents of the ArrayList
        System.out.println("Content of arrayList: " + al);

        // Convert the ArrayList to an array
        Integer ia[] = new Integer[al.size()];  // Create an Integer array with the same size as the ArrayList
        ia = al.toArray(ia);  // Convert the ArrayList to the array

        // Initialize a variable to store the sum of the elements
        int sum = 0;

        // Calculate the sum of the elements in the array
        for(int i : ia)
        {
            sum += i;  // Add each element of the array to the sum
        }

        // Output the sum of the elements
        System.out.println("Sum is " + sum);
    }
}
