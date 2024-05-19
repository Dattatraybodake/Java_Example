package classesandobject;
import java.util.Scanner;

class Product {
	private int id;
	private String name;
	private int qty;
	private int rate;
	private int total;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return qty;
	}

	public void setQuantity(int qty) {
		this.qty = qty;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	public int getTotal() {
		return total;
	}

	public void settotal(int total) {
		this.total = total;
	}
}

class CalculateBill {
	Product p[];

	void addNewProduct(Product... pp) {
		this.p = pp;
	}

	void calBill() {
		int sum=0;
		System.out.println("\n--------------------------------------------------");
		System.out.printf("Id \t Name \tQuantity  Rate  Total");
		System.out.println("\n--------------------------------------------------");

		for (int i = 0; i < p.length; i++) {
			System.out.println(p[i].getId() + "\t" + p[i].getName() + "\t" + p[i].getQuantity() + "\t" + p[i].getRate()+"\t\t"+p[i].getTotal());
			sum=sum+p[i].getTotal();
		}
		System.out.println("--------------------------------------------------");
		System.out.println("\t\tTotal Bill Is: "+sum);
		System.out.println("\n\n\n\t\t\t\t\t Thank You For Visiting!!! Visit Again");
	}
}

public class Store_Billing {

	public static void main(String x[]) {
		Scanner xyz = new Scanner(System.in);

		System.out.println("Enter Name of Consumer: ");
		String cname = xyz.nextLine();
		System.out.println("\nName of the Consumer: \t"+cname);

		CalculateBill cb = new CalculateBill();

		Product pr = new Product();
		pr.setId(1);
		pr.setName("Parle\t");
		pr.setQuantity(12);
		pr.setRate(50);
		pr.settotal(12*50);

		Product pr2 = new Product();
		pr2.setId(2);
		pr2.setName("Marrie\t");
		pr2.setQuantity(12);
		pr2.setRate(20);
		pr2.settotal(12*20);

		Product pr3 = new Product();
		pr3.setId(3);
		pr3.setName("Toast\t");
		pr3.setQuantity(17);
		pr3.setRate(20);
		pr3.settotal(17*20);

		cb.addNewProduct(pr, pr2, pr3);
		cb.calBill();
	}
}
