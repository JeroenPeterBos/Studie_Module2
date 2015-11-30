package ss.week3.hotel;

import java.io.PrintStream;

public class Hotel {

	// ------------------------ Instance Variables ----------------------- //
	
	private String hotelName;
	private Password password;
	
	private Room room1;
	private Room room2;

	
	// ------------------------ Constructors ----------------------------- //
	
	public Hotel(String hotelName){
		this.hotelName = hotelName;
		password = new Password();
		room1 = new Room(7);
		room2 = new Room(10);
	}
	
	// ------------------------ Commands --------------------------------- //
	
	/**
	 * Checks in the <code>Guest</code> in a free <code>Room</code>.
	 * @param pass password for checking in
	 * @param name name of the guest
	 * @return A object <code>Room</code> with a <code>Guest</code> of the given name checked in.
	 */
	//@ requires Password.acceptable(pass);
	//@ requires name != "";
	//@ ensures \old(getFreeRoom()).getGuest() != null;
	//@ ensures \old(getFreeRoom()).getGuest().getRoom() != null;
	public Room checkIn(String pass, String name){
		if(!password.testWord(pass) || getFreeRoom() == null || getRoom(name) != null) {
			return null;
		} else {
			Guest g = new Guest(name);
			Room r = getFreeRoom();
			g.checkin(r);
			return r;
		}
	}
	
	/**
	 * Checks out the guest and the safe in the room is deactivated.
	 * @param name name of the guest
	 */
	//@ requires name != "";
	//@ ensures \old(getRoom(name)).getGuest() == null;
	//@ ensures !\old(getRoom(name)).getSafe().isActive();
	public void checkOut(String name){
		Room r = getRoom(name);
		
		if(r != null){
			r.getGuest().checkout();
			r.getSafe().deactivate();
		}
	}
	// ------------------------ Queries ---------------------------------- //
	
	/**
	 * Returns an available <code>Room</code>
	 * @return <code>Room</code> where no <code>Guest</code> is checked in or null if there is no free <code>Room</code> available.
	 */
	public Room getFreeRoom(){
		if(room1.getGuest() == null){
			return room1;
		} else if(room2.getGuest() == null){
			return room2;
		} else {
			return null;
		}
	}
	
	/**
	 * Returns the room of the given <code>Guest</code>.
	 * @param name name of the guest
	 * @return <code>Room</code> where the <code>Guest</code> is checked in or null if there is no such room of guest.
	 */
	public Room getRoom(String name){
		if(room1 != null && room1.getGuest() != null && room1.getGuest().getName().equals(name)){
			return room1;
		} else if(room2 != null && room2.getGuest() != null && room2.getGuest().getName().equals(name)) {
			return room2;
		} else {
			return null;
		}
	}
	
	/**
	 * Returns the Password object of the <code>Hotel</code>.
	 * @return <code>Password</code> belonging to the <code>Hotel</code>
	 */
	public Password getPassword(){
		return password;
	}
	
	public Bill getBill(String name, int noNights, PrintStream ps){
		Room r = getRoom(name);
		
		if(r == null || !(r instanceof PricedRoom)){
			return null;
		}
		
		Safe s = r.getSafe();
		PricedRoom room = (PricedRoom)r;
		Bill result = new Bill(ps);
		
		for(int i = 0; i < noNights; i++){
			result.newItem(room);
		}
		
		if(s instanceof PricedSafe){
			PricedSafe sa = (PricedSafe) s;
			result.newItem(sa);
		}
		
		result.close();
		return result;
	}
	
	/**
	 * Returns a string with a description of all the guests, rooms and safes.
	 */
	public String toString(){
		String result = "";
		result += hotelName;
		if(room1 != null && room1.getGuest() != null){
			result += " " + room1.getGuest().getName();
		} else if(room2 != null && room2.getGuest() != null) {
			result += " " + room2.getGuest().getName();
		}
		return result;
	}
}
