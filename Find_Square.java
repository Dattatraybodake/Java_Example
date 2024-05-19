package constructor;
// In this program we passed parameter to constructor.

import java.util.Scanner;

class Square
{
	int no;
	Square(int no)
	{
		this.no=no;
	}
	int getSquare()
	{
		return no*no;
	}
}

public class Find_Square {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Any Number");
		int no=sc.nextInt();
		Square s1=new Square(no);  
		System.out.println("The Square of "+no+" is: "+s1.getSquare());
	}
}
