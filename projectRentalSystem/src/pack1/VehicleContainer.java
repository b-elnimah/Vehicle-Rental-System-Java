package pack1;

import java.util.ArrayList;

public class VehicleContainer {
	
	private static ArrayList <Vehicle> vehicles = new ArrayList<Vehicle>();
	
	public static void addVehicle(Vehicle vehicle) {
		System.out.println("Added vehicle");
		vehicles.add(vehicle);
	}
	
	public static String getVehicleStringByID (int vehicleNo) {
		String vehicleString = "";
		
		for (int i = 0; i < vehicles.size(); i++) {
			if(vehicles.get(i).getVehicleNo() == vehicleNo) 
				return vehicleString + vehicles.get(i).toString();
		}
		
		return null;
	}
	
	public static Vehicle getVehicleByID (int vehicleNo) {
		for (int i = 0; i < vehicles.size(); i++) {
			if(vehicles.get(i).getVehicleNo() == vehicleNo) 
				return vehicles.get(i);
		}
		
		return null;
	}
	
	public static String getAllVehicles () {
		String vehicleString =  "";
		
		for (int i = 0; i < vehicles.size(); i++) {
			int listNumber = i+1;
			vehicleString += listNumber + "- " + vehicles.get(i).toString() + "\n\n";
		}
		
		return vehicleString;
	}
	
	public static String getAllRentedVehicles() {
		String vehicleString =  "";

		for (int i = 0; i < vehicles.size(); i++) {
			int listNumber = i+1;
			if(!vehicles.get(i).isAvailable())
				vehicleString += listNumber + "- " + vehicles.get(i).toString() + "\n\n";
		}
		
		return vehicleString;
	}
	
	public static void makeUnavailable(int vNo) {
		for (int i = 0; i < vehicles.size(); i++) {
			if(vehicles.get(i).getVehicleNo() == vNo) 
				vehicles.get(i).setAvailable(false);
			
		}
	}
	
	public static void makeAvailable(int vNo) {
		for (int i = 0; i < vehicles.size(); i++) {
			if(vehicles.get(i).getVehicleNo() == vNo)
				vehicles.get(i).setAvailable(true);
		}
	}
	
	public static int getLastVehicleIndex() {
		return vehicles.size();
	}
	
	public static Vehicle getVehicleAtIndex (int index) {
		return vehicles.get(index);
	}
	
}

