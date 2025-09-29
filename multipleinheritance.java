package oops;
//diamond problem the problem that raises when we want to implement multiple inheritance and then the ambiguity raises this problem
//this diamond problem can be solved by interface
//✅ Rule of thumb:

//Use interface when you want your code to work with many possible classes.

//Use class when you always need just that one class.
/*
 * the above snippet explains the confusion on where 
 * we have to use the direct call odf object and where we have to use the interface 
 */
interface a{
	public void run();
}
interface b{
	public void run();
	public void eat();
}
class C implements a , b{
	public void run() {
		System.out.println("Multiple inheritance achieved");
	}
	public void eat() {
		System.out.println("Food eats");
	}
}
public class multipleinheritance {
	public static void main(String[] args) {
		C theta=new C();

		theta.run();
		theta.eat();
		
	}
}
