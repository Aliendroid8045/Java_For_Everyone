package a14_interfaces;

public class Interfaces {

	public static void main(String[] args) {
		
		Interfacemethod info = new Car(); 
	/*We can not create object of interface, so here we are creating object of car with Interface class.*/
	
		info.start();
		info.run();
		info.stop();
		
		Interfacemethod info1 = new Moterbike();
		info1.start();
		
	}
	  }