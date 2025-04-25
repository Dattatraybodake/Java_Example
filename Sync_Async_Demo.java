package threading;

import java.util.Scanner;

class Table2
{
	int no;
	synchronized void displayTable(int no)
	{
		try
		{
			System.out.println("Multiplicatuon Table: ");
			for(int i=1;i<=10;i++)
			{
				System.out.printf("%d X %d = %d",i,no,i*no);
				if(i==5)
				{
					wait();
				}
				Thread.sleep(1000);
			}
		}
		catch(Exception ex)
		{
			System.out.println("Exception is: "+ex);
		}
	}
	synchronized void recall()
	{
		try
		{
			notifyAll();
		}
		catch(Exception ex)
		{
			System.out.println("The Error is: ");
		}
	}
}

class Thirteen extends Thread
{
	Table2 table;
	public void setTable(Table2 table)
	{
		this.table=table;
	}
	public void run()
	{
		table.displayTable(13);
	}
}
class Sixteen extends Thread
{
	Table2 table;
	public void settable(Table2 table)
	{
		this.table=table;
	}
	public void run()
	{
		table.displayTable(16);
	}

}
public class Sync_Async_Demo  {

	public static void main(String[] args) {
		Table2 t2= new Table2();
		Thirteen th = new Thirteen();
		th.setTable(t2);
		
		Sixteen s = new Sixteen();
		th.setTable(t2);
		
		th.setPriority(Thread.MAX_PRIORITY);
		s.setPriority(Thread.MIN_PRIORITY);
		
		do
		{
			Scanner sc = new Scanner(System.in);
			String msg = sc.nextLine();	
			if(msg.equals("restart"))
			{
				t2.recall();
			}
			if(msg.equals("stop"))
			{
				System.exit(0);
			}
			
		}while(true);
	}
}