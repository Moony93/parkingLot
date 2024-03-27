package parkingLot;

import java.util.Arrays;

public class Garage {

	private Vehicle[] garage = new Vehicle[15];
	
	
	//adds a vehicle to the garage
	public void addVehicle(Vehicle v)
	{
		for (int i = 0; i < garage.length; i++) 
		{
			if (garage[i] == null)
			{
				System.out.println("Added " + v.toString());
				garage[i] = v;
				break;
			}
			if (i == garage.length - 1 && garage[i] == null)
			{
				System.out.println("No slots available");
			}
		}
	}
	
	//remove the vehicle at the specified index slot
	public Vehicle removeVehicle(int index)
	{
		Vehicle removed = garage[index];
		garage[index] = null;
		System.out.println("Removed " + removed.toString());
		return removed;
	}
	
	//prints out the status of all the slots of the garage
	public void printGarageStatus()
	{
		System.out.println(this.toString());
	}
	
	
	@Override
	public String toString() {
		return "Garage Status= " + Arrays.toString(garage);
	}

	
	public static void main(String[] args) {

		Garage g = new Garage();
		
		Car Y = new Car("Lancia", 2007, 1350, 3, "Diesel");
		Van F = new Van("Ford", 2004, 1800, 3500);
		Bike M = new Bike("Yamaha", 2004, 600, 4);

		g.addVehicle(Y);
		g.addVehicle(F);
		g.addVehicle(M);

		g.printGarageStatus();
		
		g.removeVehicle(2);
		
		g.printGarageStatus();

		g.removeVehicle(1);

		g.printGarageStatus();
	}

}
