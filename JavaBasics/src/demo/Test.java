package demo;

public class Test {
	
	//Call the add() method from Calculator class in the Test Class
	public static void main(String[] args) {
		//Create object of that class which contains the method
		Calculator calculator = new Calculator();
		
		//object.method()
		calculator.add(20, 10);
		calculator.multiply(10, 20);
		
		//To call a static method in different class, use the syntax -
		//Class.method()
		Calculator.subtract(20, 5);
		
		
		//Call the method from Seasons class
		Seasons seasons = new Seasons();
		//object.method()
		seasons.summers();
		seasons.winters();
		seasons.autumn();
		seasons.springs();
	}
}
