package mytest2;

public class Book extends  Product{
	
	private String authorName;

	public Book(String itemNumber, String name, int price, String authorName) {
		super(itemNumber, name, price);
		this.authorName=authorName;
		// TODO Auto-generated constructor stub
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	@Override
	public String toString() {
		return "Book [authorName=" + authorName + "]"+super.toString();
	}
	
	
	
	
}
