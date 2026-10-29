package parkinglot;

public abstract class Vehicle {
	private String vehicleNo;
	private String ownerName;
	
	public Vehicle(String vehicleNo, String ownerName) {
		this.vehicleNo = vehicleNo;
		this.ownerName = ownerName;
		
	}
	
	public String getVehicleNo() {
		return vehicleNo;
	}
	public String getOwnerName() {
		return ownerName;
	}	
    public abstract void displayVehicleInfo();

}
