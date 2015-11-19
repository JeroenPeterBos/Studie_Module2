package ss.week2.test;

import static org.junit.Assert.fail;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Before;
import org.junit.Test;

import ss.week2.hotel.Safe;

public class SafeTest {

	private Safe safe1;
	
	@Before
	public void setup(){
		safe1 = new Safe("wachtwoord");
	}
	
	@Test
	public void testInit(){
		assertTrue(safe1.getPassword().testWord("wachtwoord"));
		assertFalse(safe1.getPassword().testWord("ditistext"));
		assertFalse(safe1.isActive());
		assertFalse(safe1.isOpen());
	}

	@Test
	public void testActive(){
		safe1.activate("wachtwoord");
		assertTrue(safe1.isActive());
		safe1.deactivate();
		assertFalse(safe1.isActive());
	}
	
	@Test
	public void testOpen(){
		safe1.activate("wachtwoord");
		assertTrue(safe1.isActive());
		
		safe1.open("wachtwoord");
		assertTrue(safe1.isOpen());
		safe1.close();
		assertFalse(safe1.isOpen());
	}
}
