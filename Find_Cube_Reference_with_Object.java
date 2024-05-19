package classesandobject;
import java.util.Scanner;

class Cube
{
	int no;
	void setValue(int x)
	{
		no=x;	
	}
	void showCube()
	{
		System.out.println("The cube of "+no+" is:"+(no*no*no));
	}
}

public class Find_Cube_Reference_with_Object {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number You Wants to FInd the Cube: ");
		int x=sc.nextInt();
		Cube cb=new Cube();	// Using Reference with Object
		cb.setValue(x);
		cb.showCube();
	}
}
