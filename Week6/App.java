
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating a new variable, its type is Vehicle
		//passing values for the fields to the constructor
		Vehicle vehicle1 = new Vehicle(-1000, "Honda", "Accord", 10000);
		System.out.println("Price before: " + vehicle1.getPrice());
		vehicle1.setPrice(5000);
		System.out.println("Price after: " + vehicle1.getPrice());
		
	}

}
