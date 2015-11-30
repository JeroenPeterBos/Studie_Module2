package ss.week3.pw;

public class Password {
	
	private Checker checker;
	private String factoryPassword;
	
	/**
	 * Creates a new password with a giver checker that will generate a password.
	 * @param checker the checker for this password
	 */
	public Password(Checker checker){
		this.checker = checker;
		this.factoryPassword = checker.generatePassword();
	}
	
	/**
	 * A default constructor which calls the first constructor with a default checker.
	 */
	public Password(){
		this(new BasicChecker());
	}
	
	/**
	 * Checks if the test word is equal to the password.
	 * @param test the word to be tested
	 * @return true if test word was equal to the password.
	 */
	/*@ pure */ public boolean testWord(String test){
		return factoryPassword.equals(test);
	}
	
	/**
	 * Sets a new password if the given password is correct.
	 * @param oldpass the current password that needs to be tested
	 * @param newpass the new password
	 * @return true if the setword was succesful thus the pasword was changed 
	 */
	//@ ensures \old(testWord(oldpass)) && !oldpass.equals(newpass) ==> testWord(newpass);
	public boolean setWord(String oldpass, String newpass){
		boolean result = false;
		
		if(testWord(oldpass) && checker.acceptable(newpass) && !oldpass.equals(newpass)){
			factoryPassword = newpass;
			result = true;
		}
		
		return result;
	}
	
	
}
