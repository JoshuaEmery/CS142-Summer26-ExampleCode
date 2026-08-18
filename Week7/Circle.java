public class Circle {
    // Fields
    // TODO: Declare fields centerX, centerY, and radius (all double)
	private double centerX;
	private double centerY;
	private double radius;
    // Constructor
    // TODO: Initialize centerX, centerY, and radius via parameters
    public Circle(double centerX, double centerY, double radius) {
		this.centerX = centerX;
		this.centerY = centerY;
		this.setRadius(radius);
	}
    // Getters
    // TODO: getCenterX()
    // TODO: getCenterY()
    // TODO: getRadius()
    
	public double getCenterX() {
		return centerX;
	}

	public double getCenterY() {
		return centerY;
	}

	public double getRadius() {
		return radius;
	}
    // Setters
    // TODO: setCenterX(double centerX)
    // TODO: setCenterY(double centerY)
    // TODO: setRadius(double radius)
	
	public void setCenterX(double centerX) {
		this.centerX = centerX;
	}

	public void setCenterY(double centerY) {
		this.centerY = centerY;
	}
	//We dont want to allow a radius of 0 or below
	public void setRadius(double radius) {
		if(radius <= 0) {
			throw new IllegalArgumentException("Radius must be greater than 0");
		}
		this.radius = radius;
	}
    // Instance Methods
    /**
     * Calculates the area of this circle.
     * Hint: Math.PI * r^2
     *
     * @return the area as a double
     */
    public double area() {
        // TODO
    	double area = Math.PI * radius * radius;
        return area;
    }


	/**
     * Calculates the circumference of this circle.
     * Hint: 2 * Math.PI * r
     *
     * @return the circumference as a double
     */
    public double circumference() {
        // TODO
    	double circ = 2 * Math.PI * radius;
        return circ;
    }

    //  toString() for easy testing
    @Override
    public String toString() {
        return "Circle[center=(" + centerX + ", " + centerY + "), radius=" + radius + "]";
    }
}