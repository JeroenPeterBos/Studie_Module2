package ss.week3.hotel;

public class PricedRoom extends Room implements Bill.Item{

	private double roomPrice;
	// private invariant roomPrice > 0;
	
	public PricedRoom(int number, double roomPrice, double safePrice){
		super(number, new PricedSafe(safePrice));
		
		this.roomPrice = roomPrice;
	}
	
	/*@ pure */ public double getAmount(){
		return roomPrice;
	}
	
	/*@ pure */ public String toString(){
		return Integer.toString(getNumber()) + roomPrice;
	}
}
