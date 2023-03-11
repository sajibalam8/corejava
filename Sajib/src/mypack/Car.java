package mypack;

public class Car  extends Vehicle {

	private int numberOfSeats;
	


	public Car(String registrationNo,String name, String color,String vinNumber,  Engine engine, int numberOfSeats ) {
		super( registrationNo, name, color, vinNumber, engine);
		this.numberOfSeats=numberOfSeats;
		
	}

	
	public int getNumberOfSeats() {
		return numberOfSeats;
	}
	


	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}
	
	

	
	
	



	@Override
	public String toString() {
		return "Car [numberOfSeats=" + numberOfSeats + "]";
	}
	
	@Override
	public  int speed() {
		System.out.println("ChildMethod");
		return 22;
		
	}


	public int speed(int a, int b) {
		
		int c = a *b ;
		System.out.println("ParentMethod");
		return c;

	}
	

	public String speed(int a, int b, String d ,String e) {
		
		int c = a *b ;
		System.out.println("ParentMethod");
		return c+d+e;

	}
	

}
