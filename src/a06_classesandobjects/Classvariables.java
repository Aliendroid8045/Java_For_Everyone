package a06_classesandobjects;

class Person {
// Class is kind of template 	which contains data (variables) and methods(attributes) of that class. Here we will see data then later methods.
	
	String name;
	int age;
	
	
}
public class Classvariables {

	public static void main(String[] args) {
		
		// we can use the variables and methods of class by creating its object.
		
		Person person1 = new Person();
		
		person1.age = 37;
		person1.name = "abhishek";
		
		// here we created object of person class and passed value in its variables and we can create as many as objects we want.
		
		Person person2 = new Person();
		person2.age = 34;
		person2.name= "Jon doe";

	}

}
