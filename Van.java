package parkingLot;

public class Van extends Vehicle {
	
	private int maxLoad;
	
	public Van(String brand, int year, int engine, int maxLoad) {
		super(brand, year, engine);

		this.maxLoad = maxLoad;
	}



	@Override
	public String toString() {
		return super.toString() + "[Van] Max Load=" + maxLoad + "]";
	}
	
	
}
