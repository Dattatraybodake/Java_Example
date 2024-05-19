package inheritance;
interface Operation1
{
	double performOperation();
}

class BinaryOperation implements Operation1
{
	double op1;
	double op2;
	BinaryOperation(double op1,double op2)
	{
		this.op1=op1;
		this.op2=op2;
	}
	@Override
	public double performOperation()
	{
		// TODO Auto-generated method stub
		return 0.0;
	}
}

//Subclass Representing Addition
class Addition1 extends BinaryOperation
{
	Addition1 (double op1,double op2)
	{
		super(op1,op2);
	}
	@Override
	public double performOperation()
	{
		return op1+op2;
	}
	
	
}
class Substraction1 extends BinaryOperation
{
	Substraction1(double op1,double op2)
	{
		super(op1,op2);
	}
	public double performOperation()
	{
		return op1-op2;
	}
}


// Interface represent additional mathematical Operation
interface PowerOperation
{
	double raiseToPower();
}
class Power implements PowerOperation
{
	double base;
	double exponent;
	Power(double base,double exponent)
	{
		this.base=base;
		this.exponent=exponent;
	}
	public double raiseToPower()
	{
		return Math.pow(base, exponent);
	}
}

// Uses the classes and interfaces
public class Mathematical_Operation_Hybrid {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition1 ad=new Addition1(132,3);
		Substraction1 sb=new Substraction1(12,4);
		Power pw=new Power(2,2);
		
		//Performing Operation and Displaying Results
		System.out.println("Addition is: "+ad.performOperation());
		System.out.println("Substratcion is: "+sb.performOperation());
		System.out.println("Power is: "+pw.raiseToPower());	
	}
}
