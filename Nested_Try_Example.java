package exception;


public class Nested_Try_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a=args.length;
			int b=41/a;
			System.out.println(" a= "+a);
			try
			{
				// nested try block
				if(a==1)
					a=a/(a-a);
				if(a==2) {
					int c[]= {1};
					c[42]= 99;
					
				}		
			}catch(ArrayStoreException e) {
				System.out.println("Array Index Out Of Bounds: " +e);
		}
			
		}catch(ArithmeticException e)
		{
			System.out.println("Devide by o:"+e);
		}
	}

}
