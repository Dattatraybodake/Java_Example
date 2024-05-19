package classesandobject;
import java.util.Scanner;

class Student
{
	private int id;
	private String name;
	private double per;
	private int total;
	public int getId() 
	{
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
	public double getPer() {
		return per;
	}
	public void setPer(double per) {
		this.per = per;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(double discountedFees) {
		this.total = (int) discountedFees;
	}
}
class DiscountFee {
	Student s;
	void setStudent(Student ss)
	{
		this.s=ss;
	}
	void checkDiscountEligibility(double per)
	{
		if(s.getPer()>=60)
		{
			System.out.println("Student is eligible");
			double discount = 0.3; // 30% discount
			double discountedFees = s.getTotal() * (1 - discount);
			s.setTotal(discountedFees);
		}
		else
		{
			System.out.println("Student not eligible for scolership");
		}
	}
	void show()
	{
		System.out.println(s.getId()+"\t"+s.getName()+"\t"+s.getPer()+"\t"+s.getTotal());
	}
}

public class Student_Scholership_Discount
{
	public static void main(String[] args) {

		Scanner scc=new Scanner(System.in);
		DiscountFee df=new DiscountFee();
		Student s1=new Student();
		
		s1.setId(1);
		s1.setName("datta");
		s1.setPer(42.32);
		s1.setTotal(12500);

		df.setStudent(s1);
		df.show();
		df.checkDiscountEligibility(s1.getPer());

	}

}
