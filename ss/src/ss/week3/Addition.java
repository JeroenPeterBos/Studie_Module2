package ss.week3;

public class Addition implements OperatorWithIdentity{

	/**
	 * Adds the left and the right integer together and returns the result.
	 */
	//@ ensures \result == left + right;
	public int operate(int left, int right) {
		return left + right;
	}

	/**
	 * Returns this operators default value.
	 */
	//@ ensures \result == 0;
	public int identity() {
		return 0;
	}

}
