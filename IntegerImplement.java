package jdk_1_8_consumer_interface;

import java.util.ArrayList;
import java.util.function.Consumer;

class Myconsumer implements Consumer<Integer>
{
	@Override
	public void accept(Integer t) {
		System.out.println(t);
	}
}

public class IntegerImplement {
	public static void main(String[] args) {

		//ArrayList Initialization and Population
		ArrayList<Integer> ar=new ArrayList<Integer>();
		ar.add(109);
		ar.add(204);
		ar.add(394);
		ar.add(984);

		// Prints the Elements Using ForEach Method.
		Myconsumer my=new Myconsumer();
		ar.forEach(my);
	}
}