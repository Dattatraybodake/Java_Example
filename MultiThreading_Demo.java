package threading;
class A extends Thread
{
	public void run()
	{
		try
		{
			for(int i=1;i<=10;i++)
			{
				System.out.println("The Element is: "+i);
				Thread.sleep(5000);
			}
		}
		catch(Exception ex)
		{
			System.out.println("Exception is : "+ex);			
		}
	}
}

public class MultiThreading_Demo {
	public static void main(String[] args)
	{
		A a1=new A();
		a1.start();
	}
}


/*Explanation: The program provided showcases a basic implementation of multithreading in Java. 
In the MultiThreading_demo class, an object of class A is instantiated and the start() method is called, 
which triggers the thread to begin execution. By using multithreading, the program allows for asynchronous operations, 
meaning the program can perform tasks concurrently, offering better utilization of system resources and responsiveness.
Additionally, the program includes a basic exception handling mechanism to catch any errors that might arise
during the execution of the run() method, ensuring the program can handle potential issues gracefully without crashing.
*/