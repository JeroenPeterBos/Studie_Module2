package ss.week1;

public class DollarsAndCentsCounter {

	private int cents;
	
	public int dollars(){
		return cents / 100;
	}
	
	public int cents(){
		return cents % 100;
	}
	
	public void reset(){
		cents = 0;
	}
	
	public void add(int dollars, int cents){
		this.cents += (dollars * 100) + cents;
	}
}
