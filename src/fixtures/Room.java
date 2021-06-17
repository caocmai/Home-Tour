package fixtures;

//import java.util.Arrays;

public class Room extends Fixture{
	
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
	
	public Item interactItem(String userInputItem) {
		for (Item item : roomItems) {
			if (userInputItem.equalsIgnoreCase(item.getName())) {
				System.out.println("You are interacting with a "+ item.getName());
				return item;
			}
		}
		
		System.out.println("Item does not exist in room.");
		return null;
	}
	
	public void printRoomItems() {
		System.out.println(this.name + " available items: ");
		String output = "";
		for (Item item : roomItems) {
			output += item.getName() + " | ";
		}
		System.out.println(output);
	}
	

}
