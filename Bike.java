package parkingLot;

public class Bike extends Vehicle {

	public Bike(String brand, int year, int engine, int cycle) {
		super(brand, year, engine);
		
		this.cycle = cycle;
	}

	private int cycle;

	@Override
	public String toString() {
		return super.toString() + "[Bike] Cycle= " + cycle + "]";
	}
}
