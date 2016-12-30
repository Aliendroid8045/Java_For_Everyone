package a07_passingparameters;

// Here we have class called Robet and its method, which takes parameters to run it.
class Robet {
	String name;
	int age;

	void speak() {

		System.out.println("Robet's name is: " + name);

	}

	void age() {
		System.out.println("The age of Robet is " + age);

	}

}

public class ParametersInMethods {

	public static void main(String[] args) {

		Robet skeleton = new Robet();
		skeleton.name = "max"; // passing name parameter to run speak method.
		skeleton.age = 3; // passing age parameter to run age method.
    	skeleton.speak();
		skeleton.age();


	}

}
