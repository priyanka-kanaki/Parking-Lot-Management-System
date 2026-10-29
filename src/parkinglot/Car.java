package parkinglot;

public class Car extends Vehicle{

	public Car(String vehicleNo, String ownerName) {
		super(vehicleNo, ownerName);
	}
	
	@Override
	 public void displayVehicleInfo() {
		System.out.println("Vehicle Type : CAR" );
		System.out.println("Vehicle Number : "+ getVehicleNo());
		System.out.println("Owner name : "+ getOwnerName());
	}

}
