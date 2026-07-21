
public class IntroToLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 20;
		int y = 10;
		
		//Operators that make a comparison between values and evaulate
		//to either true or false
		// == Equality (This is not assignment)
		// != Not Equal, The ! by itself can be read as not or the opposite of
		// > Greater Than
		// >= GTE
		// < Less Than
		// <= LTE
		
		//The operators can be used to create boolean variables
		boolean b1 = x == y;
		boolean b2 = x > y;
		System.out.println("x == y: " + b1);
		System.out.println("x > y: " + b2);
		//It is also possible to embed the boolean statement
		System.out.println("X not equal y: " + (x != y));
		
		//if(condition)  - condition is simply a true or false statement
		//after the if we make a code block. that code block will only run
		//when the condition is true
		if(1 > 0) {
			System.out.println("This code block always runs");
		}
		//when an else block is attached to an if, we get a code block that runs
		//when the condition is false
		double temperature = 80;
		if(temperature > 75) {
			System.out.println("You dont need a jacket");
		}
		else {
			System.out.println("You need a jacket");
		}
		//we need to handle a number being positive or negative
		int number = 7;
		if(number < 0) {
			System.out.println("less than zero: " + number);
		}
		else if(number > 0){
			System.out.println("greater than zero: " + number);
		}
		else {
			//what do I know logically if I make it down here
			System.out.println("The number is zero: " + number);
		}
		//lets see if we can combine our example here odd/even and positive negative
		//given number I want to know if it is pos and even, pos and odd, negative and even
		//or negative and odd, 0 is always even
		if(number == 0) {
			System.out.println("zero and even");
		}
		else if(number > 0) {
			//if we make it here we know number is positive
			if(number % 2 == 0) {
				//here we know number is even and positive
				System.out.println("pos and even");
			}
			else{
				//what do I know logically here?
				//number is odd and positive
				System.out.println("pos and odd");
			}
		}
		else {
			//If i hit this code block I know number is negative
			if(number % 2 == 0) {
				System.out.println("neg and even");
			}
			else {
				System.out.println("neg and odd");
			}
		}
		
	}

}
