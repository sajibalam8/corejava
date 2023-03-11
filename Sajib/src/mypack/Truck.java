package mypack;

public class Truck extends Vehicle {
	public Truck(String registrationNo, String name, String color, String vinNumber, Engine engine, int maxLoad) {
		super(registrationNo, name, color, vinNumber, engine);
		this.maxLoad= maxLoad;
	}


	private int maxLoad;

	
	public int getMaxLoad() {
		return maxLoad;
	}

	public void setMaxLoad(int maxLoad) {
		this.maxLoad = maxLoad;
	}

	@Override
	public String toString() {
		return "Truck [maxLoad=" + maxLoad + "]";
	}

}
