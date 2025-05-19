package collection_list_arraylist;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
public class ArrayList_Sychronized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> lst = new ArrayList<>();
		lst.add("TATA");
		lst.add("RELIENCE");
		lst.add("HDFC");
		lst.add("Icici");
		
		lst=Collections.synchronizedList(lst); // We can ppased Arraylist to Synchronized List
		synchronized(lst)
		{
			Iterator<String> ir = lst.iterator();
			while(ir.hasNext())
			{
				System.out.println(ir.next());
			}
		}
	}
}
