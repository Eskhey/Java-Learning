package learningJava;

public class LearningFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NameFunction();
		int a=50, b=25;
		AddFunction(a,b);
		double product = MultiplyFunction(a,b);
		System.out.println(product);
		System.out.print(MultiplyFunction(20,30));
		

	}
	static void NameFunction()
	{
		String name="Shahid";
		System.out.println("Name :"+name);
	}
	static void AddFunction(int NumberA,int NumberB)
	{
		int c=NumberA+NumberB;
		System.out.println("The sum of "+NumberA+" and "+NumberB+ " is "+c);
	}
	static double MultiplyFunction(int NumberA,int NumberB)
	{
		double prod= NumberA * NumberB * 0.10;
		return prod;
	}
	
	
}
