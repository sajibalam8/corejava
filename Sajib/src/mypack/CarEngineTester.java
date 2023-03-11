package mypack;

import javax.sound.midi.Track;

public class CarEngineTester {
	/// Composition

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car = new Car("123", "hyundaielantra2016", "blue", "456", new Engine(1, 2, 3), 3);
		
		System.out.println(car.speed());
		System.out.println(car.speed(3,4));
		System.out.println(car.speed(3,4,"Sajib","Alam"));

		
	//Truck
	
	Truck truck = new Truck("123", "chevybulldozer", "blue", "456", new Engine(1, 2, 3), 3);

	System.out.println(truck.speed());

		Vehicle bike = new Bike("123", "honda", "blue", "456", new Engine(1, 2, 3), "square");
		Bike  bike3=(Bike) bike ;
		bike3.getPaddle();
		
		/// we can save any type of child object in a parent type variabrl
		Bike bike2 = new Bike("123", "honda", "blue", "456", new Engine(1, 2, 3), "square");
		
		//bike2.getPaddle()
		Vehicle a[]  = new Vehicle [3];
		a[0]=car;
		//a[1]=truck;
		//a[2]=bike;
		///Parent type can hold any object of its child in an array 
		System.out.println("CarResult"+speedAndAccelerationMultiplication(car) );
		System.out.println("BikeResult"+speedAndAccelerationMultiplication(bike) );
		System.out.println("TruckResult"+speedAndAccelerationMultiplication(truck) );
	}
	
	
	
	public static int speedAndAccelerationMultiplication(Vehicle vehicle) {
		int result = vehicle.speed() * vehicle.getEngine().getAcceleration();
		return result;

	}




}
