package mytest2;

public class Beauty extends Product {
	private String color;

	public Beauty(String itemNumber, String name, int price, String color) {

		super(itemNumber, name, price);
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Beauty [color=" + color + "]"+super.toString()
		;
	}

}
