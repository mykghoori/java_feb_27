package demo2;

import demo.Calculator;
import demo.Seasons;

public class Test2 {
	
	//Call the add() method from Calculator class in the Test2 class
	public static void main(String[] args) {
		//Create object of the class which contains the method
		Calculator calculator = new Calculator();
		
		//object.method()
		calculator.add(20, 20);
		calculator.divide(10, 100);
		
		//Call all the method of Seasons class in the Test2 class
		Seasons seasons = new Seasons();
		 //object.method()
		seasons.winters();
		seasons.autumn();
		seasons.springs();
		seasons.summers();
	}

}
