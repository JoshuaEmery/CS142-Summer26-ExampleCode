
public class IntroTo2dArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//A 2d array is a grid and each element has two indices
		//row and the column
		//Every element is the same data type
		//the indices are always ints
		//dataType[][] grid = new dataType[rows][columns]
		int[][] grid = new int[3][4];
		//insert the number 10 into the first row second column
		grid[0][1] = 10;
		grid[1][1] = 20;
		displayGrid(grid);
		
	}
	//lets make a method that displays a 2d int array
	static void displayGrid(int[][] matrix) {
		//matrix.length gives me the number of rows
		//matrix[rowIndex].length i get the number of columns in that row
		for (int i = 0; i < matrix.length; i++) {
			//matrix[i].length gives me the number of columns in row i
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print("i: " + i + " j: " + j + " = " + matrix[i][j] + "   ");
			}
			System.out.println();
		}
	}
	

}
