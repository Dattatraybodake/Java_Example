package classesandobject;

class Percentage
{
	int sub1,sub2,sub3,sub4,sub5,sub6,agg,per;
	void setValue(int s1,int s2,int s3,int s4,int s5,int s6)
	{
		sub1=s1;
		sub2=s2;
		sub3=s3;
		sub4=s4;
		sub5=s5;
		sub6=s6;
	}
	float getPercentage()
	{
		int total=sub1+sub2+sub3+sub4+sub5+sub6;
		float percent=total/6;
		return percent;
	}
}

public class Find_Percentage_multiple_references {
	public static void main(String[] args) {

		Percentage pc=new Percentage();
		pc.setValue(52,54,72,69,68,87);
		float result=pc.getPercentage();
		System.out.println("Percentage= "+result);
	}
}
