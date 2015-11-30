package ss.week2.test;

import org.junit.Before;
import org.junit.Test;

import ss.week3.hotel.Guest;
import ss.week3.hotel.Room;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RoomTest {
    private Guest guest;
    private Room room;

    @Before
    public void setUp() {
        guest = new Guest("Jip");
        room = new Room(101);
    }

    @Test
    public void testSetUp() {
        assertEquals(101, room.getNumber());
    }

    @Test
    public void testSetGuest() {
        room.setGuest(guest);
        assertEquals(guest, room.getGuest());
    }
    @Test
    public void testSetRoom() {
    	guest.checkin(room);
    	assertEquals(room, guest.getRoom());
    }
    
    @Test
    public void testSetSafePass() {
    	room.getSafe().getPassword().setWord("kut_jml", "leptoptasch");
    	assertTrue( room.getSafe().getPassword().testWord("leptoptasch"));
    }
}
