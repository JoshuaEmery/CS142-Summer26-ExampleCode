import java.util.Random;

public class IntroToWhileLoops {

	public static void main(String[] args) {
		// A loop is a block of code that runs repeatedly based on a boolean value

		// while(condition){
		// code we want to repeat
		// }

		// while is a pre-check loop. Check condition before each iteration of the loop
		// if the condition is initially false it never runs
		// if the condition never becomes false it runs forever

		// Three basic steps
		// 1. setup variables used by the loop
		// 2. condition determines how long the loop runs
		// 3. Update one or more of the variables involved in the condition

		int count = 1;
		while (count < 5) {
			// do some work
			System.out.println("Count: " + count);
			// update the variable involved in the condition
			count++; // count = count + 1;
		}
		// what is the value of count down here?
		System.out.println("Count after loop: " + count);

		// Create a loop that prints out 10, 9, 8, 7, 6 ... 1
		// ask the following, where do I want this variable to start
		// How do I want it to change
		// When do I want to stop
		int count2 = 10;
		while (count2 > 0) {
			System.out.println("Count 2: " + count2);
			count2--;
		}
		// Create a variable start and choose a value for it
		// we are going to add up all positive whole numbers
		// between 1 and start (include both 1 and start)
		// output the total, for example start = 5 should output 15
		int start = 5;
		int total = 0;
		while (start > 0) {
			// System.out.println("Start: " + start);
			// total = total + start;
			total += start;
			start--;
		}
		// when we exit the loop we have calculated the total
		System.out.println("Total: " + total);

		// Lets create loop with a variable that starts at 10 and
		// goes to 20. Include both 10 and 20
		// Print each even number to the console
		// Add each odd number to a total
		int i = 10;
		int oddTotal = 0;
		while (i < 21) {
			// System.out.println("i: " + i);
			if (i % 2 == 0) {
				System.out.println("i: " + i);
			} else {
				oddTotal += i;
			}
			i++;
		}
		System.out.println("Odd total: " + oddTotal);
		
		//Break and Continue
		// break immediately exits the loop - locked behind an if
		// continue - Skips to the next iteration of the loop
		int counter = 1;
		while(true) {
			if(counter == 5) {
				break;
			}
			counter++;
			if(counter == 2) {
				continue;
			}
			System.out.println("Break - Continue: " + counter);
		}
		
		//Lets win the powerball.
		//We need an instance of the random class
		Random rand = new Random();
		int myNumber = 5;
		//rand has a method called nextInt(upperBound)
		//it returns a number between 0 and upperBound - 1
		int winningNumber = rand.nextInt(292_000_000);
		int ticketsBought = 1;
		while(myNumber != winningNumber) {
			//buy another ticket and try again
			ticketsBought++;
			winningNumber = rand.nextInt(292_000_000);
			//If i output from inside of this loop its going to take
			//a very long time
			//System.out.println(winningNumber);
		}
		//If I end up down here I won!
		System.out.println("You won and you only bought " + ticketsBought + " tickets");
	}

}
