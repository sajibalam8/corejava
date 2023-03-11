package mypack;

public class Bike extends Vehicle {

	private String paddle;



	public Bike(String registrationNo, String name, String color, String vinNumber, Engine engine,String paddle) {
		super(registrationNo, name, color, vinNumber, engine);
		this.paddle = paddle;
	}
		
		public String getPaddle() {
			return paddle;
		}


		public void setPaddle(String paddle) {
			this.paddle = paddle;
		}
		
		@Override
		public String toString() {
			return "Bike [paddle=" + paddle + "]";
		}
	}	
		
		
	
		
