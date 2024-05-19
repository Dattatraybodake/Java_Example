package basic;
import java.util.Scanner;

public class Leap_Year {
	public static void main(String[] args) {
		try (Scanner sc5 = new Scanner(System.in)) 
		{
			int year;
			System.out.println("Enter Any Year: ");
			year=sc5.nextInt();
			if(year%4==0)
			{
				System.out.println("Leap year");	
			}
			else
			{
				System.out.println("Not leap year");
			}
		}
	}
}
