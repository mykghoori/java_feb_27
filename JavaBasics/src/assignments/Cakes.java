package assignments;

public class Cakes {

	public void chocolate() {
		System.out.println("Chocolate flavor is the best flavor");
	}
	
	public void vanilla() {
		System.out.println("Vanilla flavor is also good");
	}
	
	public void butterscotch() {
		System.out.println("Butterscotch flavor is liked by everyone");
	}
	
	public void strawberry() {
		System.out.println("Strawberry flavor is good too");
	}
	
	public static void main(String[] args) {
		//Class object = new class();
		Cakes cakes = new Cakes();
		
		//object.method()
		cakes.chocolate();
		cakes.vanilla();
		cakes.butterscotch();
		cakes.strawberry(); 
	}
}
