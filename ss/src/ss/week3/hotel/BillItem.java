package ss.week3.hotel;

public class BillItem implements Bill.Item{

	private final String text;
	private final double amount;
	//@ private invariant amount > 0;
	
	public BillItem(String text, double amount){
		this.text = text;
		this.amount = amount;
	}
	
	@Override
	/*@ pure */ public double getAmount() {
		return amount;
	}
	
	@Override
	/*@ pure */ public String toString(){
		return text;
	}

}
