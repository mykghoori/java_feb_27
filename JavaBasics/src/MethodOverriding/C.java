package MethodOverriding;

public class C extends D {
	
	public void day() {
		System.out.println("It is Tuesday");
	}
	
	public void month() {
		System.out.println("It is January");
	}
	
	public static void main(String[] args) {
		C c = new C();
		c.day(); //overridden method
		c.month();
		c.year(); 
	}

}
