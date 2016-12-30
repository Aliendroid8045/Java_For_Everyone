// This is just a practise program I did when I was bored.
package a08_settersandgetters;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws Exception {

		Scanner scanner = new Scanner(System.in);
		String country ;
		System.out.println("This app will give you the information of the countries you enter.");
		Thread.sleep(2000);
		System.out.println("You can exit this app by typing- Exit ");
		Thread.sleep(2000);
		do{
			System.out.println();
			System.out.println("Please enter the name of country:");
			country = scanner.nextLine();
			if(country.equalsIgnoreCase("India")){
				System.out.println("This is India and located in Asia");
			}
			else if (country.equalsIgnoreCase("Pakistan")){
				
				System.out.println("This is pakistan and located in Asia");
			}
			else if (country.equalsIgnoreCase("Usa")){
				
				System.out.println("This is USA and located in America");
			}
			else if (country.equalsIgnoreCase("Exit")){
				
				System.out.println("Thanks for using my app.");
			}
			else{
				
				System.out.println("Please Enter India, Pakistan or USA ONLY, Let's try again. ");
			}
		
		}
		while(!country.equalsIgnoreCase("Exit"));
		
		
	}
}