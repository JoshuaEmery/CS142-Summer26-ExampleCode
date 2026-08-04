
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
		
		
		
		
		

	}

}
