
public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//For loop is really just a shortcut for a while loop
		//with a counter that changes
		//for(st1; st2; st3){}
		//st1 - runs once before the loop starts (setup variables)
		//st2 - condition that is checked before each iteration
		//st3 - runs at the end of each iteration of the loop (change variables)
		//for loop that runs x times
		//for(int i = 0; i < x; i++)
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		//if i is declared in the for loop it is out of scope 
		//after the for loop
		//System.out.println(i);
		System.out.println("----Nested Loops----");
		//When one loop is nested in another, the inner loop
		//runs in its entirety for each iteration of the outer loop
		for(int i = 0; i < 4; i++) {
			
			for(int j = 0; j < 5; j++) {
				//This inner loop will run 20 (5 * 4)
				//The inner loops does the actual work
				System.out.print("[i: " + i + ", j: " + j + "] ");
			}
			//The outer loop moves to the next row
			System.out.println();
			}

	}

}
