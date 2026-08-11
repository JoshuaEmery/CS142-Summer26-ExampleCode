
public class IntroTo2dArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// A 2d array is a grid and each element has two indices
		// row and the column
		// Every element is the same data type
		// the indices are always ints
		// dataType[][] grid = new dataType[rows][columns]
		int[][] grid = new int[3][4];
		// insert the number 10 into the first row second column
		grid[0][1] = 10;
		grid[1][1] = 20;
		displayGrid(grid);
		// if all the values in the grid are known
		int[][] grid2 = { 
				{ 1, 2, 3 }, 
				{ 4, 5, 6 }, 
				{ 7, 8, 9 } 
			};
		
		displayGrid(grid2);
		//Extra Credit Problems
		//1. Create a method that takes a 2d int array and returns the sum
		//of all elements in the array
		
		//2. Create a method that takes in a 2d int array and returns a 
		//single dimension array where each element is the sum of all
		//the elements in the corresponding 2d array column
		
		/*
		 * for example
		 * 1, 4, 5
		 * 2, 10, 6
		 * 3, 5, 7
		 * 
		 * output [6, 19, 18]
		 * 		 * 
		 */

	}

	// lets make a method that displays a 2d int array
	static void displayGrid(int[][] matrix) {
		// matrix.length gives me the number of rows
		// matrix[rowIndex].length i get the number of columns in that row
		for (int i = 0; i < matrix.length; i++) {
			// matrix[i].length gives me the number of columns in row i
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print("i: " + i + " j: " + j + " = " + matrix[i][j] + "   ");
			}
			System.out.println();
		}
	}

}
