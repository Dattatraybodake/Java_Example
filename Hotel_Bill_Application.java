package classesandobject;

class Productt
{
	private int id;
	private String name;
	private int quantity;
	private int total;
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	private int price;
	
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public int getPrice()
	{
		return price;
	}
	public void setPrice(int price)
	{
		this.price=price;
	}
}
class Store
{
	Productt product[];
	void setProduct(Productt ...products)
	{
		this.product=products;
	}
	void showProduct()
	{
		int sum=0;
		System.out.println("======Snack Store Bill Application======");
		System.out.println("\t Id \t Name \t Price \t Quantity \t Total Price");
		System.out.println("---------------------------------------------------------------------------");

		
		for(int i=0;i<product.length;i++)
		{
			System.out.println("\t"+product[i].getId()+"\t"+product[i].getName()+"\t"+product[i].getPrice()+"\t"+product[i].getQuantity()+"\t\t"+product[i].getTotal()+"\n");
			System.out.println("---------------------------------------------------------------------------");
			sum=sum+product[i].getTotal();
		}
		System.out.println("\t\t\t\tThe Total Bill is= "+sum);
	}
}
public class Hotel_Bill_Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Store st=new Store();
		Productt pr=new Productt();
		pr.setId(1);
		pr.setName("Misal");
		pr.setPrice(120);
		pr.setQuantity(10);
		pr.setTotal(120*10);
		
		Productt pr2=new Productt();
		pr2.setId(2);
		pr2.setName("Vadapav");
		pr2.setPrice(50);
		pr2.setQuantity(25);
		pr2.setTotal(50*25);
		
		Productt pr3=new Productt();
		pr3.setId(3);
		pr3.setName("samosa");
		pr3.setPrice(60);
		pr3.setQuantity(16);
		pr3.setTotal(60*16);
		
		st.setProduct(pr,pr2,pr3);
		st.showProduct();
	}
}
