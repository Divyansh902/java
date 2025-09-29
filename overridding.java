package basics;

	class payment{ 
		void pay() {
			System.out.println("Payment is processing");
		}
	}
	class credit extends payment{
		void pay() {
			System.out.println("Payment is done through cc");
		}
	}
	class Upi extends payment{
		void pay() {
			System.out.println("Payment is done through upi");
		}
	}
	class netb extends payment{
		void pay() {
			System.out.println("Payment is done through netb");
		}
	}
	public class overriding {
public static void main(String[] args) {
	payment a=new payment();
	payment b=new credit();
	payment c=new Upi();
	payment d=new netb();
	
	a.pay();
	b.pay();
	c.pay();
	d.pay();
	
}
}
