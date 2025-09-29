package basics;
class student1{
	private String name;
	private int marks;
	private int rollno;
	
	student1(String name,int rollno,int marks){
		this.marks=marks;
		this.rollno=rollno;
		this.name=name;
	}
	public int getmarks() {
		return marks;
	}
	public void setmarks(int marks) {
		if(marks>=0 && marks<=100) {
			this.marks=marks;
			System.out.println("Marks updated");
		}
		else {
			System.out.println("The marks you have enetered is invalid");
		}
	}
	void display(){
		System.out.println("name:" +name+ "roll no:" +rollno+ "marks:" +marks);
		
	}
	
}
public class encapsulation {
	public static void main(String[] args) {
		student1 s1=new student1("Deepanshu",45,85);
		System.out.println(s1.getmarks());
		s1.display();
	}
}
