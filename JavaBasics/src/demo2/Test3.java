package demo2;

import demo.Calculator;
import demo1.Water;

public class Test3 {
	
	public static void main(String[] args) {
		//Create object of that class which contains the method
		Water water = new Water();
		//objcet.method()
		water.minWater();
		
		
		//Class.method()
		Calculator.subtract(30, 20);
	}

}
