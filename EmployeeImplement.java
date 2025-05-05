package jdk_1_8_consumer_interface;
import java.util.ArrayList;
import java.util.function.*;

class Fetchemp implements Consumer<Employee>
{
	@Override
	public void accept(Employee t)
	{
		System.out.println(t.getId()+"\t"+t.getName());
	}
}

public class EmployeeImplement {
	public static void main(String[] args)
	{
		ArrayList<Employee> al=new ArrayList<Employee>();
		al.add(new Employee(100,"Dattatray"));
		al.add(new Employee(200, "Kumar"));
		al.add(new Employee(300, "Dhanraj"));
		
		System.out.println("The Array Elements are:");
		Fetchemp femp= new Fetchemp();
		al.forEach(femp);
	}	
}