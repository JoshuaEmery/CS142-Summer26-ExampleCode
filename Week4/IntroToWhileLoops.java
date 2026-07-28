
public class IntroToWhileLoops {

	public static void main(String[] args) {
		// A loop is a block of code that runs repeatedly based on a boolean value
		
		//while(condition){
		//code we want to repeat
		//}
		
		//while is a pre-check loop. Check condition before each iteration of the loop
		//if the condition is initially false it never runs
		//if the condition never becomes false it runs forever
		
		//Three basic steps
		//1. setup variables used by the loop
		//2. condition determines how long the loop runs
		//3. Update one or more of the variables involved in the condition
		
		int count = 1;
		while(count < 5) {
			//do some work
			System.out.println("Count: " + count);
			//update the variable involved in the condition
			count++; //count = count + 1;
		}
		//what is the value of count down here?
		System.out.println("Count after loop: " + count);
		
		//Create a loop that prints out 10, 9, 8, 7, 6 ... 1
		//ask the following, where do I want this variable to start
		//How do I want it to change
		//When do I want to stop
		
		

	}

}
