package basics;
import java.util.Scanner;
public class Conditionals {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number:");
		int a=sc.nextInt();
		if(a%2==0) {
			System.out.println("The given number " +a+ "is a even number");
		}
		else {
			System.out.println("The given number " +a+ "is not a even number");
		}
	}
}
