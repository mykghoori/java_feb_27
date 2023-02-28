package MethodOverriding;

import accessModifiers.Calculator;

public class D extends Calculator{
	
	public void day() {
		System.out.println("It is Monday");
	}
	
	public void year() {
		System.out.println("It is 2023");
	}
	
	public static void main(String[] args) {
		D d = new D();
		
	}

}
