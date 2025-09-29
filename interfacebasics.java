package oops;
interface Animals{
	public void run();
}
class nin implements Animals{
	public void run(){
		System.out.println("Tiger runs faster");
	}
}
class jin implements Animals{
	public void run() {
		System.out.println("Sloth is slowest animal");
	}
}
public class interfacebasics {
	public static void main(String[] args) {
	Animals pari=new nin();
	Animals s=new jin();
	pari.run();
	s.run();
}}
