package ss.week2.hotel;

/**
 * A safe that can be locked and activated.
 * @author Jeroen Bos
 * @version 1.0.0
 */

public class Safe{
	
	// ------------------------- Enumerations ------------------------ //
	
	// ------------------------- Instance Variables ------------------ //
	
	private Password password;
	private boolean active;
	private boolean open;
	
	// ------------------------- Constructors ------------------------ //
	
	/**
	 * Creates a <code>Safe</code> with a given password
	 * @param pass the password for the safe
	 */
	//@ requires Password.acceptable(pass);
	//@ ensures getPassword() != null;
	//@ ensures !isActive();
	//@ ensures !isOpen();
	public Safe(String pass){
		assert Password.acceptable(pass);
		password = new Password();
		password.setWord(password.INITIAL, pass);
		active = false;
		open = false;
	}
	// ------------------------- Commands ---------------------------- //
	
	/**
	 * Activates the <code>Safe</code> if the given password is correct.
	 * @param pass the given password to try
	 */
	//@ requires Password.acceptable(pass);
	public void activate(String pass){
		assert Password.acceptable(pass);
		if(password.testWord(pass))
			active = true;
	}
	
	/**
	 * Closes the safe and then deactivates the safe.
	 */
	public void deactivate(){
		close();
		active = false;
	}
	
	/**
	 * Opens the <code>Safe</code> if it is active and the password is correct.
	 * @param pass the given password to try
	 */
	//@ requires Password.acceptable(pass);
	public void open(String pass){
		assert Password.acceptable(pass);
		if(password.testWord(pass) && active){
			open = true;
		}
	}
	
	/**
	 * Closes the safe, but does not affect the active status.
	 */
	public void close(){
		open = false;
	}
	// ------------------------- Queries ----------------------------- //
	
	/**
	 * Returns the status of the <code>Safe</code>, whether it is activated or deactivated.
	 * @return active status
	 */
	/*@ pure */ public boolean isActive(){
		return active;
	}
	
	/** 
	 * Returns the status of the <code>Safe</code>, whether it is opened of closed.
	 * @return open status
	 */
	/*@ pure */ public boolean isOpen(){
		return open;
	}
	
	/**
	 * Returns the <code>Password</code> of this <code>Safe</code>.
	 * @return <code>Password</code> object that contains accessibility to the password.
	 */
	/*@ pure */ public Password getPassword(){
		return password; 
	}
}
