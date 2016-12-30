package a18_abstractClass;

public class Bike extends Engine{

	@Override
	public void startEngine() {
		System.out.println("Bike's Engine started");
		
	}

	@Override
	public void run() {
	System.out.println("Bike's Engine running");
		
	}

	@Override
	public void stopEngine() {
		System.out.println("Bike's Engine stopped");
		
	}

}
