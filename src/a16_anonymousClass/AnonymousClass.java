package a16_anonymousClass;
/*Sometimes we get to override few methods (one or two) from the class and it is only one time need so, 
 * how do we do that? Generally we create child class which extends parent class and then we override parent class methods
 * and in main class we create object of child class and then we implement that override methods which is very length process,
 * so in order to avoid these cumbersome steps, we use anonymous class let see...*/

interface Test{
	
	void test1();
}
class Machine{
	
	void startMachine(){
		
		System.out.println("Machine started");
	}
	void stopMachine(){
		
		System.out.println("Machine stopped");
	}
}
public class AnonymousClass {

	public static void main(String[] args) {
		
		Machine machine = new Machine(){

			@Override
			void startMachine() {
				System.out.println("Here we overridden the machine method");
			} // here we over ridden machine method with the help of anonymous class
			
			
		};
		
		machine.startMachine();
		machine.stopMachine();
	 // we can do same with interface, where we can implement methods of interface without creating class just by anonymous class.
		
		Test test = new Test(){

			@Override
			public void test1() {
				System.out.println("We have implemeted interface method with the help of anonymous class.");
				
			}
			
			
		};
		test.test1(); // Interface method
	}

}
