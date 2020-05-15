
//PROGRAM TO DETERMINE IF YOU HAVE PASSED OR FAILED!
package learningJava;

public class ExamResult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Mark = 40;
		String Department = "Computer Science";
		if(Mark>=50 && Department == "Computer Science") 
		{
			System.out.println("Congratulation, You have Passed the Exam");
		}
		else if(Mark<50 && Department == "Computer Science")
		{
			System.out.println("Sorry !!!, You have failed the exam");
		}
		else if((Mark > 40) && (Department == "Electronics "))
		{
			System.out.println("Congratulation, You have passed the Exam");
		}
		else if(Mark < 40 && Department == "Electronics")
		{
			System.out.println("Sorry !!!!, You have failed the exam");
		}
	}

}
