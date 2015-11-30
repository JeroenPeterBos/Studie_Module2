package ss.week3.hotel;

public class PricedSafe extends Safe implements Bill.Item{

	private final String text;
	private final double safePrice;
	//@ private invariant safePrice > 0;
	
	public PricedSafe(double safePrice){
		super("TestPass");
		
		this.text = "PricedSafe";
		this.safePrice = safePrice;
	}

	@Override
	/*@ pure */ public double getAmount() {
		return safePrice;
	}
	
	@Override
	/*@ pure */ public String toString(){
		return text + safePrice;
	}
}
