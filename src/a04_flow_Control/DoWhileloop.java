/*Note: while loop is used to */

package a04_flow_Control;

import java.util.Scanner;

public class DoWhileloop {

	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);

		/*
		 * Scanner scanner = new Scanner(System.in); System.out.println(
		 * "Enter the number: "); int value = scanner.nextInt();
		 * 
		 * while (value !=5){ System.out.println("Enter the number: "); value =
		 * scanner.nextInt();
		 * 
		 * // This code is bit of repetative that is why we will implement
		 * do{}while() loop. }
		 */

		int value = 0;
		do {

			System.out.println("Enter the number: ");
			value = scanner.nextInt();

		} while (value != 5);

		System.out.println("Got it");
	}

}
