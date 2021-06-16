package game;

import java.util.Scanner;

import fixtures.Room;

public class Main {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String userInput = "";
		RoomManager rooms = new RoomManager();
		
		while (!userInput.equalsIgnoreCase("Quit")) {
			String[] commands = collectInput();
			userInput = commands[0];
			Room test = rooms.rooms[0].getEastRoom();
			System.out.println(test.toString());
			
//			if (userInput.equalsIgnoreCase("go")) {
//				String direction = commands[1];
////				switch (direction) {
////				case "north":
////					
////				}
//			}

		}
		System.out.println("Thanks for visiting!");

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
