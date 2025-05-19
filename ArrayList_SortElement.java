package collection_list_arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList_SortElement {

    public static void main(String[] args) {
        // Initialize an ArrayList of Integer type to store a list of years
        List<Integer> listofyears = new ArrayList<>();

        // Add years to the ArrayList
        listofyears.add(2004);   // Add the year 2004 to the list
        listofyears.add(2006);   // Add the year 2006 to the list
        listofyears.add(5002);   // Add the year 5002 to the list
        listofyears.add(2009);   // Add the year 2009 to the list

        // Display the contents of the ArrayList before sorting
        System.out.println("ArrayList Before Sorting: \n" + listofyears);

        // Sort the ArrayList in ascending order using Collections.sort()
        Collections.sort(listofyears);

        // Display the contents of the ArrayList after sorting
        System.out.println("\nArrayList After Sorting: \n" + listofyears);
    }
}
