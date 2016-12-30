package a14_interfaces;

public class Car implements Interfacemethod {

	@Override
	public void start() {
		System.out.println("Engine of Car started");
		
	}

	@Override
	public void run() {
		System.out.println("Engine of car is running");
		
	}

	@Override
	public void stop() {
		System.out.println("Engine of car is stopped");
		
	}

}
