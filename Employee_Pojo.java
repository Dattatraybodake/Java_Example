package classesandobject;
class Employee 
{
	private int id;
	private String Name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	private int sal;	
}

class Company
{
	Employee emp[];
	void setEmployee(Employee ...employees)
	{
		this.emp=employees;
	}
	void show()
	{
		for(int i=0;i<emp.length;i++)
		{
			System.out.println("\nid= "+emp[i].getId()+"\nName= "+emp[i].getName()+"\nSalary= "+emp[i].getSal());
			
		}
		
	}
}

public class Employee_Pojo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Company com=new Company();
		Employee emp=new Employee();
		
		System.out.println("Display The Employee Information: ");
		emp.setId(1);
		emp.setName("Dattatray");
		emp.setSal(12500);
		
		Employee emp2=new Employee();
		emp2.setId(2);
		emp2.setName("Dhanraj" );
		emp2.setSal(15600);
		
		Employee emp3=new Employee();
		emp3.setId(3);
		emp3.setName("Kumar" );
		emp3.setSal(16500);
		
		com.setEmployee(emp,emp2,emp3);
		com.show();
		

	}

}
