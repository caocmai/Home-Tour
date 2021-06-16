package fixtures;

import java.util.Arrays;

public class Room extends Fixture{
	
	public Room(String name, String shortDescription, String longDescription) {
		super(name, shortDescription, longDescription);
	}
	public Item[] roomItems = null; 
	
	private Room eastRoom = null;
	private Room westRoom = null ;
	private Room northRoom = null;
	private Room southRoom = null;
	
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
	@Override
	public String toString() {
		return "Room [roomItems=" + Arrays.toString(roomItems) + ", eastRoom=" + eastRoom + ", westRoom=" + westRoom
				;
	}
	
	

	

	
	
	

}
