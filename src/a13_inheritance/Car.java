package a13_inheritance;

public class Car extends Machine {

	@Override // here we have overridden the method of machine class with car class. We can even use the variables of parent class.
	void machineStart() {
		System.out.println("Car started ");
	}
	
/*	void machineStop(){
		
		System.out.println("car stopped");
	}*/

	
}
