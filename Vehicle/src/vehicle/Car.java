package vehicle;


public class Car extends Vehicle implements iVehicle {

	protected int NumberOfDoors;

	public Car(String name, String color, double weight, Person owner) {
		super(name, color, weight, owner);
	}
	
	public int getNumberOfDoors() {
		return NumberOfDoors;
	}

	public void setNumberOfDoors(int numberOfDoors) {
		NumberOfDoors = numberOfDoors;
	}

	public void transferOwnership(Person newOwner){
		Owner = newOwner;
	}
}
