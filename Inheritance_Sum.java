package inheritance;
class ArrParent
{
	int arr[];
	void setArray(int arr[])
	{
		this.arr=arr;
	}
}
class Sort extends ArrParent
{
	void sortArr()
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=(i+1);j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int t=arr[i];
					arr[i]=arr[j];
					arr[j]=t;
					
				}
			}
		}
	}
	void display()
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(+arr[i]);
		}
	}
}
class Sum extends ArrParent
{
	int s=0;
	int getSum()
	{
		for(int i=0;i<arr.length;i++)
		{
			s=s+arr[i];
		}
		return s;
	}
	
}
public class Inheritance_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[] {5,3,4,1,2};
		
		Sort s=new Sort();
		s.setArray(a);
		
		System.out.println("Array Before Sorting");
		s.display();
		s.sortArr();
		
		System.out.println("Array After Sorting");
		s.display();
		
		Sum sm=new Sum();
		sm.setArray(a);
		System.out.println("The Sum of Array is: "+sm.getSum());

	}

}

