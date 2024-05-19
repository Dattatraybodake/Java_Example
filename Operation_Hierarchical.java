package inheritance;

import java.util.Scanner;

class Operation2
{
	double no;

	Operation2(double no)
	{
		this.no=no;
	}
	double PerformOperation()
	{
		return 0.0f;
	}
	
}
class Square extends Operation2
{

	Square(double no) {
		super(no);
		// TODO Auto-generated constructor stub
	}
	double PerformOperation()
	{
		return no*no;
	}
}
class Cube extends Operation2
{

	Cube(double no) {
		super(no);
		// TODO Auto-generated constructor stub
	}
	double PerformOperation()
	{
		return no*no*no;
	}
	
}
public class Operation_Hierarchical {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Number: ");
		int no = sc.nextInt();
		Square sq=new Square(no);
		Cube cb=new Cube(no);
		System.out.println("The Square of Number is: "+sq.PerformOperation());
		System.out.println("The Cube of Number is: "+cb.PerformOperation());
	}
}