package jdk_1_8_consumer_interface;

import java.util.ArrayList;
import java.util.function.Consumer;

public class IntegerLambda {
	public static void main(String[] args)
	{
		//ArrayList Initialization and Population

		ArrayList<Integer> ar=new ArrayList<Integer>();
		ar.add(252);
		ar.add(598);
		ar.add(245);
		ar.add(55);
		System.out.println("The ArrayList Elements Using Consumer Interface: ");

		
//		step1:Verbose Lambda Expression
		
//		Consumer<Integer> cr = (Integer t) ->
//		{
//			System.out.println(t);
//		};
//		ar.forEach(cr);
		
//		Step:2- Inline Lambda Expression
//		Consumer<Integer> cr = (Integer t) ->System.out.println(t);
//		ar.forEach(cr);
//		
//		step:3 Direct Lambda Expression in forEach
		ar.forEach((Integer t) -> System.out.println(t));
	}
}
