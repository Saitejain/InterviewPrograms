package interviewques;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Datepicker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date cd = new Date();
	    SimpleDateFormat dateformat=new SimpleDateFormat("dd/MM/yyyy");
	    String today = dateformat.format(cd);
	    System.out.println(today);
		

	}

}
