package collection_list_arraylist;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_RemoveElement
{
	public static void main(String[] args)
	{
		// Create an ArrayList to store integer values
		ArrayList<Integer> al = new ArrayList<>();

		// Add elements to the ArrayList
		al.add(100);  // Adding 100 to the list
		al.add(200);  // Adding 200 to the list
		al.add(300);  // Adding 300 to the list
		al.add(100);  // Adding another 100 to the list
		al.add(400);  // Adding 400 to the list
		al.add(200);  // Adding another 200 to the list
		al.add(100);  // Adding another 100 to the list

		// Print the original ArrayList
		System.out.println("Original ArrayList: " + al);

		// step 1: Remove an element by index (removing the element at index 3)
		al.remove(3);  // Removes the element at index 3 (value 100 in this case)

		// Step 2: Print the ArrayList after removal by index
		System.out.println("ArrayList after removing element at index 3: " + al);

		// Step.3: Remove an element by value (removing the first occurrence of 200)
		al.remove(Integer.valueOf(200));  // Removes the first occurrence.

		//Print the ArrayList after removal by value
		System.out.println("ArrayList after removing:" + al);

		//Step 4: Remove data Using Iterator Method.
		Iterator<Integer> itr=al.iterator();
		while(itr.hasNext())
		{
			int x=itr.next();
			if(x<300)
			{
				itr.remove();
			}
		}
		System.out.println("ArrayList after removing Using iterator:" + al);

	}
}

/*
Explanation:
Creating and Populating the ArrayList:
An ArrayList named al is created to store Integer values. Multiple elements, including duplicates, are added to the list.

The remove(index) method removes the element at the specified index. In this case, we remove the element at index 3, which is 100 (the first occurrence at index 3). After this removal, the list is updated, and all subsequent elements shift left.
Printing the ArrayList After Removal: System.out.println("ArrayList after removing element at index 3: " + al);
Explanation: This statement prints the updated ArrayList after removing the element at index 3. The output will reflect the changes in the list.
Removing an Element by Value:

al.remove(Integer.valueOf(200));
Explanation: The remove(Object) method removes the first occurrence of the specified element. In this case, it removes the first occurrence of 200 from the list. The Integer.valueOf(200) is used to pass the value 200 as an object (since ArrayList's remove() method works with objects).
Printing the ArrayList After Removal by Value:

System.out.println("ArrayList after removing first occurrence of 200: " + al);
Explanation: This prints the ArrayList after removing the first occurrence of 200.
 */