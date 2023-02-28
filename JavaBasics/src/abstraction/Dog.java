package abstraction;

public class Dog extends Animal implements SpecialBehavior{

	@Override
	public void sleeps() {
		System.out.println("Dog sleeps for 10 hours");
		
	}

	@Override
	public void runs() {
		System.out.println("Dog runs at 50 MPH");
		
	}

	@Override
	public void eats() {
		System.out.println("An adult Dog eats 10KG of food daily");
		
	}

	@Override
	public void pet() {
		System.out.println("Pet dogs are very cute");
		
	}

}
