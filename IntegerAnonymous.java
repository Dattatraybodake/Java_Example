package jdk_1_8_consumer_interface;

import java.util.ArrayList;
import java.util.function.Consumer;

public class IntegerAnonymous {
	public static void main(String[] args)
	{
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(100);
		ar.add(308);
		ar.add(400);
		ar.add(495);

		// The Prints Elements Using Anonymous class.
		System.out.println("The Prints Integer Values:");
		Consumer<Integer> con=new Consumer<Integer>()
		{
			@Override
			public void accept(Integer t) {
				System.out.println(t);
			}
		};
		ar.forEach(con);
	}
}