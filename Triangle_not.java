package basic;
import java.util.Scanner;

public class Triangle_not {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a1,a2,a3;
		System.out.println("Enter 2 Angle");
		a1=sc.nextInt();
		a2=sc.nextInt();
		a3=sc.nextInt();
		if(a1+a2+a3<=180)
		{
			System.out.println("This is formed Triangle");
		}
		else
		{
			System.out.println("This in Not formed Triangle");
		}
	}

}
