package vehicle;


public abstract class Vehicle {

	protected String Name;
	protected String Color;
	protected double Weight;
	protected Person Owner;

	public Vehicle(String name, String color, double weight, Person owner) {
		super();
		Name = name;
		Color = color;
		Weight = weight;
		Owner = owner;
	}
	
	public void transferOwnership(Person newOwner){
		Owner = newOwner;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public double getWeight() {
		return Weight;
	}

	public void setWeight(double weight) {
		Weight = weight;
	}

	public Person getOwner() {
		return Owner;
	}

	public void setOwner(Person owner) {
		Owner = owner;
	}
	
}
