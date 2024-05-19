package inheritance;

import java.util.Scanner;

class Percentage
{
	int id;
	String name;
	int tmarks;
	String year;
	Percentage(int id,String name, int tmarks,String year)
	{
		this.id=id;
		this.name=name;
		this.tmarks=tmarks;
		this.year=year;
	}
	float CalculatePer()
	{
		return 0.0f;
	}
}
class CSE extends Percentage
{

	CSE(int id, String name, int tmarks,String year) 
	{
		super(id, name, tmarks,year);
		// TODO Auto-generated constructor stub
	}
	void DisplayInfo()
	{
		System.out.println("The Informations is: \n");	
		System.out.println("----------------------------------------------------------------------");
		System.out.println(" id: "+id+"\n Name: "+name+"\n Marks= "+tmarks+"\n Year: "+year);
		
	}
	float CalculatePer()
	{
		float percentage;
		percentage= tmarks/6;
		return percentage;
	}
}
class ETC extends Percentage
{

	ETC(int id, String name, int tmarks,String year) 
	{
		super(id, name, tmarks,year);
		// TODO Auto-generated constructor stub
	}
	void DisplayInfo()
	{
		System.out.println("The Informations of Electronic and Telecommunication student is:");	
		System.out.println("----------------------------------------------------------------------");
		System.out.println(" id: "+id+"\n Name: "+name+"\n Marks= "+tmarks+"\n Year: "+year);
	
	}
	float CalculatePer()
	{
		float percentage;
		percentage=tmarks/6;
		return percentage;
	}
}

public class Information_Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		CSE cs=new CSE(1,"Dattatray",485,"FE");
		ETC ec=new ETC(2,"Kumar",456,"SE");
		int choise,i = 0;
		do
		{
			System.out.println("Enter Your Choise for Display Inforamtion of Student");
			choise=sc.nextInt();
			switch(choise)
			{
			case 1:
				cs.DisplayInfo();
				System.out.println(" The Percentages of Student: "+cs.CalculatePer());
				System.out.println("----------------------------------------------------------------------");
				break;
				
			case 2:
				
				ec.DisplayInfo();
				System.out.println(" The Percentages of Student: "+ec.CalculatePer());
				System.out.println("----------------------------------------------------------------------");
				break;
				default:
				System.out.println("Wrong Input");
	
			}
		}while(i<=3);
	}

}
