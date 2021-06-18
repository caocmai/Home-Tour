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
		player.setCurrentRoom(roomManager.getStartingRoom());
		System.out.println("Welcome to Home Tour!");

		while (true) {
			System.out.println("##################################################");
			System.out.println("##################################################");
			player.printRoom();
			Room currentRoom = player.getCurrentRoom();
			System.out.println(currentRoom.getShortDescription());
			System.out.println(currentRoom.getLongDescription());
			currentRoom.printExits(player.getInteractedItems());
			
			String[] commands = collectInput();
			userInput = commands[0];

			if (userInput.equalsIgnoreCase("go")) {
				if (commands.length < 2) {
					System.out.println("Go where?");
				} else {
					String direction = commands[1];
					moveToNewRoom(currentRoom, player, direction);
				}
			} else if (userInput.equalsIgnoreCase("interact")) {
				System.out.println("--------------------------------------------------");
				if (commands.length < 2) {
					System.out.println("Interact with what?");
				} else {
					String item = commands[1];
					Item interactItem = currentRoom.interactItem(item);
					if (interactItem == null) 
						continue;
					player.addInteractedItem(interactItem);
					player.printIteractedItems();
				}
			} else if (userInput.equalsIgnoreCase("list")) {
				System.out.println("--------------------------------------------------");
				if (commands.length < 2) {
					System.out.println("You can list items within a room (list items) "
							+ "or list items you've interacted (list seen).");
					continue;
				} 
				
				String command = commands[1];
				if (command.equalsIgnoreCase("items")) {
					currentRoom.printRoomItems(player.getInteractedItems());
				} else if (command.equalsIgnoreCase("seen")) {
					player.printIteractedItems();
				} else {
					System.out.println("Use list with either 'items' or 'seen'.");
				}
			} else if (userInput.equalsIgnoreCase("info")) {
				System.out.println("--------------------------------------------------");
				if (commands.length < 2) {
					System.out.println("More information for which item?");
				} else {
					String item = commands[1];
					currentRoom.printItemInfo(item);
					if (item == null) 
						continue;
//					player.printIteractedItems();
				}
			} else if (userInput.equalsIgnoreCase("quit")) {
				System.out.println("Thanks for visiting!");
				break;
			} else {
				System.out.println("--------------------------------------------------");
				System.out.println("Not a valid command!");
				System.out.println("Only use 'go' + cardinal direction to move between rooms, "); 
				System.out.println("'interact' + item to interact with an item in room, ");
				System.out.println("'info' + item to see item information, ");
				System.out.println("'list items' to view all items within room, ");
				System.out.println("'list seen' to see all interacted items, ");
				System.out.println(" or 'quit' to quit.");
			}
		}
	}

	/*
	 * This method collects user inputs.
	 */
	private static String[] collectInput() {
		System.out.println("What would you like to do? ");
		String input = sc.nextLine();
		String[] commands = input.split(" ");
		return commands;
	}

//	private static void printRoom(Player player) {
//
//	}

	private static void setNewCurrentRoom(Room room, Player player) {
		if (room != null) {
			player.setCurrentRoom(room);
		} else {
			System.out.println("--------------------------------------------------");
			System.out.println("Sorry, there's no room in that direction.");
		}
	}

	/*
	 * This method moves the player to a new room if possible.
	 */
	private static void moveToNewRoom(Room currentRoom, Player player, String direction) {
		switch (direction) {
		case "east":
			setNewCurrentRoom(currentRoom.getEastRoom(), player);
			break;
		case "west":
			setNewCurrentRoom(currentRoom.getWestRoom(), player);
			break;
		case "north":
			setNewCurrentRoom(currentRoom.getNorthRoom(), player);
			break;
		case "south":
			setNewCurrentRoom(currentRoom.getSouthRoom(), player);
			break;
		default:
			System.out.println("--------------------------------------------------");
			System.out.println("Direction not valid!");
			System.out.println("Only specifiy go 'east', 'west', 'north', 'south'");
		}
	}
}
