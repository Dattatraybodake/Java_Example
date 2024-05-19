package Polymorphism;

class shape
{
	void draw()
	{
		System.out.println("Drawing....");
	}
}
class Rectangle extends shape
{
	void draw()
	{
		System.out.println("Rectanle draw");
		
	}
}
class Circle extends shape
{
	void draw()
	{
		System.out.println("Circle draw");
	}
}
class square  extends shape
{
	void draw()
	{
		System.out.println("Square draw");
		
	}
}
class Triangle extends shape
{
	void draw()
	{
		System.out.println("Triangle draw");
	}
}
public class Shapes
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shape s;
		s = new Rectangle();
		s.draw();
		
		s = new Circle();
		s.draw();
		
		s = new square();
		s.draw();
		
		s = new Triangle();
		s.draw();
		
	}

}
