package learningJava;
import java.util.Scanner;

public class MinMaxAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int Size;
		System.out.println("Enter the Number of elements in an array");
		Size = s.nextInt();
		int[] Array = new int[Size];
		int Number;
		System.out.println("Start enter the number to the array");
		for(int i = 0; i < Size; i++)
		{
			Number = s.nextInt();
			Array[i] = Number;
			
		}
		System.out.println("The MAx of the Array is "+ MaxFun(Array,Size));
		System.out.println("Min of the Array is "+ MinFun(Array,Size));
		System.out.println("The Avg of the Array is "+AvgFun(Array,Size));
		 
		
	}
	static int MaxFun(int[] Array, int Size)
	{
		int Max= Array[0];
		for(int i=1; i<Size; i++)
		{
			if(Array[i]>Max)
			{
				Max=Array[i];
			}
		}
		return Max;
	}
	static int MinFun(int[] Array, int Size)
	{
		int Min= Array[0];
		for(int i=1; i<Size; i++)
		{
			if(Array[i]<Min)
			{
				Min=Array[i];
			}
		}
		return Min;
	}
	static float AvgFun(int[] Array,int Size)
	{
		float Sum=0;
		for(int i=0;i<Size; i++)
		{
			Sum = Sum + Array[i];
		}
		return (Sum/Size);
		
	}

}
