package oops;
class animal{
	String color="White";
}
class dog extends animal{
	String color="black";
	void show() {
		System.out.println(color);
		System.out.println(super.color);
	}
}
public class superkeyword {
	public static void main(String[] args) {
		dog lucky=new dog();
		lucky.show();
	}
}
