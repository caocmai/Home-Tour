package game;

import fixtures.Item;
import fixtures.Room;

public class Player {
	
	private Item[] interactedItems;
	private Room currentRoom;
	
	public Item[] getInteractedItems() {
		return interactedItems;
	}
	public void setInteractedItems(Item[] interactedItems) {
		this.interactedItems = interactedItems;
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
	
	public void addInteractedItem(Item item) {
		if (interactedItems == null) {
			Item[] tempItem = new Item[1];
			tempItem[0] = item;
			this.setInteractedItems(tempItem);
		} else {
			Item[] tempItem = new Item[interactedItems.length + 1];
			int i = 0;
			while (i < interactedItems.length) {
				tempItem[i] = interactedItems[i];
				i++;
			}
			tempItem[i] = item;
			this.setInteractedItems(tempItem);
		}
	}
	
	public void printIteractedItems() {
		System.out.println("Items interacted so far: ");
		String output = "";
		if (interactedItems != null) {
			for (Item item : interactedItems) {
				output += item.getName() + " | ";
			}
			System.out.println(output);

		} else {
			System.out.println("Haven't interacted with any items yet.");
		}
	}
	
	
}
