package Recollect;

import java.util.HashMap;

public class Countofletters {

	public static void main(String[] args) {
		
		String s = "zindagi na milegi dobara";
        HashMap<Character,Integer>  charcount = new HashMap<>();
        for(int i=s.length()-1;i>=0;i--)
        {
        	if(charcount.containsKey(s.charAt(i)))
        	{
        		int count = charcount.get(s.charAt(i));
        		charcount.put(s.charAt(i), ++count);
        		
        	}
        	else{
        		charcount.put(s.charAt(i), 1);
        	}
        }
        System.out.println(charcount);
		
	}

}
