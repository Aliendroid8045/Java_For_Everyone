package a15_casting;

import java.util.ArrayList;

class Machine {

	void start() {

		System.out.println("Machine started");
	}

	void stop() {

		System.out.println("Machine stopped");
	}
}

class Camera extends Machine {

	void start() {

		System.out.println("Camera started");
	}

	void takeSnap() {

		System.out.println("Taking snap");
	}
}

public class UpanddownCasting {

	public static void main(String[] args) {
		// This is an example of Upcasting, where parent class can refer its reference to child class.
		Machine machine = new Camera();
		machine.start();
		machine.stop();
	//  machine.takeSnap(); //--> won't work
		
		// This is an example of downcasting where child class is refereed to parent class
		
		Machine machine1 = new Camera();
		Camera camera =(Camera) machine1;
		camera.start();
		camera.stop();
		camera.takeSnap();
	
		
		// The below code will not work so we have to take care when we are downcasting.
		//	Camera camera = (Camera)new Machine();
		//camera.start();
		//camera.stop();
		//camera.takeSnap();
	}

}
