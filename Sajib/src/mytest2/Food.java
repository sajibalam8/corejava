package mytest2;

public class Food extends Product {

	private String expirationDate;

	public Food(String itemNumber, String name, int price, String expirationDate) {
		super(itemNumber, name, price);
		this.expirationDate = expirationDate;
		// TODO Auto-generated constructor stub
	}

	public String getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}

	@Override
	public String toString() {
		return "Food [expirationDate=" + expirationDate + "]"+super.toString();
	}

}
