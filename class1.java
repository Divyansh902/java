package basics;
import java.util.Scanner;

class student {
	String name;
	int rollno;
	int marks;
	student(String name,int rollno,int marks){
		this.name=name;
		this.marks=marks;
		this.rollno=rollno;}
	void write() {
		System.out.println("Writing");
	
}
	void read() {
		System.out.println("reading");
	}}
	public class class1{
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Hello");
	student s1=new student("Aman",1,10);
	s1.read();
	s1.write();
}}
