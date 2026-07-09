
public class DecimalNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Floating Point types (numbers with decimals)
		//These do not have an exact range
		//They will round a number to make it fit
		//Capacity is measured in significant digits
		//The most common one is double 
		//64 bits ~ 15-17 sig digits
		double gpa = 3.85;
		double price = 19.99;
		System.out.println("GPA is: " + gpa );
		
		//float - 32 bit floating point data type
		//6-7 sig digits
		//when a making a float put an f at the end of
		//the value
		float temperature = 63.2f;
		//we could not fit 4 trillion in 32 bits (int)
		float nationalDebt = 4_000_000_000_000f;
		System.out.println("The debt is " + nationalDebt);
		
		
	}

}
