package Intprograms;

import java.util.HashMap;
import java.util.Map;

public class Duplicateswithoccurence {

	public static void main(String[] args) {
		 String st = "Saiteja inabaetja";
		HashMap<Character,Integer> map = new HashMap<Character, Integer>();
		for(int i=0;i<st.length();i++)
		{
			char  ch = st.charAt(i);
			if(map.containsKey(ch)) {
				int count = map.get(ch);
				map.put(ch, count);
			}
			else {
				map.put(ch, 1);
			}
		}

	}

}
