package accessModifiers;

public class Calculator {
	
    void add(int a, int b) {
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		calculator.add(20, 5);
	}

}
