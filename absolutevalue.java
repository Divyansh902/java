package basics;
import java.util.Scanner;
public class absolutevalue {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter any integer: ");
	int a=sc.nextInt();
	int b=a-2*a;
	if(a>0) {
		System.out.println("The absolute value of "+a+" is "+a);
	}
	else {
		System.out.println("The absolute value of "+a+" is "+b);
	}
}
}
