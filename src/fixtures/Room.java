package fixtures;

public class Room extends Fixture{
	
	public Room(String name, String shortDescription, String longDescription) {
		super(name, shortDescription, longDescription);
	}
	public Item[] roomItems; 
	
	public Room eastRoom;
	public Room westRoom;
	public Room northRoom;
	public Room southRoom;
	
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

}
