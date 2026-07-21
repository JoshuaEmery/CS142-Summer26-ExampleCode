
public class LogicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//These combine two boolean values into one
		// && Logical and - both values must be true to get a true
		// || Logical or - both values must be false to get a false
		
		int x = 10;
		if(x > 0 && x % 2 == 0) {
			System.out.println("x is positive and even");
		}
		else {
			System.out.println("Here I dont know which caused it to fail");
		}
		
		if(x > 0 || x % 2 == 0) {
			System.out.println("Here I dont know which caused it to pass");
		}
		else {
			//Here I know both conditions failed
			System.out.println("x is not greater than 0, x is not even");
		}
		//if have a statement using && || and i need the opposite of that statement
		//I flip the operator
		//De Morgans Law
		//!(x == 0 || y == 0) = (x != 0 && y != 0)
		//!(x == 0 && y == 0) = (x !=0 || y != 0)
		
		//1 create a variable named age, give it a value
		//check the age variable and print you are eligible to vote when age >= 18
		//not eligible otherwise
		int age = 17;
		if(age >= 18) {
			System.out.println("You are eligible to vote");
		}
		else {
			System.out.println("You are not eligible to vote");
		}
		
		//2: create a variable and give it a value
		//write a condition that checks if the number is in the range 1-20 (include 1 and 20)
		//output that the number is in range or not
		
		int value = 21;
		if(value >= 1 && value <= 20) {
			System.out.println("Value is in range");
		}
		else {
			System.out.println("Value is not in range");
		}
		
		//3: create a method that checks for a valid grade on an assignment 0-100 
		// check if that grade is valid or invalid (include 0 and 100). 
		// A grade is invalid if it is not in the range
		// check for the invalid state first
		//-5 should fail, 80 should pass, 110 should fail
		//return true if the grade is valid false otherwise
		//isValid method
		
		
		//4: x and y are coordinates on a cartesian plane. write a decision structure which
		//determine what quadrant the pair lie in, also consider the point could be at origin
		//or on the x / y axis
		
	}
	static boolean isValid(double grade) {
		if(grade < 0 || grade > 100) {
			return false;
		}
		else {
			//I know grade >= 0 && grade <= 100
			return true;
		}
	}

}
