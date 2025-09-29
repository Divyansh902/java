package oops;

class employee {
	int id;
	int age;
	 employee(int id,int age){//this is the constructor also example of parameterized constructor
		 this.id=id;
		 this.age=age;
		 System.out.println("You are right");
	 }
}
public class Constructor {
	public static void main(String[] args) {
	employee s1=new employee(3,5);
}
}
