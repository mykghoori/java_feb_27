package demo;

public class Calculator {
	
	//In the line below, we have defined add()method
	public void add(int a, int b) { // a and b are called as parameters of the add() method
		System.out.println(a+b);
	}
	
	public static void subtract(int a, int b) {
		System.out.println(a-b);
	}
	
	//create 2 more method - multiply() and divide()
	public void multiply(int a, int b) {
		System.out.println(a*b);
	}
	
	public void divide(double a, double b) {
		System.out.println(a/b);
	}
	
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		calculator.add(5, 5);
		
		//To call a static method, just write its name
		subtract(10,3);
	}

}
