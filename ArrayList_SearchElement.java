package collection_list_arraylist;
import java.util.ArrayList;

public class ArrayList_SearchElement
{
    public static void main(String[] args)
    {
        // Create a new ArrayList to store integer values
        ArrayList<Integer> al = new ArrayList<>();

        // Add elements to the ArrayList
        al.add(100);  // Adding 100 to the list
        al.add(200);  // Adding 200 to the list
        al.add(400);  // Adding 400 to the list
        al.add(500);  // Adding 500 to the list
        al.add(300);  // Adding 300 to the list

        // Search for a specific value (800 in this case) in the ArrayList
        boolean b = al.contains(800);  // The contains() method checks if 800 is present in the list

        // Output the result of the search operation
        if (b)
        {
            // If the element is found in the list, print "Data Found"
            System.out.println("Data Found");
        }
        else
        {
            // If the element is not found, print "Data Not Found"
            System.out.println("Data Not Found");
        }
    }
}

/*
Explanation of the Code:
1. Creating an ArrayList:
ArrayList al = new ArrayList();
Explanation: This line initializes an ArrayList named al which can store objects. Since no generic type is specified, this ArrayList can hold any type of object (this is referred to as a raw type).
Best Practice: It is advisable to use generics for type safety, such as ArrayList<Integer> instead of a raw ArrayList to ensure that only integers are added to the list.

2. Adding Elements to the ArrayList:
Explanation: The add() method is used to insert integer values into the ArrayList. Each add() call appends the element to the end of the list.

3. Searching for a Specific Element: boolean b = al.contains(800);
Explanation: The contains() method checks if the specified element (in this case, 800) is present in the ArrayList. It returns true if the element is found, otherwise, it returns false. In this example, since 800 is not in the list, the result will be false.

4. Conditional Check and Output:
Explanation: The result of the contains() method (b) is checked using an if-else statement:
If b is true, it prints "Data Found", indicating that the specified element (800) is present in the list.
*/
