package parkinglot;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("---------Parking Lot Management System----------");
		System.out.println("Enter Vehicle Type \n1.CAR \n2.TRUCK \n3.BIKE");
		int opt = sc.nextInt();
		
		System.out.println("Enter vehicle number :");
		String vehicleNo = sc.nextLine();
		System.out.println("Enter Owner Name :");
		String ownerName = sc.nextLine();
		
		Vehicle vehicle= null;
		
		switch(opt) {
		case 1:
			vehicle = new Car(vehicleNo, ownerName);
			break;
		case 2: 
			vehicle = new Truck(vehicleNo, ownerName);
			break;
				
		default :
			System.out.println("Invalid Input");
		}
		
	}

}
