import java.util.Arrays;

public class RevVsValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Variable are stored in one of two ways
		// Value types (primitives)
		// Actual value is stored in the stack
		int x = 10;
		int y = x;
		System.out.println("x: " + x + " y: " + y);
		y = 20;
		System.out.println("x: " + x + " y: " + y);
		// Reference types store the value in the heap and then store
		// the address to value in the stack
		int[] numbers = { 1, 2, 3 };
		int[] numbers2 = numbers;
		System.out.println(Arrays.toString(numbers));
		System.out.println(Arrays.toString(numbers2));
		numbers2[1] = 100;
		System.out.println(Arrays.toString(numbers));
		System.out.println(Arrays.toString(numbers2));
		addToArray(numbers2);
		System.out.println(Arrays.toString(numbers));
		System.out.println(Arrays.toString(numbers2));
		//This is also true for objects, objects are reference type
		Vehicle v1 = new Vehicle(2000, "Honda", "Civic", 5000);
		System.out.println(v1);
		discount(v1);
		System.out.println(v1);
		//Strings are a weird exception, they are technically ref but behave like value
		String input = "Hello";
		String input2 = input;
		System.out.println(input);
		System.out.println(input2);
		input = "Substation";
		System.out.println(input);
		System.out.println(input2);

	}
	//These methods do not return anything, but because they take reference type
	//variables, they are able to change the objects in main()
	static void addToArray(int[] array) {
		array[0]++;
	}
	static void discount(Vehicle v) {
		v.setPrice(1000);
	}

}
