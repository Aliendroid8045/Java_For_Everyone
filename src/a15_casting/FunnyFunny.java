package a15_casting;

import java.util.Scanner;

public class FunnyFunny {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Today we are going to play a funny game, ready?? ");
		Thread.sleep(2000);
		System.out.println("If yes then type - yes or else type exit.");
     	String ans = scanner.nextLine();
		if(ans.equalsIgnoreCase("yes")){
			
			System.out.println("ok so let us begain...");
			Thread.sleep(2000);
			System.out.println("So, my name is BUK LAU and what is your name?");
			String name =scanner.nextLine();
			
			while(!name.equalsIgnoreCase("Neel")){
				
				System.out.println("Enter your right name, you stupid ass muddafukka!!");
				name = scanner.nextLine();
			}
			System.out.println("Good my boiii, you entered right name let us go ahead.");
			Thread.sleep(3000);
			System.out.println("What is two + two?, you asshole guy?");
			String addition = scanner.nextLine();
			while(!addition.equalsIgnoreCase("four")){
				
				System.out.println("Enter the right number, you stupid ass..");
				addition = scanner.nextLine();
			}
			System.out.println("you are right my asian bro, thanks for talking with me");
		}
		else{
			
			System.out.println("Thanks for talking with BUK LAU");
		}

	}}