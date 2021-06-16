package game;

import java.util.Scanner;

import fixtures.Item;
import fixtures.Room;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		String userInput = "";
		RoomManager roomManager = new RoomManager();
		Player player = new Player();
		player.setCurrentRoom(roomManager.rooms[0]);
		System.out.println("Welcome to Home Tour!");

		while (!userInput.equalsIgnoreCase("Quit")) {
			player.printRoom();
			Room currentRoom = player.getCurrentRoom();
			Item[] currentRoomItems = player.getCurrentRoom().getRoomItems();
			String[] commands = collectInput();
			userInput = commands[0];

			if (userInput.equalsIgnoreCase("go")) {
				if (commands.length < 2) {
					System.out.println("Go where?");

				} else {
					String direction = commands[1];

					switch (direction) {
					case "east":
						currentRoom = currentRoom.getEastRoom();
						player.setCurrentRoom(currentRoom);
						break;
					case "west":
						break;
					case "north":
						break;
					case "south":
						break;
					default:
						System.out.println("Direction not valid!");
						System.out.println("Only specifiy go 'east', 'west', 'north', 'south' \n");
					}
				}
			} else if (userInput.equalsIgnoreCase("interact")) {
				if (commands.length < 2) {
					System.out.println("Go where?");

				} else {
					String item = commands[1];
					System.out.println(currentRoom.checkItem(item));
				}
			} else {
				System.out.println("Not a valid command!");
				System.out.println(
						"Only use 'go' to move between rooms, 'interact' to interact with items in room or 'quit' to quit.\n");
			}

		}
		System.out.println("Thanks for visiting!");

	}

	private static String[] collectInput() {
		System.out.println("What would you like to do? ");
		String input = sc.nextLine();
		String[] commands = input.split(" ");
		return commands;
	}

	private static void printRoom(Player player) {

	}
}
