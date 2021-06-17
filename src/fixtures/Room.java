package fixtures;

//import java.util.Arrays;

public class Room extends Fixture {

	public Room(String name, String shortDescription, String longDescription) {
		super(name, shortDescription, longDescription);
	}

	public Item[] roomItems = null;

	private Room eastRoom;
	private Room westRoom;
	private Room northRoom;
	private Room southRoom;

	public Room getEastRoom() {
		return eastRoom;
	}

	public void setEastRoom(Room eastRoom) {
		this.eastRoom = eastRoom;
	}

	public Room getWestRoom() {
		return westRoom;
	}

	public void setWestRoom(Room westRoom) {
		this.westRoom = westRoom;
	}

	public Room getNorthRoom() {
		return northRoom;
	}

	public void setNorthRoom(Room northRoom) {
		this.northRoom = northRoom;
	}

	public Room getSouthRoom() {
		return southRoom;
	}

	public void setSouthRoom(Room southRoom) {
		this.southRoom = southRoom;
	}

	public Item[] getRoomItems() {
		return roomItems;
	}

	public void setRoomItems(Item[] roomItems) {
		this.roomItems = roomItems;
	}

	/*
	 * This method tells the user if they are interacting with a item in the room or
	 * if they are trying to interact with an item that's not in the room.
	 */
	public Item interactItem(String userInputItem) {
		for (Item item : roomItems) {
			if (userInputItem.equalsIgnoreCase(item.getName())) {
				System.out.println("You are interacting with a " + item.getName());
				return item;
			}
		}

		System.out.println("Item does not exist in room.");
		return null;
	}

	private static boolean contains(Item[] list, Item i) {
		if (list != null) {
			for (Item e : list) {
				if (e.getName() == i.getName()) {
					return true;
				}
			}
		}
		return false;
	}

	public void printRoomItems(Item[] seenItems) {

		System.out.println(this.getName() + " items not yet interacted: ");
		String output = "";
		for (Item item : roomItems) {

			if (!contains(seenItems, item)) {
				output += item.getName() + " | ";
			}

		}
		if (output == "") {
			System.out.println("Empty");
		} else {
			System.out.println(output);

		}
	}

	public void printExits(Item[] seenItems) {
		System.out.println("--------------------------------------------------");
		if (this.northRoom != null)
			System.out.println("To the north is the " + this.northRoom.getName());
		if (this.southRoom != null)
			System.out.println("To the south is the " + this.southRoom.getName());
		if (this.eastRoom != null)
			System.out.println("To the east is the " + this.eastRoom.getName());
		if (this.westRoom != null)
			System.out.println("To the west is the " + this.westRoom.getName());
		System.out.println("--------------------------------------------------");

		printRoomItems(seenItems);
		System.out.println("--------------------------------------------------");

	}

}
