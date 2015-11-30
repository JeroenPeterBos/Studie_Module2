package ss.week3.pw;

public class TimedPassword extends Password{

	private long validTime;
	private long startTime;
	
	/**
	 * Creates a new TimedPassword with the given expirationTime.
	 * @param expirationTime how long the password is valid
	 */
	public TimedPassword(int expirationTime){
		this.startTime = System.currentTimeMillis();
		this.validTime = expirationTime * 1000;
	}
	
	/**
	 * Creates a new TimedPassword with the default expirationTime of 10 s.
	 */
	public TimedPassword(){
		this(10);
	}
	
	// if testpassword is overiden then setWord will no longer function.
	
	/**
	 * Validates if the timedpassword is still valid.
	 * @return wether the password is expired or not.
	 */
	public boolean isExpired(){
		return (startTime + validTime < System.currentTimeMillis());
	}
	
	/**
	 * Sets the new word (see class Password) and resets the startTime.
	 */
	public boolean setWord(String oldpass, String newpass){
		startTime = System.currentTimeMillis();
		return super.setWord(oldpass, newpass);
	}
}
