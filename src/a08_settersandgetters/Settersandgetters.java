package a08_settersandgetters;

class Dog {
	String breed;
	String name;
	int age;

	// Note : this.variable -> this. -> always goes with variable.
	public void setName(String Name) {

		this.name = Name;
	}

	public void setAge(int Age) {

		this.age = Age;
	}

	public void setBreed(String Breed) {

		this.breed = Breed;
	}
String getName (){
	
	return name;
}
String getBreed(){
	
	return breed;
}
int getAge(){
	return age;
}
}

public class Settersandgetters {

	public static void main(String[] args) {

		Dog dog1 = new Dog();
		dog1.setName("kallu");
		dog1.setBreed("Prom");
		dog1.setAge(3);
		System.out.println(dog1.getName());
		System.out.println(dog1.getBreed());
		System.out.println(dog1.getAge());
		
	
	}

}
