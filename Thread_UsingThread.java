package threading;
class Aa extends Thread
{
	public void run()
	{
		try
		{
			for(int i=0;i<5;i++)
			{
				System.out.println("The First Thread is: "+i);
				Thread.sleep(1000);
			}
		}
		catch(Exception ex)
		{
			System.out.println("This Exception is Occured"+ex);
		}	
	}
}
class Bb extends Thread
{

	public void run()
	{
		try
		{
			for(int i=0;i<10;i++)
			{
				if(i%2==0)
				{
					System.out.println("The Second Thread is: "+i);

				}
			}
		}catch(Exception ex)
		{
			System.out.println("The Error is: "+ex);
		}
	}
}

public class Thread_UsingThread {

	public static void main(String[] args) {
		Aa a1=new Aa();
		a1.start();
		
		Bb b1= new Bb();
		b1.start();	
	}
}