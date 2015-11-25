package ss.week3.pw;

public class StrongChecker extends BasicChecker{

	public boolean acceptable(String s){
		Character first = s.charAt(0);
		Character last = s.charAt(s.length() - 1);
		
		return (super.acceptable(s) && !Character.isDigit(first) && Character.isDigit(last));
	}
	
	public String generatePassword(){
		return "a" + super.generatePassword() + "1";
	}
}
