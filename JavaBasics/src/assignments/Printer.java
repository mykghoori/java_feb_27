package assignments;

public class Printer {

	public void printName(String name) {
		System.out.println("My name is " + name);
	}
	
	public void printSum(int a, int b) {
		System.out.println("Sum = " + (a+b));
	}
	
	public static void main(String[] args) {
		Printer printer = new Printer();
		
		printer.printName("James Bond");
		printer.printSum(20, 5);
	}
	
}
