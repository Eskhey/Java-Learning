package learningJava;

public class LearningLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] Countries = new String[5];
		Countries[0] = "India";
		Countries[1] = "China";
		Countries[2] = "Pakistan";
		Countries[3] = "Nepal";
		Countries[4] = "Myanmar";
		int i = 0;
		
		System.out.println("*************DO-WHILE*************");
		do
		{
			System.out.println(Countries[i]);
			i++;	
		}while(i<=4);
		i=4;
		System.out.println("*************WHILE-LOOP*************");
		while(i >= 0)
		{
			System.out.println(Countries[i]);
			i--;
		}
		System.out.println("*************FOR-LOOP*************");
		for(int loop=0; loop<5; loop++)
		{
			System.out.println(Countries[loop]);
		}

	}

}
