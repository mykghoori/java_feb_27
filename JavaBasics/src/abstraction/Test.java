package abstraction;

public class Test {
	
	public static void main(String[] args) {
		//AbstractClass object = new ChildClass();
		Animal ele = new Elephant();
		//object.method()
		ele.eats();
		ele.sleeps();
		ele.runs();
		ele.numberOfLegs();
		System.out.println();
		
		Animal kitty = new Cat();
		kitty.eats();
		kitty.sleeps();
		kitty.runs();
		kitty.numberOfLegs();
		//Interface object = new ImplementingClass();
		SpecialBehavior kitten = new Cat();
		kitten.pet();
		System.out.println();
		
		Animal buzz = new Dog();
		buzz.eats();
		buzz.sleeps();
		buzz.runs();
		buzz.numberOfLegs();
		//Interface object = new ImplementingClass();
		SpecialBehavior doggo = new Dog();
		doggo.pet();
	}

}
