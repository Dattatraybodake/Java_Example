package jdk_1_8_consumer_interface;
import java.util.ArrayList;
import java.util.function.Consumer;

public class Employee_Lambda {
	public static void main(String args)
	{	
		//	ArrayList Initialization and Population

		ArrayList<Employee> ar=new ArrayList<Employee>();
		ar.add(new Employee(1,"Dattatray"));
		ar.add(new Employee(2,"Dhanraj"));
		ar.add(new Employee(3,"Kumar"));

		//		To print elements of an ArrayList using an Lambda Expression and the Consumer interface

		//		step 1:  Verbose Lambda Expression
		Consumer<Employee> cr= (Employee t)->
		{
			System.out.println(t.getId()+"\t"+t.getName());
		};
		ar.forEach(cr);

		//		step2: Inline Lambda Expression
		Consumer<Employee> cr2 = (Employee t)-> System.out.println(t.getId()+"\t"+t.getName());
		ar.forEach(cr2);

		//		step 3: Direct Lambda Expression in forEach().
		ar.forEach((Employee t)-> System.out.println(t.getId()+"\t"+t.getName()));
	}
}
