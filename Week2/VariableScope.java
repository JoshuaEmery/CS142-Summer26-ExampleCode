
public class VariableScope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Variables are scoped to the code block
		// where they are DECLARED
		// x lives and dies inside of this code block
		{
			int x = 5;
		}
		// If a make another code block that declares x
		// this does not create problems
		{
			int x = 5;
			// from inside this code block I can access x
			System.out.println(x);
		}
		// I cannot reach x from here
		// int y = x + 5;
		// I can name my variables the same thing in main as they are
		// called in the method without any compile errors
		double base = 25;
		double height = 10;
		double area = areaTriangle(base, height);
		System.out.println("The area is: " + area);
		// area is scoped to main, and still in scope
		// so I cannot declare another area
		// {
		// double area = 125.0;
		// }

	}

	static double areaTriangle(double base, double height) {
		double area = base * height / 2;
		return area;
	}

}
