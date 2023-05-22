package Testprograms;

import java.util.HashMap;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String s = ("6,0,3,0,3,0,5");
         
       HashMap<Character,Integer> charcount = new HashMap<>();
         for(int i=s.length()-1;i>=0;i--)
         {
        	 if(charcount.containsKey(s.charAt(i)))
        	 {
        		 int count = charcount.get(s.charAt(i));
        		 charcount.put(s.charAt(i),++count);
        	 }
        	 else
        	 {
        		 charcount.put(s.charAt(i), 1);
        	 }
         }
         System.out.println(charcount);
	}

}
