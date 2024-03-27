package parkingLot;

public class Vehicle {

	private String brand;
	private int year;
	private int engine;
	
	//getters and setters
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getEngine() {
		return engine;
	}

	public void setEngine(int engine) {
		this.engine = engine;
	}
	
	//constructor
	public Vehicle (String brand, int year, int engine)
	{
		this.brand = brand;
		this.year = year;
		this.engine = engine;
	}

	
	@Override
	public String toString() {
		return "Vehicle [Brand= " + brand + ", Year= " + year + ", Engine= " + engine + " ";
	}

	
}
