package inheritance;

import java.util.Scanner;

class Intrest
{
	protected 
	String name;
	int pamount;
	int rate;
	int duration;

	Intrest(String name, int pamount,int rate,int durartion)
	{
		this.name=name;
		this.pamount=pamount;
		this.rate=rate;
		this.duration=duration;

	}
	void Calculate()
	{
		return;
	}
}

class CalculateIntrest extends Intrest
{
	CalculateIntrest(String name, int pamount, int rate, int durartion)
	{
		super(name, pamount, rate, durartion);
		// TODO Auto-generated constructor stub
	}

	void DisplayInfo()
	{
		System.out.println("Calcualate Simple Intrest:");	
		System.out.println(" Name: "+name+"\n P Amount= "+pamount+"\n Rate: "+rate+"\n Duration: "+duration+"\tMonth");
	}
	void calculate()
	{
		int intrest=0;
		intrest=((pamount+duration+rate)/100);
		System.out.println("The Simple intrest= "+intrest);
	}
}

public class Intrest_Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		CalculateIntrest ci=new CalculateIntrest("Dattatray",15650,7,12);
		ci.DisplayInfo();
		ci.calculate();


	}

}
