package assignments;

public class Fruits {

	public void apple() {
		System.out.println("An apple a day, keeps the doctor away");
	}
	
	public void mangoes( ) {
		System.out.println("Mangoes are sweet");
	}
	
	public static void main(String[] args) {
		//Class object = new Class();
		Fruits fruits = new Fruits();
		//object.method()
		fruits.apple();
		fruits.mangoes();
	}
}
