package threading;

public class Thread_Interface implements Runnable {
	public void run()
	{
		System.out.println("Thread is running created by implementing to Runnable Thread class");
	}

	public static void main(String[] args) {
		Thread_Interface ti = new Thread_Interface();
		
		Thread t =new Thread(ti);
		
		t.start();
	}

}
