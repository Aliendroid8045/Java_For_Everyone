package a14_interfaces;

public class Moterbike implements Interfacemethod{

	@Override
	public void start() {
		System.out.println("Engine of Moterbike started ");
		
	}

	@Override
	public void run() {
		System.out.println("Enigne of Moterbike is running");
		
	}

	@Override
	public void stop() {
		System.out.println("Engine of Moterbike is stopped");
		
	}

}
