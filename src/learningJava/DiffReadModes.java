package learningJava;
import java.util.Scanner;
public class DiffReadModes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Input a String
		Scanner s = new Scanner(System.in);
		String Name;
		
		System.out.println("Enter the String");
		Name = s.nextLine();
		System.out.println("The String is "+Name);
		
		//input a number
		int number;
		System.out.println("Enter the Number");
		number = s.nextInt();
		System.out.println("The Number is " +number);
		
		//input a boolean;
		boolean Boo;
		System.out.println("Enter the Condition");
		Boo = s.nextBoolean();
		System.out.println("The String is "+Boo);
	}
}
