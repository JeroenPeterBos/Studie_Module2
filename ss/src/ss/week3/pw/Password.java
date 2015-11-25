package ss.week3.pw;

public class Password {

	public static final String INITIAL = "PASSWORD";
	private String password;
	
	private Checker checker;
	private String factoryPassword;
	
	public Password(Checker checker){
		this.checker = checker;
		this.factoryPassword = checker.generatePassword();
	}
	
	public Password(){
		this(new BasicChecker());
	}
	
	public boolean acceptable(String suggestion){
		return !(suggestion.contains(" ") || suggestion.length() < 6);
	}
	
	public boolean testWord(String test){
		return password.equals(test);
	}
	
	public boolean setWord(String oldpass, String newpass){
		boolean result = false;
		
		if(testWord(oldpass) && acceptable(newpass)){
			password = newpass;
			result = true;
		}
		
		return result;
	}
}
