package collectionsFramework;

import java.util.ArrayList;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		//Class object = new Class();
		ArrayList<String> cities = new ArrayList<String>();
		
		//Store items inside computer's memory
		cities.add("London");
		cities.add("Paris");
		cities.add("New York");
		cities.add("Los Angeles");
		cities.add("Tokyo");
		
		//Retrieve items from the arrayList using for-each Loop
		for(String t :cities) {
			System.out.println(t);
		}
		
		//Retrieve the item stored at index 2 from the arraylist
		System.out.println("Item stored at index 2 = " + cities.get(2));
		
		//what is the index of New York
		System.out.println("Index of New York = " + cities.indexOf("New York"));
		
		//Is Berlin in the list of cities
		System.out.println("Is Berlin present in the list? " + cities.contains("Berlin"));
		
		//How many Items are there is the list
		System.out.println("Total items in the list = " + cities.size());
	}

}
