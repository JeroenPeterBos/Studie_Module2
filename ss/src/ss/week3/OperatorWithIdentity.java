package ss.week3;

public interface OperatorWithIdentity {
	
	/**
	 * Perform this operation with the specified operands.
	 */
	/*@ pure */ public int operate(int left, int right);
	
	/**
	 * The identity for this operator. For any int i,
	 * this.operate(this.identity, i) == i
	 * this.operate(i, this.identity) == i
	 */
	/*@ pure */ public int identity();

}
