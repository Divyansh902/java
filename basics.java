
package oops;
class Student{
	int rollno;
	String name;
	float marks;
	Student(String name,int rollno,float marks){
		this.name=name;
		this.rollno=rollno;
		this.marks=marks;
	}
}
public class basics {
public static void main(String[] args) {
	
	Student s1=new Student("kartikey",25,88.6f);//declaration of student(object)
	System.out.println(s1);//it gives a random value its like the heap adress 
	System.out.println(s1.name);// by default
	System.out.println(s1.marks);// it saves string as null and 
	System.out.println(s1.rollno);// integer and float as 0
	s1.name="kartikey";
	s1.rollno=59;
	s1.marks=88.6f;
	System.out.println(s1.name);// out kartikey
	System.out.println(s1.marks);// out 88.5
	System.out.println(s1.rollno);// out 59
	Student s2=new Student("deepanshu",59,78.6f);
	System.out.println(s2);//it gives a random value its like the heap adress again
	System.out.println(s2.marks);
	System.out.println(s2.name);
	System.out.println(s2.rollno); 
	
	

}
}
