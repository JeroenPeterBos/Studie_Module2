package ss.week3.pw;

public class TimedPassword extends Password{

	private long validTime;
	private boolean isExpired;
	
	public TimedPassword(int expirationTime){
		this.validTime = System.currentTimeMillis() + expirationTime;
	}
	
	public TimedPassword(){
		this(10);
	}
}
