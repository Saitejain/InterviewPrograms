package Firstphase;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionQ1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "I am Saiteja.Attending interview between 4-5pm ";
		Pattern p = Pattern.compile("[0-9]+");
		Matcher m = p.matcher(s);
		while(m.find()) {
			System.out.print(m.group());
		}
    
	
		
	}

}
