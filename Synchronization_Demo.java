// The Below Java program demonstrates multithreading and synchronization by running two threads simultaneously.
package threading;

class PrintEven implements Runnable
{
	private static final Object lock = new Object();
	@Override
	synchronized public void run() {
		synchronized(lock)
		{
			for(int i=2; i<=10; i += 2)
			{
				System.out.println("Even Number: "+i);

				try
				{
					Thread.sleep(1000);
				}
				catch(Exception ex)
				{
					System.out.println("Exception is: "+ex);
				}
			}
		}
	}
}

class PrintOdd implements Runnable
{
	private static final Object lock = new Object();

	@Override
	synchronized public void run() {
		synchronized(lock)
		{
			for(int i=1; i<=10; i+=2)
			{
				System.out.println("Odd Number: "+i);

				try
				{
					Thread.sleep(1000);
				}
				catch(Exception ex)
				{
					System.out.println("Exception is: "+ex);
				}
			}
		}
	}
}

public class Synchronization_Demo{
	public static void main(String[] args) throws InterruptedException {

		Thread evenThread = new Thread(new PrintEven());
		Thread oddThread = new Thread(new PrintOdd());

		evenThread.start();
		oddThread.start();

		evenThread.join();
		oddThread.join();

		System.out.println("Both Thread is Completed");
	}
}
