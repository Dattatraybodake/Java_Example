package arrayList;
import java.util.*;

public class ArrayList_UpdateElement {

	public static void main(String[] args) {

		ArrayList<Integer> al=new ArrayList<>();
		
		al.add(100);
		al.add(300);
		al.add(500);
		al.add(900);
		al.add(5000);
		
		System.out.println("Display The Elements");
		for(Integer obj:al)
		{
			System.out.println(obj);
		}
		
		int replace=al.set(4, 1100);
		System.out.println("Display After removing Elements: ");
		for(Integer obj: al)
		{
			System.out.println(obj);
		}
		System.out.println("Replacing element is: "+replace);
	}

}
