
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
		
		displayNum(10);
		
		double length = 25.2;
		double width = 3.0;
		double area = multiply(length, width);
		System.out.println("The area is: " + area);
		double height = 2.0;
		//methods are re-useable
		double volume = multiply(area, height);
		System.out.println("The volume is: " + volume);
		displayFullName("Josh", "Emery");
	}
	//lets make a method that takes in a whole number
	//and displays it to the user:
	static void displayNum(int num) {
		System.out.println("The number is: " + num);
	}
	//lets make a method that takes in two decimal numbers
	//multiplies them and returns the result
	static double multiply(double a, double b) {
		double result;
		result = a * b;		
		return result;
	}
	//Exercise 1:
	//lets make a method that converts a temp from C to F
	//take in the temp in C (double)
	//return the temp in F (double
	//display the result from main
	static double cToF(double cel) {
		double f;
		//calculate f making sure to avoid int division
		f = cel * 9.0 / 5.0 + 32;
		return f;
	}
	
	//Exercise 2:
	//Make a method that takes in a firstName and a lastName
	//and displays the first and last name to the console
	//with a space in between
	//inputs "Josh" "Emery"
	//should print out "Josh Emery"
	static void displayFullName(String firstName, String lastName) {
		System.out.println(firstName + " " + lastName);
	}
	
	//Exercise 3:
	//Write a method called hypotenuse
	//takes in the two non hypotenuse sides of a triangle
	//calculate and return the hypotenuse
	//remember Math.pow() and Math.sqrt()
	
	//Exercise 4:
	//Write a method called displayPayCheck that takes in a
	//hoursWorked, payRate, taxRate
	//Calculate netPay, taxAmount, grossPay
	//Display the paycheck stub with all of these variables
	
	
	
	
	
	
	
	
	
	
	
}
