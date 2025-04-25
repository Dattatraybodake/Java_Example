package threading;

class Abc extends Thread
{
	public void run()
	{
		try
		{
			for(int i=1;i<5;i++)
			{
				System.out.println("First Thread is: "+i);
				if(i==3)
				{
					stop();
				}
				Thread.sleep(2000);
			}
		}
		catch(Exception ex)
		{
			System.out.println("Exception is: "+ex);
		}
	}
}
class Ab extends Thread
{
	public void run()
	{
		try
		{
			for(int i=1;i<10;i++)
			{
				System.out.println("Second Thread is: "+i);
				Thread.sleep(2000);
			}
		}
		catch(Exception ex)
		{
			System.out.println("Exception is: "+ex);
		}
	}
}

public class MultiThreading_Demo_2 {

	public static void main(String[] args) {
		Abc a= new Abc();
		a.start();

		Ab b= new Ab();
		b.start();

	}

}
