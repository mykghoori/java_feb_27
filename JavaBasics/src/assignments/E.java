package assignments;

public class E extends G {
	
	@Override
	public void temperature() {
		System.out.println("It is 10 degrees Fahrenheit ");
	}
	
	public static void main(String[] args) {
		E e = new E();
		e.temperature();
	}
}
