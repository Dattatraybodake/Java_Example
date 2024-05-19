package basic;
import java.util.Scanner;

public class Simple_Interest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int pa,term;
		float si;
		float rate;
		
		System.out.println("Enter Principal Amount");
		pa=sc.nextInt();
		System.out.println("Enter Rate Amount");
		rate=sc.nextFloat();
		System.out.println("Enter term in Month");
		term=sc.nextInt();
		
		si=(pa*rate)/100;
		System.out.println("Calculated Simple Intrest= "+si);

	}

}
