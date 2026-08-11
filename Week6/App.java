
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating a new variable, its type is Vehicle
		//passing values for the fields to the constructor
		Vehicle vehicle1 = new Vehicle(2010, "Honda", "Accord", 10000);
		System.out.println("Price before: " + vehicle1.getPrice());
		vehicle1.setPrice(5000);
		System.out.println("Price after: " + vehicle1.getPrice());
		System.out.println(vehicle1);
		//Static methods are called on the class itself
		System.out.println(Vehicle.testStatic());
		
		//sysout is a static method, we never made an instance of an object first
		//Math.pow is a static method, we never made an instance of the math object first
		
	}

}
