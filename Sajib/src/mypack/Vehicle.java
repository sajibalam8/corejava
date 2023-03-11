package mypack;

public class Vehicle {

	private String registrationNo;
	private String name;
	public String color;
	private String vinNumber;
	private Engine engine;

	public Vehicle(String registrationNo, String name, String color, String vinNumber, Engine engine) {

		this.registrationNo = registrationNo;
		this.name = name;
		this.color = color;
		this.vinNumber = vinNumber;
		this.engine = engine;
	}

	public String getVinNumber() {
		return vinNumber;
	}

	public void setVinNumber(String vinNumber) {
		this.vinNumber = vinNumber;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public String getRegistrationNo() {
		return registrationNo;
	}

	public void setRegistrationNo(String registrationNo) {
		this.registrationNo = registrationNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Vehicle [registrationNo=" + registrationNo + ", name=" + name + ", color=" + color + ", vinNumber="
				+ vinNumber + ", engine=" + engine + "]";
	}

	public int speed() {
		System.out.println("ParentMethod");
		return 0;

	}
}
