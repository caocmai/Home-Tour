package game;

import fixtures.Item;
import fixtures.Room;

public class RoomManager {
	private Room startingRoom; 
	private Room[] rooms;
	
	public Room getStartingRoom() {
		return startingRoom;
	}
	
	public RoomManager() {
		this.createRooms();
		this.startingRoom = rooms[0];
	}
	
	public Room[] getRooms() {
		return rooms;
	}

	public void setRooms(Room[] rooms) {
		this.rooms = rooms;
	}
	
	public void printAllRooms() {
		if (rooms.length > 0) {
			for (Room r : rooms) {
				System.out.println(r.getName());
				System.out.println(r.getShortDescription());
				System.out.println(r.getLongDescription());
				System.out.println("--------------------------------------------------");

			}
		}
	}

	/*
	 * This method creates all the rooms and how they are related to one another.
	 */
	private void createRooms() {
		Room kitchen = createKitchen();
		Room livingRoom = createLivingRoom();
		Room bathroom = createBathroom();
		Room garage = createGarage();
		Room bedroom = createBedroom();
		
		kitchen.setSouthRoom(bathroom);
		bathroom.setNorthRoom(kitchen);
		
		kitchen.setWestRoom(garage);
		garage.setEastRoom(kitchen);
		
		kitchen.setEastRoom(livingRoom);
		livingRoom.setWestRoom(kitchen);
		
		livingRoom.setNorthRoom(bathroom);
		bathroom.setSouthRoom(livingRoom);
		
		livingRoom.setEastRoom(bedroom);
		bedroom.setWestRoom(livingRoom);
		
		Room[] allRooms = {kitchen, livingRoom, bathroom, garage};
		
		this.rooms = allRooms;
	}
	
	private Room createKitchen() {
		Room kitchen = new Room("Kitchen", 
				"A place to store and eat food.", 
				"This room is the most used room in the house.");

		Item fridge = new Item("Fridge", 
				"Place to keep food cold.",
				"This item is used the most at this home.");
		Item microwave = new Item("Microwave", 
				"A device to heat up food.",
				"This item is used to heat up food quickly.");
		
		Item[] kitchenItems = {fridge, microwave};
		kitchen.setRoomItems(kitchenItems);
		
		return kitchen;
	}
	
	private Room createLivingRoom() {
		Room livingRoom = new Room("Livingroom", 
				"A place to hangout and watch TV.", 
				"This room is has couches and lots of fun things to do.");
		
		Item tv = new Item("TV", 
				"A device to watch shows.",
				"This device is used most often in the living room.");
		
		Item couch = new Item("Couch", 
				"Used to sit and enjoy each other's company.",
				"This item is at the corner of the room and is blue.");
		
		Item[] livingRoomItems = {tv, couch};
		livingRoom.setRoomItems(livingRoomItems);
		
		return livingRoom;
	}
	
	private Room createBathroom() {
		Room bathroom = new Room("Bathroom",
				"A place to wash up.",
				"This bathroom is located in the middle of the house.");
		
		Item toothbrush = new Item("Toothbrush",
				"Used to brush teeth.",
				"Located on the bathroom counter.");
		Item toothpaste = new Item("Toothpaste", 
				"Used with toothbrush to brush teeth.",
				"This item is located next to the toothbrush.");
		Item mirror = new Item("Mirror", 
				"Used for refection.",
				"This mirror has a long cracked line.");
		
		Item[] bathroomItems = {toothbrush, toothpaste, mirror};
		bathroom.setRoomItems(bathroomItems);
		
		return bathroom;
		
	}
	
	private Room createGarage() {
		Room garage = new Room("Garage", 
				"A place to store a car or yard equipment.",
				"This room is used to store lots of stuff.");
		Item lawnmower = new Item("Lawnmower", 
				"This device is used to cut grass.",
				"This device was brought when the house was built.");
		Item car = new Item("Car", 
				"This car is a sedan.",
				"This car needs to be cleaned.");
		
		Item[] garageItems = {lawnmower, car};
		garage.setRoomItems(garageItems);
				
		return garage;
	}
	
	private Room createBedroom() {
		Room bedroom = new Room("Bedroom", 
				"A place to rest and sleep.",
				"This is is located at the corner of the house.");
		
		Item bed = new Item("Bed", 
				"Used to sleep on.", 
				"This is the largest item in the room.");
		
		Item desk = new Item("Desk",
				"Used to do some work.",
				"The desk is brown with lots of paper on top.");
		
		Item[] bedroomItems = {bed, desk};
		bedroom.setRoomItems(bedroomItems);
		
		return bedroom;
	}
	
}
