package mytest2;

import java.util.ArrayList;

public class Customer {
	private CustomerType type;
	private String id;
	private String name;
	
	private ArrayList<Product> cart = new ArrayList();

	public Customer(CustomerType type, String id, String name ) {
		super();
		this.type = type;
		this.id = id;
		this.name = name;
	}

	public CustomerType getType() {
		return type;
	}

	public void setType(CustomerType type) {
		this.type = type;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public ArrayList<Product> getCart() {
		return cart;
	}

	public void setCart(ArrayList<Product> cart) {
		this.cart = cart;
	}


	public void addProduct(Product product) {

		cart.add(product);

	}

	public void removeProduct(Product product) {

		cart.remove(product);

	}
	
	

	public double getTotalPrice() {

		double sum = 0;
		for (Product p : cart) {
			sum = sum + p.getPrice();
		}
		if (type.equals(CustomerType.Regular)) {
			sum = sum * 0.90;

		} else {

			sum = sum;
		}
		return sum;

	}
	

	@Override
	public String toString() {
		return "Customer [type=" + type + ", id=" + id + ", name=" + name + ", cart=" + cart + "]";
	}

}
