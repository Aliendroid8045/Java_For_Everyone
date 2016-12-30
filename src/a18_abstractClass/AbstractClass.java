package a18_abstractClass;

public class AbstractClass {

	public static void main(String[] args) {
		
	Bike bike = new Bike();
		
	//	Engine engine = new Engine(); // This line works  when the engine class is not abstract.
	    bike.setName("Honda");// This is the default method which is inherited from the parent class that is Engine.
	    bike.setId(400); // default method inherited from parent class Engine.
		bike.intro();
		bike.allMethods();
	
	

	}

}
