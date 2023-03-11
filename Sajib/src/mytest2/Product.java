package mytest2;

public class Product {
	private String itemNumber;
	private String name;
	private int price;
	
	
	public Product(String itemNumber, String name, int price) {
		super();
		this.itemNumber = itemNumber;
		this.name = name;
		this.price = price;
	}
	
	
	
	public String getItemNumber() {
		return itemNumber;
	}
	public void setItemNumber(String itemNumber) {
		this.itemNumber = itemNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}



	@Override
	public String toString() {
		return "Product [itemNumber=" + itemNumber + ", name=" + name + ", price=" + price + "]";
	}
	
	
	
	

}
