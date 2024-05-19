package basic;
import java.util.Scanner;

public class Calculate_Allowence {
	public static void main(String[] args) {
		
			Scanner sc4 = new Scanner(System.in);
			float sal,hra,da;
			System.out.println("Enter Salary: ");
			sal=sc4.nextFloat();
			if(sal<=10000)
			{
				hra=(float) (sal*0.2);
				da=(float) (sal*0.8);
				System.out.println("The Hra is: \t "+hra+ "\nThe da is: \t"+da);
			}
			else if(sal<=20000)
			{
				hra=(float) (sal*0.25);
				da=(float) (sal*0.90);
				System.out.println("The Hra is: \t "+hra+ "\nThe da is:\t"+da);
			}
			else if(sal>20000)
			{
				hra=(float) (sal*0.30);
				da=(float) (sal*0.90);
				System.out.println("The Hra is: \t "+hra+ "\nThe da is: \t"+da);
			}
	}
}
