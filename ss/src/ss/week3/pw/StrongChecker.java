package ss.week3.pw;

public class StrongChecker extends BasicChecker{

	/**
	 * Checks if a password follows the StringChecker rules
	 */
	/*@ pure */public boolean acceptable(String s){
		Character first = s.charAt(0);
		Character last = s.charAt(s.length() - 1);
		
		return (super.acceptable(s) && !Character.isDigit(first) && Character.isDigit(last));
	}
	
	/**
	 * Generates a password following the StrongChecker rules
	 */
	//@ ensures acceptable(\result); 
	/*@ pure */ public String generatePassword(){
		return "a" + super.generatePassword() + "1";
	}
}
