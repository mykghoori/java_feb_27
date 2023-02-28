package Inheritance;

public class E extends F{
	
	public void year() {
		System.out.println("It is 2022");
	}
	
	public static void main(String[] args) {
		E e = new E();
		e.year();
		e.date();
		e.year();
	} 

}
