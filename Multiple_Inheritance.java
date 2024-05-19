package inheritance;

// Exmaple of Multiple Inheritance: 
interface swimmer
{
	void swim();
}
interface Flyer
{
	void fly();
}
class Bird implements swimmer,Flyer
{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Bird is swim");
		
	}

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		System.out.println("bird id fly");
		
	}
	void eat()
	{
		System.out.println("Bird is eating");
	}
}

public class Multiple_Inheritance {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bird b=new Bird();
		b.swim();
		b.eat();
		b.fly();
	}
}
