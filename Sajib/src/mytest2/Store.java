package mytest2;

import java.util.ArrayList;
import java.util.List;

public class Store implements IStore {
	ArrayList<Product> products = new ArrayList();
	public  ArrayList<Customer> customers = new ArrayList();
	ArrayList<Product> soldProducts = new ArrayList();

	@Override
	public void showProducts() {
		for (Product p : products) {
			System.out.println(p);
		}
	}

	@Override
	public void showCustomers() {
		// TODO Auto-generated method stub
		for (Customer c : customers) {
			System.out.println(c);
		}
	}

	@Override
	public void showSales() {
		double sum = 0;
		for (Product soldProduct : soldProducts) {
			sum = sum + soldProduct.getPrice();
			System.out.println(soldProduct);
		}
		System.out.println(sum);

	}

	@Override
	public void addInventory(List<Product> newProducts) {
		for (Product p : newProducts) {
			this.products.add(p);
		}

	}

	public  void getReceipt(Customer customer) {
		System.out.println(customer.getName());
		for (Product p : customer.getCart()) {
			System.out.println(p);
			soldProducts.add(p);
		}
		
		System.out.println(customer.getTotalPrice());
			
			
		}

	}

