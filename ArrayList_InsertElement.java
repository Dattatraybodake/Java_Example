package collection_list_arraylist;
import java.util.ArrayList;

public class ArrayList_InsertElement {

    public static void main(String[] args) {
        // Initialize the ArrayList with a generic type of String
        ArrayList<String> list = new ArrayList<>();

        // Add elements to the ArrayList using the add() method
        list.add("Red");
        list.add("Green");
        list.add("Orange");
//        list.add("White");
//        list.add("Black");

        // Display the elements of the ArrayList before adding new ones
        System.out.println("Before Adding Elements: \n");

        // Loop through the ArrayList and print each element
        for (Object obj : list) {
            System.out.println(obj);
        }

        // Add new elements at specific positions in the ArrayList using the add(index, element) method
        // Insert "Pink" at the beginning (index 0)
        list.add(0, "Pink");

        // Insert "Yellow" at index 5 (position after the last original element)
        list.add(5, "Yellow");

        // Step 5: Display the updated ArrayList after inserting elements at specific positions
        System.out.println("\nAfter Adding Elements at Specific Positions: \n" + list);
    }
}
