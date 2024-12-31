// The Below Java program demonstrates the use of multithreading with the Thread.join() method.
package threading;

class First extends Thread
{
	public void run()
	{
		try
		{
			for(int i=1;i<5;i++)
			{
				System.out.println("First Thread is: "+i);
				sleep(3000);
			}
		}
		catch(Exception ex)
		{
			System.out.println("Erro is: "+ex);
			
		}
	}
}

class Second extends Thread
{
	public void run()
	{
		try
		{
			for(int i=1;i<5;i++)
			{
				System.out.println("Second Thread is: "+i);
				sleep(2000);
			}
		}
		catch(Exception ex)
		{
			System.out.println("Error is: "+ex);
		}
	}
}

public class Join_demo {

		public static void main(String[] args) throws InterruptedException {

			First f = new First();
			f.start();
			f.join();
			System.out.println("Now Status of First Thread is: "+f.isAlive());
			
			Second s = new Second();
			s.start();
			System.out.println("Now Status of Send Thread is: "+s.isAlive());
		}
	}