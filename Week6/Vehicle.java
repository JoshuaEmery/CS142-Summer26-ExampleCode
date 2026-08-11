
public class Vehicle {
	//fields - the information you want to capture about the object
	//should be private
	private int year;
	private String make; 
	private String model;
	private double price;
	//Constructor - special method that is called when we create
	//an instance of this object
	//assigns values to the fields, usually takes in value for them as well
	public Vehicle(int year, String make, String model, double price) {
		//we have a new keyword here called this
		//this refers to the instance of the class we are creating
		//assign the fields
		//calling the private set price method
		this.setYear(year);
		this.make = make;
		this.model = model;
		//we can either repeat the whole validation process from the setter here
		//or simply use the setter function in the constructor
		this.setPrice(price);
		}
	//methods
	//1. getters and setters - these are methods that control access to the fields
	//2. actions that the class can perform
	
	//getters and setters - if a field should have read access it will have a getter
	//if a field should have write access it will have a setter
	public int getYear() {
		return this.year;
	}
    //year should not be changed so we only have a getter
	public String getModel() {
		return this.model;
	}
	public String getMake() {
		return this.make;
	}
	//price needs to have read and write access

	public double getPrice() {
		return this.price;
	}
	//setter takes in a new value for price and changes the field
	public void setPrice(double price) {
		//validate the price that came into the method before setting the field
		if(price < 0) {
			//let the user(the programmer using our class) know that something went wrong
			//throwing an exception exits the method immediately
			throw new IllegalArgumentException("Price cannot be negative");
		}
		this.price = price;
	}
	//you can make a setter than can only be used from inside the class
	private void setYear(int year) {
		if(year < 0) {
			throw new IllegalArgumentException("Year cannot be negative");
		}
		this.year = year;
	}
	//customize the behavior of the toString method
	//toString is the method that sysout uses to display your object
	//overriding the toString method

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Year: " + year + " Make: " + make + " Model: " 
				+ model + " Price: " + price;
	}
	
	//A static method is a method which is accessible without creating an instance
	//of the vehicle.
	//You dont have to Vehicle vehicle = new Vehicle() to access this method
	static String testStatic() {
		//When you are inside of a static method there is no instance of vehicle to access
		//There is no this keyword
		//You dont have access to any of the fields
		return "This is a static method";
	}
	
	
	
	
	
	
	
}
