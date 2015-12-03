package ss.week4;

public class Exponent implements Function {

	// ------------------------------- Enumerations ------------------------------------ //
	
	// ------------------------------- Instance Variables ------------------------------ //
	
	private int n;
	
	// ------------------------------- Constructors ------------------------------------ //
	
	public Exponent(int n) {
		this.n = n;
	}
	
	// ------------------------------- Commands ---------------------------------------- //
	
	// ------------------------------- Queries ----------------------------------------- //
	
	@Override
	public double apply(double x) {
		double result = 1;
		
		if (x == 0) {
			return 0;
		}
		
		for (int i = 0; i < n; i++) {
			result *= x;
		}
		
		return result;
	}
	
	@Override
	public Function derivative() {
		return new LinearProduct(new Constant(n), new Exponent(n - 1));
	}
	
	@Override
	public String toString() {
		return "x^" + Integer.toString(n);
	}
}
