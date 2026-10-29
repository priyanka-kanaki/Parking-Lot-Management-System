package parkinglot;

public class Truck extends Vehicle{

	public Truck(String vehicleNo, String ownerName) {
		super(vehicleNo, ownerName);
	}
	
	@Override
	 public void displayVehicleInfo() {
		System.out.println("Vehicle Type : TRUCK" );
		System.out.println("Vehicle Number : "+ getVehicleNo());
		System.out.println("Owner name : "+ getOwnerName());
	}
}
