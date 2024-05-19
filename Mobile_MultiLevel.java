package inheritance;
class Mobile
{
	int id;
	String name;
	int modelyear;
	
	Mobile(int i,String n,int my)
	{
		this.id=i;
		this.name=n;
		this.modelyear=my;
	}
	
	void display()
	{
		System.out.println("\n Mobile Id= "+id+"\n Name= "+name+"\n Model Year= "+modelyear);
	}
}
class InnerMobile extends Mobile
{
	int ram;
	int battery;
	
	InnerMobile(int i, String n, int my,int r,int b) 
	{
		super(i, n, my);
		// TODO Auto-generated constructor stub
		this.ram=r;
		this.battery=b;
	}
	void display()
	{
		super.display();
		System.out.println("\n Ram= "+ram+"\n Battery Capacity: "+battery);
	}
}
class OuterMobile extends InnerMobile
{
	String color;
	int weight;
	OuterMobile(int i, String n, int my,int r,int b,String c,int w) 
	{
		super(i, n, my,r,b);
		// TODO Auto-generated constructor stub
		this.color=c;
		this.weight=w;
	}	
	void display()
	{
		super.display();
		System.out.println("\n Color: "+color+"\n Weight: "+weight);
	}
}


public class Mobile_MultiLevel {
	public static void main(String[] args) {
		
		OuterMobile om=new OuterMobile(1002, "Redmi", 2012, 16,4000,"Purple",125);
		om.display();
	}
}
