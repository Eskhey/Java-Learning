package learningJava;

public class Days {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Day = "Sunday";
		switch(Day)
		{
			case("Monday") : System.out.println("Today is Monday");
							  	break;
			case("Tuesday") : System.out.println("Today is Tuesday");
			  					break;
			case("Wednesday") : System.out.println("Today is Wednesday");
			  					break;
			case("Thursday") : System.out.println("Today is Thursday");
			  					break;
			case("Friday")   : System.out.println("Today is Friday");
			  					break;
		   default 			: System.out.println("Yey!!, Today is Weekend");
			  					break;
							  
		}

	}

}
