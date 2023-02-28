package abstraction;

public abstract class Animal {
	
	public abstract void sleeps();
	public abstract void runs();
	public abstract void eats();
	
	public void numberOfLegs() {
		System.out.println("It has 4 legs");
	}

}
