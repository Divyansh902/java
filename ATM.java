package oops;
import java.util.*;

class cc{
	int balance;
	int pin=0000;
	
	public int balance(int deposit) {
		balance=balance+deposit;
		
		
		return balance;}

	
	public void menu() {
		int deepanshu=0;
		while(deepanshu!=4) {
			System.out.println("Please choose the options from the below:");
		System.out.println("1.Check balance:"
				+ "2.Deposit:"
				+ "3.Withdraw"
				+ "4.Exit");
		Scanner sc=new Scanner(System.in);
		int option=sc.nextInt();
		
		if(option==1) {
			System.out.println("Your available bal is:");
		}
		else if(option==2) {
			System.out.println("Enter the amount you want to deposit:");
			int deposit=sc.nextInt();
			System.out.println("Amount has been deposited ");
			System.out.println("Your current balance is:"+balance(deposit));
		}
		else if (option==3) {
			System.out.println("Enter the amount you want to withdraw:");
			
			int withdraw=sc.nextInt();
			System.out.println("Your withdrawl amount is :"+withdraw);
			balance=balance-withdraw;
			System.out.println("Your current balance is:"+balance);
		}
		else if(option==4) {
			System.out.println("All actions on your account has been performed ");
			 deepanshu=4;
		}
		else {
			System.out.println("Choose correct option");
		}
	}
	
		
}
	public void checkpin() {
		System.out.println("Enter your ATM pin:");
		Scanner sc=new Scanner(System.in);
		int userpin=sc.nextInt();
		if(userpin==pin) {
			menu();
		}
		else {
			System.out.println("Incorrect PIN! Enter the correct PIN");
		}
	}
	
}


public class ATM {
	public static void main(String[] args) {
		cc user=new cc();
		user.checkpin();
	}
}
