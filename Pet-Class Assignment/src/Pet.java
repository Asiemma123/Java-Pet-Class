// Pet Class Assignment 


public class Pet {
	
	
	// Private instance variables 
	
	private String name;
	private int age;
	private String location;
	private String type;
	
	// no argument constructor 
	
	public Pet() {
		name="Kwabute";
		age= 6;
		location= "Tolleson";
		type =" Ageless";
	}
	
	// argument constructor 
	public Pet(String name,int age, String location,String type) {
		this.name=name;
		this.age=age;
		this.location=location;
		this.type=type;
		
		
	}
	
	// Setter method for name 
	
	public String setname()
	{
		return name;
	}
	
	//Setter method for age 
	
	public int age() {
		return age;
	}
	
	// Setter method for location 
	
	public String location() {
		return location;
	}
	
	
	//Setter method for type 
	
	public String type() {
		return type;
		
		
	}
	
	// Getter method for name 
	
	public void getname() {
		this.name=name;
		
	}
	
	// Getter method for age 
	
	public void getage() {
		this.age=age;
	}
	
	// Getter method for location 
	
	public void getlocation() {
		this.location=location;
		
	}
	
	// Getter method for type 
	public void gettype() {
		this.type=type;
	}

}
