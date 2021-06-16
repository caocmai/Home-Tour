package game;

import fixtures.Item;
import fixtures.Room;

public class RoomManager {
	public Room startingRoom; 
	public Room[] rooms;
	
	public RoomManager() {
		this.createRooms();
//		this.startingRoom = rooms[0];
	}
	
	private void createRooms() {
		Room kitchen = new Room("Kitchen", 
				"A place to store and eat food.", 
				"This room is the most used room in the house.");

		Item fridge = new Item("Fridge", 
				"Place to keep food cold.",
				"This item is used the most at this home.");
		Item microwave = new Item("Mircowave", 
				"A device to heat up food.",
				"This item is used to heat up food quickly.");
		Item[] kitchenItems = {fridge, microwave};
		kitchen.roomItems = kitchenItems;
		
		Room livingRoom = new Room("Living Room", 
				"A place to hangout and watch TV.", 
				"This room is has couches and lots of fun things to do.");
		kitchen.setEastRoom(livingRoom);
		
		livingRoom.setWestRoom(kitchen);
		
		Room[] allRooms = {kitchen, livingRoom};
		this.rooms = allRooms;
		
	}
	
}
