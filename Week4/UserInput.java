import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// To get input from the user you need a scanner object
		Scanner scanner = new Scanner(System.in);
		// We need a prompt (give the user instructions)
		System.out.println("Please enter your age");
		// we use the scanner object to capture a string
		String ageString = scanner.nextLine();
		// if you need a number, you must parse the string (convert from string to
		// number)
		int age = Integer.parseInt(ageString);
		if (age >= 18) {
			System.out.println("Eligible to vote");
		} else {
			System.out.println("Ineligible to vote");
		}
	}
	//lets make a method that will TRY to parse a string, if successful we will return
	//the number. if not successful we will return null
	static Double tryParseDouble(String input) {
		//we can run code that might cause an exception with a try/catch
		try {
			Double x = Double.parseDouble(input);
			//If I make it to this line, I know the parse worked
			return x;
		}
		catch(Exception ex) {
			return null;
		}
	}

}
