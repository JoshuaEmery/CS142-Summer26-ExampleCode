
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
		this.year = year;
		this.make = make;
		this.model = model;
		this.price = price;
	}

}
