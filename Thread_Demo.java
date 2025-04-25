package threading;

public class Thread_Demo extends Thread {
	public void run()
	{
		System.out.println("This Method Is Created Using Thread class");
	}
	public static void main(String[] args)
	{
		Thread_Demo thread = new Thread_Demo();
		thread.start();
	}
}
