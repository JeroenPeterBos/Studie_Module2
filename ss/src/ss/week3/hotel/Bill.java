package ss.week3.hotel;

import java.io.PrintStream;

import ss.week3.Format;

public class Bill {
	
	// ------------------------------- Instance Variables ------------------------------ //
	
	private final PrintStream theOutStream;
	private double sum = 0;
	
	// ------------------------------- Constructors ------------------------------------ //
	
	public Bill(PrintStream theOutStream){
		this.theOutStream = theOutStream;
	}
	
	// ------------------------------- Commands ---------------------------------------- //
	
	/**
	 * Prints the sum of the bill to the outputstream.
	 */
	/*@ pure */ public void close(){
		if(theOutStream != null)
			theOutStream.print(Format.billFormat("total:", sum));
	}
	
	/**
	 * Adds a new item to the bill and prints it name and amount to the outputstream.
	 * @param i item to add to the item
	 */
	//@ ensures getSum() == \old(getSum()) + i.getAmount();
	public void newItem(Item i){
		sum += i.getAmount();
		if(theOutStream != null)
			theOutStream.print(Format.billFormat(i.toString(), i.getAmount()));
	}
	
	// ------------------------------- Queries ----------------------------------------- //
	
	/*@ pure */ public double getSum(){
		return sum;
	}
	
	// ------------------------------- Interfaces -------------------------------------- //
	
	public interface Item{
		
		/*@ pure */ public double getAmount();
		
		/*@ pure */ public String toString();
	}
}
