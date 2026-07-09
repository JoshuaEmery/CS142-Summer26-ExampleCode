
public class NonNumericTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String - used for text
		//if you see " " you are interacting with a String
		String firstName = "Josh";
		//If you put a + sign next to a string
		//you dont get math, you get concatenation
		String fullName = firstName + " Emery";
		System.out.println(fullName);
		
		//Char
		
		//char - stores one character only
		//wrapped in single quotes
		char grade = 'A';
		System.out.println("The grade is: " + grade);
		
		//boolean - stores true or false values only
		//used heavily for decisions and logic
		boolean isEnrolled = true;
		System.out.println("The student is enrolled: " + isEnrolled);
		
		//Casting
		//Casting is converting between two SIMILAR data types
		double pi = 3.14159654321;
		//cast pi to an int and store
		int piAsInt = (int)pi;
		float piAsFloat = (float)pi;
		//everything past the decimal point is dropped for int
		System.out.println("PI as an int: " + piAsInt);
		System.out.println("PI as a float: " + piAsFloat);
	}

}
