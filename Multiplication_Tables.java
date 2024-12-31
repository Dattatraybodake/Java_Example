//The given Java program demonstrates multithreading and synchronization by generating multiplication tables concurrently in separate threads.
package threading;

class Table
{
	synchronized void showTable(int x)
	{
		try
		{
			for(int i=1;i<=10;i++)
			{
				System.out.printf("%d X %d = %d\n", x,i,i*x);
			}
		}
		catch(Exception ex) {
			System.out.println("Exception is: "+ex);
		}
	}
}

class Two extends Thread
{
	Table tabel;
	public void setTable(Table table)
	{
		this.tabel=table;
	}
	public void run()
	{
		tabel.showTable(2);
	}
}

class Three extends Thread
{
	Table table;
	public void setTable(Table table)
	{
		this.table=table;
	}
	public void run()
	{
		table.showTable(3);
	}
}

class Eight extends Thread
{
	Table table;
	public void setTable(Table table)
	{
		this.table= table;
	}
	public void run()
	{
		table.showTable(8);
	}
}

public class Multiplication_Tables {
	public static void main(String[] args) {

		Table t1 = new Table();
		
		
		Two t = new Two();
		t.setTable(t1);
		t.start();
		
		Three t2= new Three();
		t2.setTable(t1);
		t2.start();
	
		Eight e = new Eight();
		e.setTable(t1);
		e.start();	
	}
}
