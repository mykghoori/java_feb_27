package assignments;

public class Example5 {
	int a;
	boolean b;

	public Example5(int a, boolean c) {
		this.a = a;
		b = c;
	}

	public void printValues() {
		System.out.println("Value of a : " + a + " and value of b : " + b);
	}

	public static void main(String arg[]) {
		Example5 obj1 = new Example5(4, false);
		Example5 obj2 = new Example5(10, true);
		
		obj2.printValues();
	}
}
