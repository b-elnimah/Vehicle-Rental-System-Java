package pack1;
/**
 * This class is an extension of vehicle and therefore inherets all
 * the parameters of its super class it all determines the additional 
 * paramters and functions unique to a bus  
 * @author Amina Al Mukaini 20145303
 *
 */

public class Bus extends Vehicle {
	

	private int numberOfSeats;
	private String driversNationality;
	
	public Bus(int vehicleNo, String make, String brand, String model, int modelYear, boolean available,
			double dailyRate, int numberOfSeats, String driversNationality) {
		super(vehicleNo, make, brand, model, modelYear, available, dailyRate);
		this.numberOfSeats = numberOfSeats;
		this.driversNationality = driversNationality;
	}
	
//	@Override
//	public void findVehicle() {
//		
//	}
//	@Override
//	public void registerVehicle() {
//		
//	}
	/**
	 * 
	 */
	@Override
	public Object[] getRow () {
		
		Object [] row = super.getRow();
		row [8] = this.numberOfSeats;
		row [7] = this.driversNationality;

		return row;
	}
	
public int getNumberOfSeats() {
		return numberOfSeats;
	}

	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	public String getDriversNationality() {
		return driversNationality;
	}

	public void setDriversNationality(String driversNationality) {
		this.driversNationality = driversNationality;
	}

	//	
	@Override
	public String toString() {
		// TODO fix spacing
		return super.toString() + String.format("| Type: Bus | Seats: %d | Nationality: %s|", numberOfSeats, driversNationality);
	}
	
}

//vehicleNo | make | brand | model | year | available | dailyrate | seats | driver | bodyType | gearType | engineSize