package intpracticeprgms;
import java.util.HashMap;    

public class Eachcharcountinstringpr1 {

	public static void main(String[] args) {
		
		String str = "sai teja inabathina";  
		//HashMap char as a key and occurrence as a value  
		HashMap <Character, Integer> charCount = new HashMap<>();  
		for (int i = str.length() - 1; i >= 0; i--)   
		{  
		if(charCount.containsKey(str.charAt(i)))   
		{  
		int count = charCount.get(str.charAt(i));  
		charCount.put(str.charAt(i), ++count);  
		}   
		else   
		{  
		charCount.put(str.charAt(i),1);  
		}  
		}  
		System.out.println(charCount);  
		

	}

}
