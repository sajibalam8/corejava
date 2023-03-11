package mytest2;

import java.util.List;

public interface IStore {
	
	public void showProducts();
	public void showCustomers();
	public void showSales();
	public void addInventory(List <Product>product);
	public void getReceipt(Customer customer);
	

}
