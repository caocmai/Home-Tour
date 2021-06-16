package game;

import fixtures.Item;
import fixtures.Room;

public class Player {
	
	private Item[] allItems;
	private Room currentRoom;
	
	public Item[] getAllItems() {
		return allItems;
	}
	public void setAllItems(Item[] allItems) {
		this.allItems = allItems;
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
	
	
}
