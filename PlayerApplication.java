package collection_list_arraylist;
import java.util.ArrayList;
import java.util.Scanner;

public class PlayerApplication {
	public static void main(String[] args) {
		ArrayList<Player> ar = new ArrayList<Player>();
		
		Player p1= new Player();
		p1.setId(1);
		p1.setName("Dhanraj");
		p1.setRun(150);
		
		Player p2 = new Player();
		p2.setId(12);
		p2.setName("Kumar");
		p2.setRun(200);
		
		ar.add(p1);
		ar.add(p2);
		
		//Display the Player info
		for(Object obj: ar)
		{
			Player p = (Player)obj;
			System.out.println(p.getId()+"\n"+p.getName()+"\n"+p.getRun()+"\n");
		}
		
		// Search the player Info
		System.out.println("Search the Player\n");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Player id");
		int pid = sc.nextInt();
		boolean b = false;
		for(Object o: ar)
		{
			Player pl = (Player)o;
			if(pl.getId() == pid)
			{
				b=true;
				break;
			}
		}
		if(b)
		{
			System.out.println("Player is Found");
		}
		else
		{
			System.out.println("Player is Not Found");
		}
		sc.close();
	}
}