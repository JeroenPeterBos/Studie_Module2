package ss.week4;

public class LinearProduct extends Product {

	// ------------------------------- Enumerations ------------------------------------ //
	
	// ------------------------------- Instance Variables ------------------------------ //
	
	private Constant a;
	
	// ------------------------------- Constructors ------------------------------------ //
	
	public LinearProduct(Constant a, Function b) {
		super(a, b);
		this.a = a;
	}
	
	// ------------------------------- Commands ---------------------------------------- //
	
	// ------------------------------- Queries ----------------------------------------- //
	
	@Override
	public Function derivative() {
		return new LinearProduct(a, b.derivative());
	}
}
