package jVehicle;

import static org.junit.Assert.*;

import org.junit.Test;

import vehicle.Car;
import vehicle.MotorCycle;
import vehicle.Person;
import vehicle.Truck;

public class jVehicleTest {

	@Test
	public void test() {
		Person a = new Person("John", "Doe");
		 Car car = new Car("Corvette", "Blue", 10000, a);
		 car.setNumberOfDoors(4);
		 Truck truck = new Truck("F-150", "Red", 30000, a);
		 truck.setNumberOfAxels(2);
		 
		assertEquals(a, car.getOwner());
		assertEquals(4, car.getNumberOfDoors());
		assertEquals(a, truck.getOwner());
		assertEquals(2, truck.getNumberOfAxels());
		
		 Person b = new Person("Bob", "Barker");
		 truck.transferOwnership(b);
		 MotorCycle cycle = new MotorCycle("Ninja", "Green", 1000, a);
		 cycle.setHasSideCar(false);
		 
		assertEquals(b, truck.getOwner());
		assertEquals(false, cycle.getHasSideCar());
	}

}
