package mytest2;

import java.util.ArrayList;
import java.util.Scanner;

import mytest.Student;

public class Menu {
	Scanner scan = new Scanner(System.in);
	private ArrayList<Product> cart = new ArrayList();
	private Customer c = null;
	private Store s = new Store();

	public Menu(){
		startMenu();
	};
	public void displayMenu() {

		System.out.println("1: Add product in cart ");
		System.out.println("2: Register Yourself ");
		System.out.println("3: Delete Product from cart");
		System.out.println("4: Checkout");
		System.out.println("5: See All Customers");
		System.out.println("6: Exit");

	}

	public void startMenu() {
		while (true) {
			displayMenu();

			int choice = scan.nextInt();

			switch (choice) {
			case 1:
				addProduct();
				break;
			case 2:
				registerCustomer();
				break;
			case 3:
				deleteProduct();
				break;
			case 4:
				checkout();
				break;
			case 5:
				seeAllCustomers();
				break;
			case 6:
				System.exit(0);
				break;
			default:
				System.out.println("Invalid Input");

			}

		}
	}

	public void addProduct() {
		if (c == null) {

			System.out.println("Please Register Customer");
			return;
		}
		System.out.println("enter the item number");
		String itemNumber = scan.next();
		System.out.println("enter the name");
		String name = scan.next();
		System.out.println("enter the price");
		int price = scan.nextInt();

		System.out.println("1: Book");
		System.out.println("2: Food");
		System.out.println("3: Beauty");
		int input = scan.nextInt();

		if (input == 1) {
			System.out.println("enter the author name ");
			String authorName = scan.next();

			Product p1 = new Book(itemNumber, name, price, authorName);
			c.addProduct(p1);

		}

		else if (input == 2) {
			System.out.println("enter the expiration date ");
			String expirationDate = scan.next();

			Product p1 = new Food(itemNumber, name, price, expirationDate);
			c.addProduct(p1);

		}

		else if (input == 3) {
			System.out.println("enter the color");
			String color = scan.next();

			Product p1 = new Beauty(itemNumber, name, price, color);
			c.addProduct(p1);

		}
	}

	public void registerCustomer() {
		// public Customer(CustomerType type, String id, String name ) {
	

			CustomerType T = null;
			System.out.println("enter the customer type");
			String customerType = scan.next();
			//T=CustomerType.valueOf(customerType);
			if ("Regular".equalsIgnoreCase(customerType)) {
				T = CustomerType.Regular;

			} else {

				T = CustomerType.Default;

			}
			
			System.out.println("enter the id");
			String id = scan.next();
			
			System.out.println("enter the name");
			String name = scan.next();
			c= new Customer(T, id, name);
			s.customers.add(c);
			
			
		}



	private void seeAllCustomers() {
		s.showCustomers();

	}

	private void checkout() {
		if (c!=null) {
		s.getReceipt(c);
		}

	}

	private void deleteProduct() {
		System.out.println("enter the item number you want to delete");
		String itemNumber = scan.next();
		c.removeProduct(itemNumber);
	}

}
