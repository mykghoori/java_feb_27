package MethodOverriding;

public class A extends B {

	public void greetings() {
		System.out.println("Wish you all first Good evening of 2023");
	}
	
	
	public void day() {
		System.out.println("Today is Tuesday");
		super.greetings(); //Calling the greetings() method from the parent class.
	}
	
	
	
	
	public static void main(String[] args) {
		//Class object = new Class();
		A a = new A();
			
		//object.method()
		a.greetings();
		a.day();
	}
}
