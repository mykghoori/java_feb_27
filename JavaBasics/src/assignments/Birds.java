package assignments;

public class Birds {

	public void fly( ) {
		System.out.println("Birds can fly");
	}
	
	public void sleep( ) {
		System.out.println("Birds sleep in the night");
	}
	
	public void eat( ) {
		System.out.println("Birds eat insects");
	}
	
	public static void main(String[] args) {
		//Class object = new Class();
		Birds birds = new Birds();
		
		//object.method()
		birds.fly();
		birds.sleep();
		birds.eat();
		
	}
}
