package ss.week3.pw;

public class BasicChecker implements Checker{

	public static final String INITPASS = "test123";
	
	/**
	 * Checks if a Password follows the BasicChecker rules
	 */
	@Override
	public boolean acceptable(String s) {
		return !(s.contains(" ") || s.length() < 6);
	}
	
	/**
	 * Generates a password following the BasicChecker rules.
	 */
	//@ ensures \result.length() > 6;
	//@ ensures !(\result.contains(" "));
	@Override
	public String generatePassword() {
		return INITPASS;
	}
}
