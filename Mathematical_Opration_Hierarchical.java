package inheritance;
//Base Class represnting the mathematical operation.

class Operation
{
	double operand1;
	double operand2;
	Operation( double operand1, double operand2)
	{
		this.operand1=operand1;
		this.operand2=operand2;
	}
	double performOperation()
	{
		return 0.0; // Default Implimentation (to be Overriddern by Subclasses)
	}
}

//Subclass Representing Substratcion
class Addition extends Operation
{
	Addition(double operand1,double operand2)
	{
		super(operand1,operand2);
	}
	@Override
	double performOperation()
	{
		return operand1+operand2;
	}
	
}
//Subclass Representing Substratcion
class Substraction extends Operation
{
	Substraction(double operand1,double operand2)
	{
		super(operand1,operand2);
	}
	@Override
	double performOperation()
	{
		return operand1-operand2;
	}
}

class Multiplication extends Operation
{
	Multiplication(double operand1,double operand2)
	{
		super(operand1,operand2);
	}
	@Override
	double performOperation()
	{
		return operand1*operand2;
	}
}

public class Mathematical_Opration_Hierarchical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Creating instance of Subclass
		Addition ad=new Addition(5,6);
		Substraction sb=new Substraction(8,6);
		Multiplication mp=new Multiplication(6,2);
		
		//Performing Operations and displaying results.
		
		System.out.println("Additin is: "+ad.performOperation());
		System.out.println("Substraction is: "+sb.performOperation());
		System.out.println("Multiplication is: "+mp.performOperation());
	}
}
