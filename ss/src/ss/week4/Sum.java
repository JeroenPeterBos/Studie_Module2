package ss.week4;

public class Sum implements Function {

	// ------------------------------- Enumerations ------------------------------------ //
	
	// ------------------------------- Instance Variables ------------------------------ //
	
	private Function a, b;
	
	// ------------------------------- Constructors ------------------------------------ //
	
	public Sum(Function a, Function b) {
		this.a = a;
		this.b = b;
	}
	
	// ------------------------------- Commands ---------------------------------------- //
	
	// ------------------------------- Queries ----------------------------------------- //
	
	@Override
	public double apply(double x) {
		return a.apply(x) + b.apply(x);
	}
	
	@Override
	public Function derivative() {
		return new Sum(a.derivative(), b.derivative());
	}
	
	@Override
	public String toString() {
		return a.toString() + " + " + b.toString();
	}
}
