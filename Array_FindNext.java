package array_examples;
public class Array_FindNext{
	private static void next(int a[],int n)
	{
		int next,i,j;
		for(i=0;i<n;i++)
		{
			next=-1;
			for(j=i+1;j<n;j++)
			{
				if(a[i]<a[j]) {
					next=a[j];
					break;
				}
			}
			System.out.println(a[i]+" Next Greter Element in an Array is: "+next);
			
			if(next==-1)
			{
				System.out.println("End Of List!");
			}
		}
	}
	public static void main(String[] args) {
		int a[]= {11,13,17,19,21};
		int n=a.length;
		next(a,n);
	}
}