package LeanrningClassBankAccnt;

import java.util.Random;

public class BankApp 
{

	public static void main(String[] args) 
		{
			// TODO Auto-generated method stub
			BankAccount ac1 = new BankAccount("8086495311","Shahid",5000);
			ac1.Deposit(2000);
			ac1.PayBill(60);
			ac1.accrut();
		}
}
class BankAccount implements IrateInterface 
{
	private static int id = 1001; // internal ID
	private String AccountNumber; //ID + random 2 number + First two of SSN
	private String RoutingNumber;
	private String Name;
	private String SSN;
	private double Balance;
	
	public BankAccount(String SSN,String Name, double Balance)
	{
		this.Name = Name;
		this.Balance = Balance; 
		this.SSN = SSN;
		SetAccountNumber();
		id++;
	}
	private void SetAccountNumber()
	{
		int random;
		random = (int) (Math.random() * 100);
		AccountNumber = id +""+random+""+SSN.substring(0, 2);
		System.out.println("Your Account Number is : " + AccountNumber);
		System.out.println("Hi " +Name+ ", Your initial Deposit is " + Balance);
	
	}
	public void Deposit( double Deposit)
	{
		Balance = Balance + Deposit;
		DisplayBalance();
	}
	public void PayBill(double Bill)
	{
		Balance = Balance - Bill;
		DisplayBalance();
	}
	private void DisplayBalance()
	{
		System.out.println("Hi "+Name+", Your Balance is "+Balance);
	}
	
	public void accrut()
	{
		Balance = Balance * (1 + rate/100);
		DisplayBalance();
	}
}

