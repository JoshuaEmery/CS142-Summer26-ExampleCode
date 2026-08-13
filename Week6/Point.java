
public class Point {
	//fields - private
	private double x;
	private double y;
	
	//What comes next?
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	//Methods - getters and setters

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "{X: " + x + " Y: " + y + "}";
	}
	
	
	
}
