package parkingLot;

public class Car extends Vehicle {

	private int doors;
	private String fuel;
	
	public Car(String brand, int year, int engine, int doors, String fuel) {
		super(brand, year, engine);

		this.doors = doors;
		this.fuel = fuel;
	}


	@Override
	public String toString() {
		return super.toString() + "[Car] Doors= " + doors + ", Fuel= " + fuel + "]";
	}
	
	
	
}
