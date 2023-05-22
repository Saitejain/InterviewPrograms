package practice.page;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Datepick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d = new Date();
		SimpleDateFormat dateformat=new SimpleDateFormat("dd/MM/yyyy");
		String today = dateformat.format(d);
		System.out.println(today);
		
	
		

	}

}
