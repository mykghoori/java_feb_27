package demo;

public class Seasons {
	
	public void winters() {
		System.out.println("winters are cold");
	}
	
	public void summers() {
		System.out.println("Summers are hot");
	}
	
	public void springs() {
		System.out.println("Springs are pleasent");
	}
	
	public void autumn() {
		System.out.println("Autumn marks the onset of winters");
	}
	
	public static void main(String[] args) {
		//Class object = new Class();
		Seasons seasons = new Seasons();
		
		//object.method()
		seasons.winters();
		seasons.summers();
		seasons.springs();
		seasons.autumn();
	}

}
