package ss.week3.hotel;

/**
 * Guest with name and possibly a room.
 * @author Jeroen Bos
 * @version $Revision: 1.0 $
 */
public class Guest {

	// ------------------ Instance variables ------------------ //
	private String name;
	private Room room;
	
	// ------------------ Constructor ------------------------- //
	/**
     * Creates a <code>Guest</code> with the given name, without a room.
     * @param n the guests <code>name</code>
     */
	public Guest(String n){
		this.name = n;
	}
	
	// ------------------ Getters ----------------------------- //
	/**
     * Returns the name of this <code>Guest</code>.
     */
	public String getName(){
		return name;
	}
	
	/**
     * Returns the current room in witch this <code>Guest</code> lives.
     * @return the room of this <code>Guest</code>;
     *         <code>null</code> if this <code>Guest</code> 
     *         is not checked in.
     */
	public Room getRoom() {
		return room;
	}
	
	// ------------------ Setters ----------------------------- //
	
	
	// ------------------ Commands ---------------------------- //
	/**
     * Assigns a <code>Room</code> to this <code>Guest</code>.
     * @param r the room the <code>Guest</code> rents;
     *        @return false if <code>Guest</code> already has a room
     *        or <code>Room</code> already has a guest or r is empty
     *        else return true.
     */
	public boolean checkin(Room r){
		if(r == null || room != null || r.getGuest() != null)
			return false;
		this.room = r;
		r.setGuest(this);
		return true;
	}
	
	/**
	 * Clears the connection of <code>Guest</code> with <code>Room</code>
	 * @return false if <code>room</code> is empty
	 * 			true if success
	 */
	public boolean checkout(){
		if(room == null)
			return false;
		room.setGuest(null);
		room = null;
		return true;
	}
	
	/**
	 * Returns a string with the name of the guest and the room number
	 */
	@Override
	public String toString(){
		return "Guest " + name;
	}
}
