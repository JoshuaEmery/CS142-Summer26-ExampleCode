
public class Line {
	//We want to make a class that represents a line on the cartesian plane
	//we could use individual primitives for each point or
	//make our own point class
	
	//A line is defined by two points
	private Point p1;
	private Point p2;
	
	//What comes next?
	//Containment by composition (STRONG OWNERSHIP)
	//The points live and die inside of the line. They do not exist outside of line
	//The line is responsible for creating and managing the points
	//you have to take in the fields for the points
	public Line(double x1, double y1, double x2, double y2) {
		this.p1 = new Point(x1, y1);
		this.p2 = new Point(x2, y2);
	}
	
	//Containment by Aggregation (WEAK OWNERSHIP)
	//Point exists outside of line, I can pass points to the constructor
	//The line references points but it does not own them
	public Line(Point p1, Point p2) {
		this.p1 = p1;
		this.p2 = p2;
	}

	//Getters and setters - you can either return the whole object from getters
	//or return the fields (primitives)
	//Here I am returning the points
	public Point getP1() {
		return p1;
	}

	public Point getP2() {
		return p2;
	}

	@Override
	public String toString() {
		return "Line[" + p1 + " => " + p2 +"]";
		
	}
	
	
	
	

}
