package oops;
class vehicle{
	double price;
	int mileage;
	String color;
	void display() {
		System.out.println("Mileage:="+mileage);
		System.out.println("price:"+price);
		System.out.println(color);
	}


}

class car extends vehicle{
	String fuel;
	boolean sunroof;
	void out() {
		System.out.println(fuel);
		System.out.println(sunroof);
		System.out.println("This is child method");
	}
}
public class inheritance {
public static void main(String[] args) {
		car c1=new car();
		c1.color="white";
		c1.fuel="petrol";
		c1.mileage=88;
		
		c1.sunroof=true;
		 c1.display();
		 c1.out();
}
}
