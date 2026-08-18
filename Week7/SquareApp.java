
public class SquareApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square sq = new Square(5);
		Rectangle rect = new Rectangle(5, 10);
		Box box = new Box(2, 5, 10);
//		displaySquare(sq);
//		displaySquare(rect);
//		displaySquare(box);
		//If I make a collection of squares I can place rectangles and boxes in that collection
		//as well as squares
		Square[] squares = new Square[3];
		squares[0] = sq;
		squares[1] = rect;
		squares[2] = box;
		displaySquares(squares);
		System.out.println("Sqaure area: " + sq.area());
		System.out.println("Rectangle area: " + rect.area());
		System.out.println("Box area: " + box.area());
	}
	//If I make a method that takes in a Square (base class) as a parameter
	//I can pass any of these objects to it
	static void displaySquares(Square[] squares) {
		//if we take in a sqaure, we only have access to the methods from sqaure
		//we dont have a volume
		//System.out.println(sq.volume());
		System.out.println("----Displaying Sqaures----");
		for (int i = 0; i < squares.length; i++) {
			System.out.println("Length: " + squares[i].getLength());
			//We dont have access to width by default
			//System.out.println("Width: " + squares[i].);
			System.out.println("Area: " + squares[i].area());
		}
	}

}
