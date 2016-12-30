package a06_classesandobjects;

class Animal {

	String name;
	int age;

	void lifespan(int age) {

		int lifeLeft = 30 - age;
		System.out.println("and gonna live: " + lifeLeft);

	}

	int getAge(int age) {

		return age;
	}

	void attitude(String name) {

		if (name.equalsIgnoreCase("hippo")) {

			System.out.println("hippo is farting.");
		} else if (name.equalsIgnoreCase("dog")) {

			System.out.println("dog is barking.");
		} else {

			System.out.println("animal not present.");
		}

	}

}

public class Classmethods {

	public static void main(String[] args) {

		Animal animal = new Animal();
		animal.attitude("hippo");

		// animal.age = 15;
		// Here we are accessing variables of other class directly and if we
		// want to keep that variable secure we use getter method.
		int age = animal.getAge(14);
		System.out.println();
		animal.name = "dog";
		animal.lifespan(age);

	}

}
