package collection_list_arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ProductApplication {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Product> ar = new ArrayList<Product>();

		ar.add(new Product(1,"Parle",40.00,20,"parle"));
		ar.add(new Product(2, "Bourbon", 20.00, 10, "Brittania"));
		ar.add(new Product(3, "Good Day", 50.00, 25, "Brittania"));
		ar.add(new Product(4, "Hide & Seek", 50.00, 28, "Parle"));
		ar.add(new Product(5, "Marie", 8.0, 15, "Sunfeast"));
		ar.add(new Product(6, "Oreo", 25.0, 8, "Cadbury"));
		ar.add(new Product(7, "Milk Bikis", 12.0, 12 ,"Britannia"));
		ar.add(new Product(8, "Treat", 18.0, 9, "Britannia"));
		ar.add(new Product(9, "Krackjack",15.0, 12, "Parle"));
		ar.add(new Product(10, "Jim Jam", 20.0, 18,"Britannia"));


		int choise;
		do
		{
			System.out.println("Enter the Choise Number: ");
			choise=sc.nextInt();

			switch(choise)
			{
			case 1: System.out.println("View All Products: ");
			System.out.printf("%-10s %-20s %-15s %-10s %-10s %-15s\n", "Product Id", "Product Name", "Company", "Quantity", "Rate", "Total Price");
			System.out.println("----------------------------------------------------------------------------------------");

			double grandtotal = 0;
			for (Product p : ar) {
				double total = p.getRate() * p.getQuantity();
				System.out.printf("%-10d %-20s %-15s %-10d %-10.2f %-15.2f\n", p.getId(), p.getName(), p.getCompany(), p.getQuantity(), p.getRate(), total);
				grandtotal += total;

				// If you wish to display the cumulative grand total immediately after each product is added, use this approach.
				System.out.printf("\n \t\t\t\t\t\t Grand Total Amount: %.2f\n", +grandtotal);

			}	
//	            System.out.printf("\n \t\t\t\t\t\t Grand Total Amount: %.2f\n", +grandtotal);
			break;

			case 2: System.out.println("Search Product By Name: ");
			System.out.println("Enter the Product Name for Search: ");
			String name = sc.next();
			boolean b = false;
			for(Product p: ar)
			{
				if(p.getName().equalsIgnoreCase(name))
				{
					b = true;
					System.out.println("Product=\t"+p);
					break;
				}        		
			}
			if(b)
			{
				System.out.println("Product is Found");

			}
			else
			{
				System.out.println("Produc is Not Found");
			}
			break;

			case 3: System.out.println("Delete Product BY ID");
			System.out.println("Enter the ID for Delete: \n");
			int delId= sc.nextInt();
			
			Iterator<Product> i = ar.iterator();
			
			boolean d = false;
			
			while(i.hasNext())
			{
				Product p = i.next();
				if(p.getId()==delId)
				{
					i.remove();
					d=true;
					break;
				}
			}
			if(d)
			{
				System.out.println("Product Deleted SuccessFully");
			}
			else
			{
				System.out.println("Product is Not Deleted");
			}
			
			
			break;
			case 4: System.out.println("Exist in Application");
			break;
			default: System.out.println("Wrong Chosie Number");
			}

		}while(choise!=4);
		sc.close();
	}
}