package inheritance;
class Circle
{
	protected float radius;
	public void setRadius(float radius)
	{
		this.radius=radius;
	}
}
class Area extends Circle
{
	public float getArea()
	{
		return 3.14f*radius*radius;
	}
}
class Cirm extends Circle
{
	public float getCirm()
	{
		return 3.14f*2*radius;
	}
}
public class Inheritance_Area 
{
	public static void main(String[] args) {
		Area a=new Area();
		a.setRadius(3.5f);
		float result=a.getArea();
		System.out.println("Area of Cirlce is: "+result);

		Cirm cm=new Cirm();
		cm.setRadius(3.6f);

		result=cm.getCirm();
		System.out.println("Cirm of Circle is: "+result);
	}
}
