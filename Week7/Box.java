//Is a box a sqaure?
public class Box extends Rectangle {
	//Box has a length and width - shared with rectangle
	//adds a height
	private double height;
	public Box(double length, double width, double height) {
		super(length, width);
		this.height = height;	
	}
	//implement the getters/setters for the new fields
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	//A 3d box has a volume
	public double volume() {
		//I can access methods that live in the parent class from the child class
		return super.area() * height;
	}
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 2 * (super.area() + this.getWidth() * height + this.getLength() * height);
	}
	@Override
	public String toString() {
		return "Box [height=" + height + ", volume()=" + volume() + ", area()=" + area() + ", "
				+ "getWidth()=" + getWidth()
				+ ", getLength()=" + getLength() + "]";
	}
	
	
	
	
	
}
