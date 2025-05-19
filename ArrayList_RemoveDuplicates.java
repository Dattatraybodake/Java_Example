package collection_list_arraylist;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ArrayList_RemoveDuplicates {
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		List<Integer> list= new ArrayList<Integer>();
		list.add(12);
		list.add(39);
		list.add(12);
		list.add(55);
		list.add(46);
		list.add(39);
		
		//Print the original List
		System.out.println("The Original List is: "+list);
		
		// Copying All elements from Arraylist to linkedHashset.
		Set<Integer> remove = new LinkedHashSet<Integer>(list);	
		
		// We Cant use Hashset Because it Can't maintain Insertion Order.
		
		// For Emplty ArrayList You can 
		list.addAll(remove);	// Remove Duplicates Values.
		list.clear();			// clear the ArrayList
		System.out.println("List of Elements After Remove Duplicates: "+remove);
		
	}

}
