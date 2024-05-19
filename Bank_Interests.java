package Polymorphism;

// Java RuntimePolymorphism Example
class Bank
{
	float getRateOfInterest()
	{
		return 0;
	}
}
class SBI extends Bank
{
	float getRateOfInterest()
	{
		return 8.4f;
	}
}
class ICICI extends Bank
{
	float getRateOfInterest()
	{
		return 7.3f;
	}
}
class AXIS extends Bank
{
	float getRateOfInterest()
	{
		return 9.7f;
	}
}
public class Bank_Interests
{

	public static void main(String[] args) 
	{
		
	System.out.println("All Banks Intrest Rates: \n");
		Bank b;
		b=new SBI();
		System.out.println("SBI rate of interest: "+b.getRateOfInterest());

		b= new ICICI();
		System.out.println("ICICI Rate of Intrest: "+b.getRateOfInterest());

		b=new AXIS();
		System.out.println("AXIS Rate Of Interest: "+b.getRateOfInterest());
	}
}
