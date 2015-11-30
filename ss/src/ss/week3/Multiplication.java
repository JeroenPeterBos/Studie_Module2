package ss.week3;

public class Multiplication implements OperatorWithIdentity{

	/**
	 * Multiplies the left and the right integer and returns the result.
	 */
	//@ ensures \result == left * right;
	public int operate(int left, int right){
		return left * right;
	}
	
	/**
	 * Returns this operators default value.
	 */
	//@ ensures \result == 1;
	public int identity(){
		return 1;
	}
}
