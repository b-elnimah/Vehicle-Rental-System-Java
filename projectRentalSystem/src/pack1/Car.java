package pack1;

public class Car extends Vehicle {

	private String bodyType;
	private String gearType;
	private String engineSize;
	
	public Car(int vehicleNo, String make, String brand, String model, int modelYear, boolean available,
			double dailyRate, String bodyType, String gearType, String engineSize) {
		super(vehicleNo, make, brand, model, modelYear, available, dailyRate);
		this.bodyType = bodyType;
		this.gearType = gearType;
		this.engineSize = engineSize;
	}
	
//	@Override
//	public void findVehicle() {
//		
//	}
//	@Override
//	public void registerVehicle() {
//		
//	}

	@Override
	public Object[] getRow () {
		
		Object [] row = super.getRow();
		row [11] = this.bodyType;
		row [10] = this.gearType;
		row [9 ] = this.engineSize;
		
		return row;
	}
	
	public String getBodyType() {
		return bodyType;
	}

	public void setBodyType(String bodyType) {
		this.bodyType = bodyType;
	}

	public String getGearType() {
		return gearType;
	}

	public void setGearType(String gearType) {
		this.gearType = gearType;
	}

	public String getEngineSize() {
		return engineSize;
	}

	public void setEngineSize(String engineSize) {
		this.engineSize = engineSize;
	}

	@Override
	public String toString() {
		// TODO fix spacing
		return super.toString() + String.format("| Type: Car | Body: %s | Gear: %s | Engine: %s |", bodyType, gearType, engineSize);
	}
}

//vehicleNo | make | brand | model | year | available | dailyrate | seats | driver | bodyType | gearType | engineSize