package a04_flow_Control;

import java.util.Scanner;

public class SwitchStatements {

	private static Scanner scanner;

	public static void main(String[] args) {
		
		scanner = new Scanner(System.in);
	String text = 	scanner.nextLine();
	
	System.out.println("Enter the command to run machine");
switch(text){

case "start" :
	System.out.println("The program to start machine worked");

case "stop":
	System.out.println("The program to stop machine worked ");
	
	default :
		
		System.out.println("Command not recognized");
	
}
	}

}
