// Below Program Check The Which Thread is Running in Your Current program using Java.

package threading;
public class Active_Thread {

	public static void main(String[] args) {
		Thread t= Thread.currentThread();
		String Threadname=t.getName();
		System.out.println("Current Thread is: "+Threadname);
	}
}
