
public class VariableScope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Variables are scoped to the code block
		//where they are DECLARED
		//x lives and dies inside of this code block
		{
			int x = 5;
		}
		//If a make another code block that declares x
		//this does not create problems
		{
			int x = 5;
			System.out.println(x);
		}
	}

}
