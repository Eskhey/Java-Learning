package learningJava;

public class CreatingEmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		email e1= new email("Shahid","Kabeer");

	}

}
class email
{
	static int ID = 1001;
	String FName;
	String LName;
	String Email;
	public email(String FName,String LName)
	{
		this.FName = FName;
		this.LName = LName;
		
		Email = FName + LName + ID + "@College.com";
		System.out.println("Hi "+ FName + ", Your Auto-generated Email ID is :"+Email);
	}
}