
public class WholeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//to create a variable first we give it a type
		//then a name.
		//You can also assign a value at this point
		int x = 5;
		int y;
		y = 6;
		//I can assign a value as many times as I want
		//but I declare only once
		x = 10;
		y = -10;
		//int y;
		//int x = 100;
		//5 billion is outside of the capacity of int
		//x = 5_000_000_000;
		//10 cents is outside of the capacity of int
		//x = .10;
		//int is 32bits -> -2.1b ~ +2.1b
		//long is a 64bits, use for numbers > 2.1b
		long nationalDebt = 4_000_000_000_000l;
		//byte - 8 bit whole number -> -128 ~ 127
		//short - 16 bit whole number -> -32k ~ + 32k
		//sout ctrl + space
		System.out.println("The national debt is:");
		System.out.println(nationalDebt);
		
	}

}
