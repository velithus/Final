package vehicle;


public class Truck extends Vehicle implements iVehicle {

	protected int NumberOfAxels;

	public Truck(String name, String color, double weight, Person owner) {
		super(name, color, weight, owner);
	}

	public int getNumberOfAxels() {
		return NumberOfAxels;
	}

	public void setNumberOfAxels(int numberOfAxels) {
		NumberOfAxels = numberOfAxels;
	}
	
	public void transferOwnership(Person newOwner){
		Owner = newOwner;
	}
	
}
