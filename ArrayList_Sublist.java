package collection_list_arraylist;
import java.util.ArrayList;
import java.util.List;

public class ArrayList_Sublist {

	public static void main(String[] args)
	{
		ArrayList arrayList = new ArrayList();
		 //Add elements to Arraylist
		 arrayList.add("Java");
		 arrayList.add("C++");
		 arrayList.add("PHP");
		 arrayList.add("Scala");
		 List lst = arrayList.subList(1,3);

		 System.out.println("Sub list contains : ");
		 for (Object element : lst) {
			System.out.println(element);
		}

		 Object obj = lst.remove(0);
		 System.out.println(obj + " is removed from sub list");

		 System.out.println("After removing " + obj + " from sub list, original ArrayList  contains : ");
		 for (Object element : arrayList) {
			System.out.println(element);
		}	}
}
