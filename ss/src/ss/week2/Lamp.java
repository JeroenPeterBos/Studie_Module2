package ss.week2;

/**
 * 
 * @author Jeroen Bos
 * @version $Revision: 1.0 $
 */
public class Lamp {
	
	// ------------------------- Enumerations ------------------------//
	public static enum Setting{ 
		OFF, LOW, MEDIUM, HIGH;
		
		private Setting next;
		
		static{
			OFF.next = LOW;
			LOW.next = MEDIUM;
			MEDIUM.next = HIGH;
			HIGH.next = OFF;
		}	
			
		/* pure */ public Setting next(){
			return next;
		}
	}
	
	// ------------------------- Instance variables ------------------//
	
	private Setting setting;
	
	// ------------------------- Constructor -------------------------//
	
	/**
	 * Creates a <code>Lamp</code> with a current setting
	 * @param i the setting
	 */
	//@ ensures getSetting() == s;
	public Lamp(Setting s){
		this.setting = s;
	}
	
	// ------------------------- Queries -----------------------------//
	
	/** 
	 * Returns the current setting
	 */
	//@ ensures \result == LOW || \result == ;
	/*@ pure */ public Setting getSetting(){
		return setting;
	}
	
	// ------------------------- Commands ----------------------------//
	
	/**
	 * Sets a new setting
	 * @param s new setting
	 */
	//@ ensures getSetting() == s;
	public void setSetting(Setting s){
		setting = s;
	}
	
	/**
	 * Cycles through the settings
	 */
	//@ ensures getSetting() == \old(getSetting()).next();
	public void switchSetting(){
		setting.next();
	}
	
	public static void main(String[] args){
		int i = 10;
		assert i < 9;
		System.out.println(i);
	}
}