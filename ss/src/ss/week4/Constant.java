package ss.week4;

public class Constant implements Function {
	
	// ------------------------------- Enumerations ------------------------------------ //
	
	// ------------------------------- Instance Variables ------------------------------ //
	
	private double constant;
	
	// ------------------------------- Constructors ------------------------------------ //
	
	public Constant(double c) {
		this.constant = c;
	}
	
	// ------------------------------- Commands ---------------------------------------- //
	
	// ------------------------------- Queries ----------------------------------------- //
	
	@Override
	public double apply(double x) {
		return constant;
	}
	
	@Override
	public Function derivative() {
		return new Constant(0);
	}
	
	@Override
	public String toString() {
		return Double.toString(constant);
	}
}
