package game;

import fixtures.Item;
import fixtures.Room;

public class RoomManager {
	public Room startingRoom; 
	public Room[] rooms;
	
	public RoomManager() {
		this.createRooms();
	}
	
	private void createRooms() {
		
		Room kitchen = createKitchen();
		Room livingRoom = createLivingRoom();
		Room bathroom = createBathroom();
		Room garage = createGarage();
		
		
		kitchen.setEastRoom(livingRoom);
		livingRoom.setWestRoom(kitchen);
		
		kitchen.setSouthRoom(bathroom);
		bathroom.setNorthRoom(kitchen);
		
		kitchen.setWestRoom(garage);
		garage.setEastRoom(kitchen);
		
	
		Room[] allRooms = {kitchen, livingRoom, bathroom};
		
		this.rooms = allRooms;
		
	}
	
	private Room createKitchen() {
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
		return kitchen;
	}
	
	private Room createLivingRoom() {
		Room livingRoom = new Room("Living Room", 
				"A place to hangout and watch TV.", 
				"This room is has couches and lots of fun things to do.");
		
		Item tv = new Item("TV", 
				"A device to watch shows.",
				"This device is used most often in the living room.");
		
		Item couch = new Item("Couch", 
				"Used to sit and enjoy each other's company.",
				"This item is at the corner of the room and is blue.");
		
		Item[] livingRoomItems = {tv, couch};
		livingRoom.roomItems = livingRoomItems;
		
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
		
		bathroom.roomItems = bathroomItems;
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
		garage.roomItems = garageItems;
				
		return garage;
	}
	
}
