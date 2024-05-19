package exception;
/*
public class ArrayOutofBoundExceptionExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1");
		System.out.println("2");
		int a[]= new int[2];
		a[2]=200;
		System.out.println("The Value of a[7]"+a[7]);
		System.out.println("1");
		System.out.println("2");
	}
}
 */


public class Array_idex_Out_of_Bound_Exception {
	public static void main(String[] args) {


		System.out.println("1");
		System.out.println("2");
		try
		{
			int a[]= new int[6];
			a[0]=200;
			System.out.println("The Value of a[7]"+a[7]);	
		}
		catch(Exception ex)
		{
			System.out.println("This Exception Occur:"+ex);
		}
		System.out.println("3");
		System.out.println("4");
	}
}

