package vehicle;
import java.util.UUID;


public class Person {

	protected String FirstName;
	protected String LastName;
	protected UUID PersonID;
	
	public Person(String first, String last){
		FirstName = first;
		LastName = last;
		PersonID = UUID.randomUUID();
	}
	
	public String getFirstName(){
		return FirstName;
	}
	
	public String getLastName(){
		return LastName;
	}
	
	public UUID getPersonID(){
		return PersonID;
	}
	
	public void setFirstName(String name){
		FirstName = name;
	}
	
	public void setLastName(String name){
		LastName = name;
	}
	
	public void setPersonID(){
		PersonID = UUID.randomUUID();
	}
}
