//Rectangle shares length with square
public class Rectangle extends Square{
	//A rectangle cannot be a square unless it has AT A MINUMUM
	//a constructor which takes in a double.
	//We only add the new fields for sqaure
	private double width;

	public Rectangle(double length, double width) {
		//pass the length up to the base/parent constructor
		super(length);
		//assign the new fields
		this.width = width;
	}
	//Getters and setters for the new fields

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}
	//Area is calculated differently in rectangle than in square
	@Override
	public double area() {
		// We do not have direct access to the length field
		// we must use the getter
		return this.getLength() * width;
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", length=" + this.getLength() + 
				", area()=" + area() + "]";
	}
	
	
	
	
	
}
