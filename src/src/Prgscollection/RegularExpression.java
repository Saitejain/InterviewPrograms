package Prgscollection;

import java.util.*;
import java.util.regex.*;

public class RegularExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "lsSUOAOHD232434@$$%AKAndsllls";
		Pattern p = Pattern.compile("[^A-Za-z0-9]+");
		Matcher m = p.matcher(s);
		while(m.find()) {
			System.out.println(m.group());
		}

	}

}
