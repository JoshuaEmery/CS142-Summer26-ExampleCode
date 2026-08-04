import java.util.Random;

public class IntroToArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Array is a fixed size, ordered collection of values of the same type
		
		//The length (size, count) is how many elements it can store
		//Length is set when array is created and cannot be changed
		
		//Elements are the values inside of the array
		//The indices are the locations of each value
		//The index provides access to the element
		
		//Arrays are zero-indexed, the first element is at index 0
		//The last element is at index length - 1
		
		//Create an array
		//Array where the values are not yet known
		//dataType[] arrayName = new dataType[LENGTH];
		double[] testScores = new double[20];
		
		//You can also create an array where the values are known
		int[] temperatures = {90, 80, 75, 72, 68, 91};
		
		//you can also use strings
		String[] daysWeek = {"Sunday", "Monday", "Tuesday", 
				"Wednesday", "Thursday", "Friday", "Saturday"};
		
		//Elements are accessed by index
		//nameOfArray[index]
		System.out.println("First Temperature: " + temperatures[0]);
		//I can read the elements as well as change them
		temperatures[0] = 88;
		System.out.println("First Temperature: " + temperatures[0]);
		
		System.out.println(daysWeek[6]);
		
		//When interacting with an array you almost always use a loop
		//we use i as the variable because it stands for index
		for(int i = 0; i < daysWeek.length; i++) {
			//lets print out both the index and the element
			System.out.println("Index: " + i + " Element: " + daysWeek[i]);
		}
		//Copy paste and modify the loop so it prints out days of the week
		//backwards
		//Think about what values of i we want to get out of the loop
		//We need i to start at 6
		//decrease by 1 each iteration
		//and include 0 but stop after 0
		for(int i = daysWeek.length - 1; i >= 0; i--) {
			//lets print out both the index and the element
			System.out.println("Index: " + i + " Element: " + daysWeek[i]);
		}
		System.out.println("====Calling our Array Methods====");
		//Calling our array methods
		int[] numbers = randomArray(20);
		displayArray(numbers);
		int max = findMax(numbers);
		System.out.println(max);
		
		
	}
	//lets make a method that takes in an int[] and print out the index and
	//the element
	static void displayArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println("Index: " + i + " Element: " + array[i]);
		}
	}
	//lets make a method that takes in a SIZE and returns an int[] filled
	//with SIZE random numbers 0-99
	static int[] randomArray(int length) {
		int[] result = new int[length];
		Random rand = new Random();
		//for loop down here
		for(int i = 0; i < result.length; i++) {
			result[i] = rand.nextInt(100);
		}
		return result;
	}
	//lets make a method that takes in an int[] and an int searchValue
	//go through the array and see if searchValue exists in the array
	//If you find it return the index where you found it
	//If not return -1 
	static int find(int[] array, int searchValue) {
		for (int i = 0; i < array.length; i++) {
			//check if the element at index i == searchValue
			if(array[i] == searchValue) {
				return i;
			}
		}
		//what do I know logically if I make it down here?
		return -1;
	}
	//create a method that takes in an int[] and returns
	//the largest element inside of that array
	static int findMax(int[] array) {
		//start off with a max as the first (or last element)
		int max = array[0];
		//start off with i at 1 since we already have the element at 0
		for(int i = 1; i < array.length; i++) {
			//we check for a new max
			if(max < array[i]) {
				max = array[i];
			}
		}
		return max;
	}
}
