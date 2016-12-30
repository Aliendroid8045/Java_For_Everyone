package a10_staticandfinal;

class Person {
	String name; // here we have defined instance variable
	static int age; // here we have defined static variable
 static final  int CONSTANT = 66; // we use final keyword, so that no one can change it.
	//This is the instance method which can access static variables
	void sayName(){
		System.out.println("My name is "+ name+ " and my age is "+age);
		
	}
static	void  sayAge(){
		
		System.out.println("My age is "+age);
		//System.out.println("My name is "+name); // This line will not work because static method can access only static variables
	}
}

public class Staticandfinal {

	public static void main(String[] args) {
		Person person = new Person();
		person.name = "Abhishek";
		person.age= 24;
		person.sayName();
		Person.sayAge(); // Static methods are declared without instantiating object, just classname.method.
		System.out.println(Person.CONSTANT);
	}

}
