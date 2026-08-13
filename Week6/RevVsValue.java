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

	}

}
