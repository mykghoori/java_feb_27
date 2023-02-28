package abstraction;

public class Elephant extends Animal{

	@Override
	public void sleeps() {
		System.out.println("Elephant sleeps for 16 hours");
		
	}

	@Override
	public void runs() {
		System.out.println("Elephant runs at 5 MPH");
		
	}

	@Override
	public void eats() {
		System.out.println("An adult Elephant eats 200KG of food daily");
		
	}

}
