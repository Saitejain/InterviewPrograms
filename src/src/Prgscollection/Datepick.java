package Prgscollection;

import java.text.SimpleDateFormat;
import java.util.*;

public class Datepick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d = new Date();
		SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy");
		String Today = s.format(d);
		System.out.println(Today);
		
	}

}
