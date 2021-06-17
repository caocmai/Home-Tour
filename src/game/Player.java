package game;

import fixtures.Item;
import fixtures.Room;

public class Player {
	
	private Item[] interactedItems;
	private Room currentRoom;
	
	public Item[] getInteractedItems() {
		return interactedItems;
	}
	public void setInteractedItems(Item[] allItems) {
		this.interactedItems = allItems;
	}
	public Room getCurrentRoom() {
		return currentRoom;
	}
	public void setCurrentRoom(Room currentRoom) {
		this.currentRoom = currentRoom;
	}
	
	public void printRoom() {
		System.out.println("You are currently in the " + currentRoom.name);
		
	}
	
	public void printIteractedItems() {
		System.out.println("Items interacted so far: ");
		String output = "";
		if (interactedItems != null) {
			for (Item item : interactedItems) {
				output += item.getName() + " | ";
			}
		}
		System.out.println(output);
	}
	
	
}
