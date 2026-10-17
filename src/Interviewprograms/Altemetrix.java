package Interviewprograms;

import java.util.HashMap;
import java.util.Map;


enum VehicleType{
	CAR,
	BUS,
	TRUCK;
}
class Vehicle{
	private String vehiclenumber;
	private VehicleType type;
	public Vehicle(String number,VehicleType type) {
		this.vehiclenumber=number;
		this.type=type;
	}
	public void setVehicleNumber(String vehiclenumber) {
		this.vehiclenumber=vehiclenumber;
	}
	public String getVehicleNumber() {
		return this.vehiclenumber;
	}
	public void setVehicleType(VehicleType type) {
		this.type=type;
	}
	public VehicleType getVehicleType() {
		return this.type;
	}
}
class Parkinglot{
	Map<VehicleType,Integer> availableslots=new HashMap<>();
	public Parkinglot() {
		availableslots.put(VehicleType.CAR,10);
		availableslots.put(VehicleType.BUS,10);
		availableslots.put(VehicleType.TRUCK,10);
	}
	Map<String,Vehicle> parking=new HashMap<>();
	public void park(Vehicle v) {
		if(availableslots.get(v.getVehicleType())>0) {
			parking.put(v.getVehicleNumber(),v);
			availableslots.put(v.getVehicleType(),availableslots.get(v.getVehicleType())-1);
			System.out.println(v.getVehicleNumber()+" parked now");
		}
		else {
			System.out.println("parking full");
		}
	}
	public void unpark(String vehiclenumber) {
		Vehicle v=parking.remove(vehiclenumber);
		if(v==null) {
			System.out.println("vehicle not in parking");
		}
		else {
			availableslots.put(v.getVehicleType(),availableslots.get(v.getVehicleType())+1);
			System.out.println(v.getVehicleNumber()+" Vehicle unparked now");
		}
	}
	public void showslots() {
		System.out.println(availableslots);
	}
}
public class Altemetrix {
public static void main(String args[]) {
		Parkinglot lots=new Parkinglot();
		lots.showslots();
		lots.park(new Vehicle("TN09CX4221",VehicleType.BUS));
		lots.park(new Vehicle("TN09CX4222",VehicleType.CAR));
		lots.park(new Vehicle("TN09CX4223",VehicleType.TRUCK));
		lots.showslots();
		lots.unpark("TN09CX4221");
		lots.showslots();
	}

}

//output
/*{CAR=10, BUS=10, TRUCK=10}
TN09CX4221 parked now
TN09CX4222 parked now
TN09CX4223 parked now
{CAR=9, BUS=9, TRUCK=9}
TN09CX4221 Vehicle unparked now
{CAR=9, BUS=10, TRUCK=9}*/


