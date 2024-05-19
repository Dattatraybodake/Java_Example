package basic;
import java.util.Calendar;

public class Display_Date_Time {
	public static void main(String[] args) {

		// Creating a Calendar class object
		Calendar calndr = Calendar.getInstance();

		// Displaying the current date using getTime() method
		System.out.println("Current Date: "+ calndr.getTime());
	}
}
