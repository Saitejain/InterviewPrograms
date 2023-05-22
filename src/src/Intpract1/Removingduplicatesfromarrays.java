package Intpract1;

import java.util.ArrayList;
import java.util.HashSet;

import Collections.Arraylist;

public class Removingduplicatesfromarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> lwd = new ArrayList<String>();
		lwd.add("hospital");
		lwd.add("medicines");
		lwd.add("ambulance");
		lwd.add("hospital");
		lwd.add("medicines");
		lwd.add("field");
		lwd.add("ambulance");
		System.out.println("with duplicates " + lwd);
		HashSet<String> set = new HashSet<String>(lwd);
		ArrayList<String> lwod = new ArrayList<String>(set);
		System.out.println("Without duplicates "+ lwod);
		

	}

}
