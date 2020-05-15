package learningJava;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//fact(1) = fact(1);
		//fact(2) = 2 * fact(1);
		//fact(3) = 3 * fact(2)
		//fact(4) = 4 * fact(3);
		System.out.print(Fact(5));
		

	}
	static int Fact(int Number)
	{
		if(Number == 1)
		{
			return 1;
		}
		else
		{
			return (Number * Fact(Number-1));
		}
		
	
	}

}
