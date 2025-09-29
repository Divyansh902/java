package oops;
/*
 * it s nothing but same name of function in two or more 
 * method but the argument numbers will be differnet in all methods 
 * number of arguments and different data types arguments also come under this 
 */
class addition{
	public int sum(int a,int b) {
		return a+b;
	}
}
class addition3 extends addition{
	public int sum(int a,int b,int c ) {
		return a+b+c;
	}
}
public class overloading {
	public static void main(String[] args) {
	addition a=new addition();
	int b=a.sum(5,4);
	addition3 p=new addition3();
	int q=p.sum(5,9);
	int r=p.sum(8,7,6);
	System.out.println(b);
	System.out.println(q);
	System.out.println(r);
}}
