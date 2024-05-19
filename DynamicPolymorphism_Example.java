package Polymorphism;
abstract class Value2
{
	int a,b;
	void setValue(int x,int y)
	{
		a=x;
		b=y;
	}
	abstract int getCalculator();
}

class Addition extends Value2
{
	int getCalculator()
	{
		return a+b;
	}
}

class Multiplication extends Value2
{
	int getCalculator()
	{
		return a*b;
	}
}

public class DynamicPolymorphism_Example 
{
	public static void main(String []x)
	{
		Value2 v;
		v=new Addition();
		v.setValue(5,26);
		int result=v.getCalculator();
		System.out.println("Result= "+result);

		v=new Multiplication();
		v.setValue(7,4);
		result=v.getCalculator();
		System.out.println("Result2 ="+result);
	}
}