package ss.week1;

public class Password {

	public static final String INITIAL = "PASSWORD";
	
	private String password;
	
	public Password(){
		password = INITIAL;
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
