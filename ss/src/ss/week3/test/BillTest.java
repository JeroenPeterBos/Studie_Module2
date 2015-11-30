package ss.week3.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.After;

import static org.junit.Assert.assertTrue;

import ss.week3.hotel.Bill;
import ss.week3.hotel.BillItem;

public class BillTest {

	private Bill bill;
	
	@Before
	public void setup(){
		bill = new Bill(null);
	}
	
	@Test
	public void test() {
		double sum = bill.getSum();
		BillItem bi = new BillItem("test", 1.34);
		bill.newItem(bi);
		sum += bi.getAmount();
		assertTrue("testom.", sum == bill.getSum());
	}
	
	@After
	public void finish(){
		bill.close();
	}
}
