package a20_innerClass;

public  class OuterClass {

	void outerMethod(){
		
		System.out.println("This is the outer class");
	}
	public class InnerClass{
		
		void innerMethod(){
			
			System.out.println("This is inner method");
			
		}
		
	}
	void run(){
		
		System.out.println("This is outer class method");
		
		InnerClass in = new InnerClass();
		in.innerMethod();
	}
	
}
