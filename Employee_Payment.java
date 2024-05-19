package constructor;

import java.util.Scanner;

class Employee1 {
	private int id;
	private String name;
	private int totalhours;
	private int overtime;
	private int salary;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTotalhours() {
		return totalhours;
	}

	public void setTotalhours(int totalhours) {
		this.totalhours = totalhours;
	}

	public int getOvertime() {
		return overtime;
	}

	public void setOvertime(int overtime) {
		this.overtime = overtime;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
}

class overtime {
	Employee1 e[];

	overtime(Employee1... e) {
		this.e = e;
	}

	void showSalary() {
		System.out.println("-------------------------------------------------");
		System.out.println("\nCurrent Employee Information in Current Company");
		System.out.println("-------------------------------------------------");
	
		//System.out.println("Id \t Employee Name \t Working Hours \t OverTime \t days \t Salary");
		for (int i = 0; i < e.length; i++) {
			
			int totaldays=e[i].getTotalhours()/8;
			//System.out.println("Days= "+totaldays);
			
			int otSalary=e[i].getOvertime()*50;
//			System.out.println("Ot Salary: "+otSalary);
			
			e[i].setSalary((totaldays*451)+(+otSalary));
			//System.out.println("Salary="+e[i].getSalary());
			System.out.println("\n Employee Id: "+e[i].getId() + "\n Name of Employee: " + e[i].getName() + "\n Total Working Hours of Employee in Company: " + e[i].getTotalhours() + "\n Overtime Hours of Employee in Current Company: " + e[i].getOvertime()+"\n Calculated Present Days of Employee in Current Company: "+totaldays+"\n Overall Salary of Employee in Current Company: "+e[i].getSalary());
			System.out.println(" Ot Salary: "+otSalary);
			System.out.println("-------------------------------------------------");
		}

	}
}

public class Employee_Payment {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc1 = new Scanner(System.in);

		Employee1 emp[] = new Employee1[2];
		for (int i = 0; i < emp.length; i++) {
			emp[i] = new Employee1();

			System.out.println("Enter the name");
			String name = sc1.next();
			sc1.nextLine();
			System.out.println("Enter the id");
			int id = sc1.nextInt();

			System.out.println("Enter the Total Working Hours");
			int totalhours = sc1.nextInt();

			System.out.println("Enter the Overtime");
			int overtime = sc1.nextInt();

			emp[i].setId(id);
			emp[i].setName(name);
			emp[i].setTotalhours(totalhours);
			emp[i].setOvertime(overtime);

		}
		overtime ot = new overtime(emp);
		ot.showSalary();
	}
}
