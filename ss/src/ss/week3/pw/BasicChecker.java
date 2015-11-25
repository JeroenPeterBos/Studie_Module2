package ss.week3.pw;

public class BasicChecker implements Checker{

	@Override
	public boolean acceptable(String s) {
		return !(s.contains(" ") || s.length() < 6);
	}
	
	@Override
	public String generatePassword() {
		return "Simple";
	}
}
