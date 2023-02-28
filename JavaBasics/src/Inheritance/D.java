package Inheritance;

public class D extends F{
	
	public void month() {
		System.out.println("It is December");
	}
	
	public static void main(String[] argas) {
		D d = new D();
		d.month();
		d.date();
		d.nextYear();
	}

}
