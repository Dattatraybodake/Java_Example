package classesandobject;

import java.util.Scanner;

class Mobile
{
	private String name;
	private int price;
	private int memory;
	public int getMemory() {
		return memory;
	}
	public void setMemory(int memory) {
		this.memory = memory;
	}
	public int getBattery() {
		return battery;
	}
	public void setBattery(int battery) {
		this.battery = battery;
	}
	private int battery;
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setPrice(int price)
	{
		this.price=price;
	}
	public int getPrice()
	{
		return price;
	}
	
}

public class Mobile_Store_Storage {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Mobile mb[]=new Mobile[3];
		
		int choise;
		do
		{
			System.out.println("Enter Your CHoise: ");
			choise=sc.nextInt();
			switch(choise)
			{
			case 1: 
				System.out.println("Accept the Mobile details: ");
				for(int i=0;i<mb.length;i++)
				{
					mb[i]=new Mobile();
					System.out.println("Enter the Name of Mobile: ");
					String name=sc.next();
					mb[i].setName(name);
					
					System.out.println("Enter the Price of Mobile: ");
					int price=sc.nextInt();
					mb[i].setPrice(price);

					System.out.println("Enter the memory of Mobile: ");
					int memory=sc.nextInt();
					mb[i].setMemory(memory);

					System.out.println("Enter the Battery of Mobile: ");
					int battery=sc.nextInt();
					mb[i].setBattery(battery);	
				}
				System.out.println("Data Added Succesfully...");
				break;
				
			case 2:
				System.out.println("Display the All Data");
				for(int i=0;i<mb.length;i++)
				{
					System.out.println("\n Name="+mb[i].getName()+"\nPrice= "+mb[i].getPrice()+"\n Memory= "+mb[i].getMemory()+"\n battery="+mb[i].getBattery());
				}
				break;
				
			case 3:
				System.out.println("Search The Data price between 10000-20000");
				for(int i=0;i<mb.length;i++)
				{
					if(mb[i].getPrice()>=10000 && mb[i].getPrice()<=20000)
					{
						System.out.println("\n Name="+mb[i].getName()+" \n Price= "+mb[i].getPrice()+"\n Memory= "+mb[i].getMemory()+"\n Battery="+mb[i].getBattery());
					}
				}
				break;
				
			case 4:
				System.out.println("Serach the Mobile Details: ");
				System.out.println("Enter the Search key: ");
				int skey=sc.nextInt();
				for(int i=0;i<mb.length;i++)
				{
					if(skey==mb[i].getMemory())
					{
						System.out.println("Deveice is found");
						System.out.println("\n Name="+mb[i].getName()+"\nPrice= "+mb[i].getPrice()+"\n Memory= "+mb[i].getMemory()+"\n battery="+mb[i].getBattery());
					}
					
				}
				break;
				
			case 5:
				System.out.println("Serach the Mobile name");
				System.out.println("Enter the skey: ");
				String skey2=sc.next();
				for(int i=0;i<mb.length;i++)
				{
					if(skey2==mb[i].getName())
					{
						System.out.println("\n Name="+mb[i].getName()+"\nPrice= "+mb[i].getPrice()+"\n Memory= "+mb[i].getMemory()+"\n battery="+mb[i].getBattery());
					}
				}
				break;
				
			case 6:
				System.out.println("Delete the Employee");
				int value=sc.nextInt();
				for(int i=0;i<mb.length;i++)
				{
					if(value==mb[i].getPrice())
					{
						for(int j=i;j<mb.length;j++)
						{
							mb[j]=mb[j+1];
						}
					}
				}
				
				System.out.println("Display the All Data after delete the elemets");
				for(int i=0;i<mb.length;i++)
				{
					System.out.println("\n Name="+mb[i].getName()+"\nPrice= "+mb[i].getPrice()+"\n Memory= "+mb[i].getMemory()+"\n battery="+mb[i].getBattery());
				}
				break;
			default:
				System.out.println("Wrong Choise");
			}
			
		}while(choise>=0);

	}

}
