package collection_list_arraylist;

class Product
{
	private int id;
	private String name;
	private double rate;
	private int quantity;
	private int total;
	private String company;
	public Product(int id, String name, double rate, int quantity, String company) {
		this.id = id;
		this.name = name;
		this.rate = rate;
		this.quantity = quantity;
		this.company = company;
	}
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
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	@Override
	public String toString() {
		return "product [id=" + id + ", name=" + name + ", rate=" + rate + ", quantity=" + quantity + ", total=" + total
				+ ", company=" + company + "]";
	}	
}