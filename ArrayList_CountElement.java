package collection_list_arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ArrayList_CountElement {
    public static void main(String[] args) {

        // Initializing ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();

        // Adding elements to the ArrayList
        numbers.add(100);
        numbers.add(200);
        numbers.add(300);
        numbers.add(400);
        numbers.add(100);
        numbers.add(200);
        numbers.add(100);

        // Printing the size of the ArrayList
        System.out.println("Elements size: " + numbers.size());

        // Sorting the ArrayList in descending order Using Comparator.
        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println("Sorted ArrayList: " + numbers);

        // Counting occurrences of each element
        HashMap<Integer, Integer> countMap = new HashMap<>();
        for (Integer num : numbers) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // Printing the count of each element
        System.out.println("Element counts:");
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            System.out.println(entry.getKey() + " occurs " + entry.getValue() + " times.");
        }
    }
}

/*
Explanation:
	1. Initializing the ArrayList
	This line creates an instance of the ArrayList class, specifically an ArrayList that holds Integer values.
	ArrayList<> is a generic collection in Java, meaning it can store any type of object, in this case, integers.
	The <> is the diamond operator introduced in Java 7, which infers the type of the ArrayList from the left-hand side (in this case, Integer).

	2. Adding Elements to the ArrayList
	The add() method is used to insert elements into the ArrayList. In this case, we are adding Integer values (100, 200, 300, 400, etc.) to the list.

	3. Printing the Size of the ArrayList
	The size() method returns the number of elements currently stored in the ArrayList. In this case, it will return the total count of elements added to the list, which is 7.

	4. Sorting the ArrayList in Descending Order
	Collections.sort() is a utility method provided by the Collections class that sorts the elements of a collection (in this case, the ArrayList).
	Collections.reverseOrder() is a comparator that sorts the list in descending order. By passing it as a second argument to sort(), we tell Java to sort the numbers in descending order.

	5. Counting Occurrences of Each Element Using a HashMap
	HashMap<Integer, Integer>: This creates a new instance of a HashMap where the key is the integer element from the ArrayList (the number itself), and the value is the count of how many times that number appears in the list.
	countMap.getOrDefault(num, 0): This method checks if the num already exists as a key in the HashMap. If it does, it retrieves the current count. If it doesn’t exist, it returns a default value of 0.
	The expression countMap.put(num, countMap.getOrDefault(num, 0) + 1) updates the count for the number by adding 1 to the existing count (or starting the count at 1 if it’s the first time this number is encountered).

	6. Printing the Count of Each Element
	countMap.entrySet(): This returns a set of key-value pairs (or entries) from the HashMap. Each entry represents a number from the ArrayList and its corresponding count.
	The for loop iterates over each entry in the HashMap. entry.getKey() retrieves the number (key), and entry.getValue() retrieves its count (value).
	The System.out.println() statement prints each element's count to the console.
*/