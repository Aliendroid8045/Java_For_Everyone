package a05_arrays;

public class StringArray {

	public static void main(String[] args) {

		String[] fruits = { "apple", "banana", "mango", "kiwi" };

		for (int i = 0; i < fruits.length; i++) {

			System.out.println(fruits[i]);

		}

		System.out.println("   ");
		// enhanced for loop

		for (String fruit : fruits) {

			System.out.println(fruit);

		}
	}

}
