package demo1;

public class Calculator {

	public void add(int a, int b) {
		System.out.println(a+b);
	}
	
	public void add(double a, double b) {
		System.out.println(a+b);
	}
	
	public void multiply(int a, int b) {
		System.out.println(a*b);
	}
	
	public void multiply(double a, double b) {
		System.out.println(a*b);
	}
	
	public static void main(String[] args) {
		//Class object = new Class();
		Calculator pizza = new Calculator();
		
		//object.method()
		pizza.add(3.2, 2.1);
		pizza.add(10,20);
		
		pizza.multiply(3, 5);
	}
}
