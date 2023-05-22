package Collections;

import java.util.ArrayList;
import java.util.List;

public class Arraylist {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		ArrayList<String> as = new <String>ArrayList();
		ArrayList<Integer> ai = new <Integer>ArrayList();
		List ali = new ArrayList();
		
		al.add("Testing");
		al.add("arr");
		ai.add(789);
		as.add("checking");
		System.out.println(al);
        System.out.println(as);
        System.out.println(ai);
        al.add("sum");
        System.out.println(al.get(2));
        System.out.println(al.size());
        al.add(1,"added new array");
        System.out.println(al);
        al.remove(1);
        System.out.println(al);
        
	}

}
