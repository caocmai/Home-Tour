package game;

import java.util.Scanner;

public class Main {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String userInput = "";
		
		while (!userInput.equalsIgnoreCase("Quit")) {
			String[] commands = collectInput();
			userInput = commands[0];

		}
		System.out.println("Thanks for visiting");

	}
	
	private static String[] collectInput() {
		System.out.println("What would you like to do? ");
		String input = sc.nextLine();;
	    String[] commands = input.split(" ");
		return commands;
	}
	
	private static void printRoom(Player player) {

	}
}
