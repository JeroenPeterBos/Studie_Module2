package ss.week3.pw;

public interface Checker {

	/**
	 * Checks if a password follows this checkers rules
	 * @param string password to check
	 * @return returns if the password is acceptable
	 */
	/*@ pure */ public boolean acceptable(String string);
	
	/**
	 * Generates password following this Checkers rules.
	 * @return a generated string that follows the rules of this Checker.
	 */
	/*@ pure */ public String generatePassword();
}
