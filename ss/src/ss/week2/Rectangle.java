package ss.week2;

public class Rectangle {

	// -------------------- Instance variables ------------------ //
	private int length;
	private int width;
	
	// -------------------- Constructors ------------------------ //
	//@ ensures length() > 0;
	//@ ensures width() > 0;
	public Rectangle(int len, int wid){
		this.length = len;
		this.width = wid;
	}
	
	// -------------------- Queries ----------------------------- //
	
	//@ ensures \result > 0;
	/*@ pure */ public int length(){
		assert length > 0;
		return length;
	}
	
	//@ ensures \result > 0;
	/*@ pure */ public int width(){
		assert width > 0;
		return width;
	}
	
	/*@ requires length() > 0;
	   requires width() > 0;
	   ensures \result > 0;
	 */
	/*@ pure */ public int area(){
		assert length() > 0;
		assert width() > 0;
		return length() * width();
	}
	/*@ requires length() > 0;
	   requires width() > 0;
	   ensures \result > 0;
	 */
	/*@ pure */ public int perimeter(){
		assert length() > 0;
		assert width() > 0;
		return (length() + width()) * 2;
	}
	
	// -------------------- Commands ----------------------------- //
}
