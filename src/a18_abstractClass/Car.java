package a18_abstractClass;

public class Car extends Engine {

	@Override
	public void startEngine() {
		System.out.println("Car's Engine started");
		
	}

	@Override
	public void run() {
		System.out.println("Car's Engine running");
		
	}

	@Override
	public void stopEngine() {
		System.out.println("Car's Engine stopped");
		
	}
	

}
