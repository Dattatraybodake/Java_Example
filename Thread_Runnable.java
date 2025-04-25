package threading;

public class Thread_Runnable implements Runnable {

	@Override
	public void run() {
		try
		{
			for(int i=0;i<5;i++)
			{
				System.out.println("I= "+i);
				Thread.sleep(2000);
			}
		}
		catch(Exception ex)
		{
			System.out.println("The Exception is: "+ex);
		}
	}

	public static void main(String[] args)
	{
		Thread_Runnable tr= new Thread_Runnable();
		Thread th= new Thread(tr);
		th.start();
	}
}