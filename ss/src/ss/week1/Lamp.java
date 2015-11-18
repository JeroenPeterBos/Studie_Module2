package ss.week1;

/**
 * 
 * @author Jeroen Bos
 * @version $Revision: 1.0 $
 */
public class Lamp {
	
	// ------------------------- Instance variables ------------------//
	private int setting;
	
	public static int OFF = 0;
	public static int LOW = 1;
	public static int MEDIUM = 2;
	public static int HIGH = 3;
	
	// ------------------------- Constructor -------------------------//
	
	/**
	 * Creates a <code>Lamp</code> with a current setting
	 * @param i the setting
	 */
	public Lamp(int i){
		setting = i;
	}
	
	// ------------------------- Queries -----------------------------//
	
	/** 
	 * Returns the current setting
	 */
	public int getSetting(){
		return setting;
	}
	
	// ------------------------- Commands ----------------------------//
	
	/**
	 * Sets a new setting
	 * @param s new setting
	 */
	public void setSetting(int s){
		setting = s % 4;
	}
	
	/**
	 * Cycles through the settings
	 */
	public void switchSetting(){
		setting++;
		setting = ((setting) % 4);
	}
	
	public void printSetting(){
		System.out.println("Setting " + setting + "\n");
	}
	
	public static void main(String[] args){
		Lamp lamp = new Lamp(0);
		
		System.out.println("Setting "+ lamp.getSetting());
		lamp.printSetting();
		
		lamp.setSetting(1);
		lamp.printSetting();
		
		lamp.setSetting(7);
		lamp.printSetting();
		
		lamp.switchSetting();
		lamp.printSetting();
		
		lamp.switchSetting();
		lamp.printSetting();
		
		lamp.switchSetting();
		lamp.printSetting();
		
		lamp.switchSetting();
		lamp.printSetting();
	}
}
