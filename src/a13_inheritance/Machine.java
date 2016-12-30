//This is the machine class and we are gonna use methods of this class in car class which is called inheritance.
package a13_inheritance;

public class Machine {

	protected String name;
	
      void machineStart(){
    	  
    	  System.out.println("Machined named "+name+" started");
      }
      
      void machineStop(){
    	  
    	  System.out.println("Machined named "+name+" stopped");
      }
}
