
public class MathOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//addition and subtration work how you would expect
		int a = 20;
		int b = 6;
		int sum = a + b;
		System.out.println("Sum is: " + sum);
		//subtration is similar
		//multiplication we use *
		int product = a * b;
		System.out.println("Product is: " + product);
		
		// division /
		//When you divide two ints you get an int result
		//the decimal portion is dropped, not rounded
		int quotient = a / b;
		//this avoids int division because 3.0 is a double
		double quotient2 = 5 / 3.0;
		System.out.println("Quotient is: " + quotient);
		
		//% Modulus - mod
		// Returns the WHOLE NUMBER remainder of division
		int remainder = a % b;
		System.out.println("Remainder is: " + remainder);
		
		//Order of operations
		//1 Parentheses
		//2 Mult, Div, Mod
		//3 Add Subtract
		//Assignment is always last
		
		//Use a current value of a variable to calculate a new value
		//for the same variable
		int count = 10;
		//use the current value of count to calculate a new one
		count = count + 5;
		//this was too much work for lazy programmers
		//lets add 5 to count again
		count += 5;//this is short for count = count + 5;
		count *= 2;//count = count * 2;
		//if you only need to add or subtract1 you can use ++ --
		count++;//This is short for count = count + 1;
		count--;//This is short for count = count - 1;
		
	}

}
