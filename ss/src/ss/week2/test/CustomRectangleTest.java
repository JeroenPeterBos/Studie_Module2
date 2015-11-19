package ss.week2.test;

import ss.week2.Rectangle;

import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class CustomRectangleTest {

	private Rectangle a;
	private Rectangle b;
	
	@Before
	public void setup(){
		a = new Rectangle(100, 50);
		b = new Rectangle(75, 75);
	}
	
	@Test
	public void testInitialValue(){
		assertEquals(100, a.length());
		assertEquals(75, b.length());
		assertEquals(50, a.width());
		assertEquals(75, b.width());
	}
	
	@Test
	public void testArea(){
		assertEquals(5000, a.area());
		assertEquals(5625, b.area());
	}
	
	@Test
	public void testPerimeter(){
		assertEquals(300, a.perimeter());
		assertEquals(300, b.perimeter());
	}
}
