package vehicle;


public class TestVehicle {

	 public void main(String[] args){
		 Person a = new Person("John", "Doe");
		 Car car = new Car("Corvette", "Blue", 10000, a);
		 car.setNumberOfDoors(4);
		 Truck truck = new Truck("F-150", "Red", 30000, a);
		 truck.setNumberOfAxels(2);
		 Person b = new Person("Bob", "Barker");
		 truck.transferOwnership(b);
		 MotorCycle cycle = new MotorCycle("Ninja", "Green", 1000, a);
		 cycle.setHasSideCar(false);
	 }
}
