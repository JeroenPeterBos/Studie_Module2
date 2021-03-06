package ss.week2;

public class Rectangle {

	// -------------------- Instance variables ------------------ //
	//@ private invariant length > 0;
	private int length;
	//@ private invariant width > 0;
	private int width;
	
	// -------------------- Constructors ------------------------ //
	//@ requires len > 0 && wid > 0;
	//@ ensures length() == len && width() == wid;
	public Rectangle(int len, int wid){
		this.length = len;
		this.width = wid;
	}
	
	// -------------------- Queries ----------------------------- //
	
	//@ ensures \result > 0;
	/*@ pure */ public int length(){
		return length;
	}
	
	//@ ensures \result > 0;
	/*@ pure */ public int width(){
		return width;
	}
	
	/*@ requires length() > 0;
	   requires width() > 0;
	   ensures \result == length() * width();
	 */
	/*@ pure */ public int area(){
		return length() * width();
	}
	/*@ requires length() > 0;
	   requires width() > 0;
	   ensures \result > 0;
	 */
	/*@ pure */ public int perimeter(){
		return (length() + width()) * 2;
	}
	
	// -------------------- Commands ----------------------------- //
}
