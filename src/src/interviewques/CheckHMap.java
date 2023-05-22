package interviewques;
import java.util.*;
import java.util.Map.Entry;

public class CheckHMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		 HashMap<String,Integer> words = new HashMap<>();
		 
		 words.put("sai", 8);
		 words.put("Teja", 9);
		 words.put("sai", 10);
		 System.out.println(words);
		 
		if( words.containsValue(6))
		{
			System.out.println("Value is present");
		}
		else {
			System.out.println("Value is not present");
		}
		System.out.println(words.get("Teja"));
		System.out.println(words.get("sai"));
		
		for(Entry<String, Integer> e:words.entrySet()) {
			System.out.println(e.getKey());
			System.out.println(e.getValue());
			System.out.println(e.hashCode());
		}
				 
		 
	}

}
