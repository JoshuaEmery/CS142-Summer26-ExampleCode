
public class MoreMethods {
	
	public static void main(String[] args) {
		//Calling methods: void vs return
		//sysout takes a String as a param and returns nothing (void)
		System.out.println("sysout returns a void");
		
		//Calling methods with returns
		//Math.ceil() takes a double as a parameter and returns a double
		//goes up to next 
		double ceiling = Math.ceil(3.1);
		System.out.println("Ceiling: " + ceiling);
		//Math.floor() takes double returns double goes down to the
		//whole number
		double floor = Math.floor(3.9);
		System.out.println("Floor: " + floor);
		//Math.pow() takes two doubles, raises the first to the power
		//of the second, returns the result as a double
		double result = Math.pow(ceiling, floor);
		System.out.println("Result: " + result);
	}
	//lets make a method that takes in a whole number
	//and displays it to the user:
	static void displayNum(int num) {
		System.out.println("The number is: " + num);
	}
}
