package abstraction;

public class Cat extends Animal implements SpecialBehavior{

	@Override
	public void sleeps() {
		System.out.println("Cat sleeps for 7 hours");
		
	}

	@Override
	public void runs() {
		System.out.println("Cat runs at 40 MPH");
		
	}

	@Override
	public void eats() {
		System.out.println("An adult cat eats 2KG of food daily");
		
	}

	@Override
	public void pet() {
		System.out.println("An adult cat eats 2KG of food daily");
		
	}

}
