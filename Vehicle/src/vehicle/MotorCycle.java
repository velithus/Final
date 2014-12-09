package vehicle;


public class MotorCycle extends Vehicle implements iVehicle {

	protected boolean hasSideCar;

	public MotorCycle(String name, String color, double weight, Person owner) {
		super(name, color, weight, owner);
	}

	public boolean getHasSideCar() {
		return hasSideCar;
	}

	public void setHasSideCar(boolean hasSideCar) {
		this.hasSideCar = hasSideCar;
	}

	public void transferOwnership(Person newOwner){
		Owner = newOwner;
	}
}
