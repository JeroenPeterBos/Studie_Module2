package ss.week3;

import java.util.Locale;

public class Format {

	/*@ pure */ public static void printLine(String text, double amount){
		System.out.format(Locale.ENGLISH, "%-15s %8.2f%n", text, amount);
	}
	
	/*@ pure */ public static String billFormat(String text, double amount){
		return String.format(Locale.ENGLISH, "%-15s %8.2f%n", text, amount);
	}
	
	public static void main(String[] args){
		printLine("text1", 1.00);
		printLine("other text", -12.12);
		printLine("something", 0.20);
	}
}
