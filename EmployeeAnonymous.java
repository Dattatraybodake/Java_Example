package jdk_1_8_consumer_interface;
import java.util.ArrayList;
import java.util.function.Consumer;

public class EmployeeAnonymous {
	public static void main(String[] args)
	{
		//		ArrayList Initialization and Population

		ArrayList<Employee> ar = new ArrayList<Employee>();
		ar.add(new Employee(1,"Dattatray"));
		ar.add(new Employee(2,"Dhajraj"));
		ar.add(new Employee(3,"Kumar"));

		//		To print elements of an ArrayList using an anonymous class and the Consumer interface
		Consumer<Employee> cr=new Consumer<Employee>()
		{
			@Override
			public void accept(Employee t) {
				// TODO Auto-generated method stub
				System.out.println(t.getId()+"\t"+t.getName());
			}
		};
		ar.forEach(cr);
	}
}