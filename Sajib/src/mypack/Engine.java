package mypack;

public class Engine  {
	private int speed;
	private int acceleration;
	private int oilConsumption;
	
	public Engine(int speed, int acceleration, int oilConsumption) {
		this.speed = speed;
		this.acceleration = acceleration;
		this.oilConsumption = oilConsumption;
	}
	
	
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getAcceleration() {
		return acceleration;
	}

	public void setAcceleration(int acceleration) {
		this.acceleration = acceleration;
	}

	public int getOilConsumption() {
		return oilConsumption;
	}

	public void setOilConsumption(int oilConsumption) {
		this.oilConsumption = oilConsumption;
	}
	
	
	
	@Override
	public String toString() {
		return "Engine [ speed=" + speed + ", acceleration="
				+ acceleration + ", oilConsumption=" + oilConsumption + "]";
	}

}
