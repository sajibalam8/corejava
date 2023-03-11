package mytest2;

import java.util.ArrayList;
import java.util.List;

public class DriverClass {

	public static void main(String[] args) {
		Product p1= new Book("123", "ManagerialAccounting", 25, "John Smith");
		Product p2= new Book("456", "ManagerialAccounting2", 50, "John Doe");

		Product p3= new Food("789", "Mango", 75, "01102023");
		Product p4= new Food("101112", "Apple", 100, "04102023");
		
		Product p5= new Beauty("789", "Nailpolish", 125, "Black");
		Product p6= new Beauty("101112", "Lipstick", 150, "Red");
		
		Store store = new Store();
		ArrayList<Product> items= new ArrayList();
		items.add(p1);items.add(p2);items.add(p3);items.add(p4);items.add(p5);items.add(p6);
		store.addInventory(List.of(p1,p2,p3,p4,p5,p6));
		
		
		Customer c = new Customer(CustomerType.Regular, "123", "JohnCamilla");
		c.addProduct(p1);
		c.addProduct(p2);
		store.getReceipt(c);

		Customer c1 = new Customer(CustomerType.Default, "123", "JohnGabriel");
		c1.addProduct(p1);
		c1.addProduct(p2);
		store.getReceipt(c1);
	}

}
