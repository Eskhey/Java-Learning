//PROGRAM TO FIND THE ANUAL SALARY

package learningJava;

public class SalaryCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String career;
		//salaryPerYear=ratePerhour*NumberOfWeeksPerYear
		System.out.println("Program is Starting");
		double rate;
		int NumberofWeeksPerYear = 48;
		rate=24.50;
		int HoursPerDay = 8;
		career="Software Devloper";
		double salaryPerYear = rate * NumberofWeeksPerYear * HoursPerDay;
		System.out.println("My Salary as a "+ career +"at the rate :"+ rate + "for a year is "+ salaryPerYear);
		
	}

}
