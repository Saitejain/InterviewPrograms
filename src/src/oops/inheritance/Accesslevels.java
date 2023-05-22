package oops.inheritance;

public class Accesslevels extends Sim5g {

	
	public static void main(String[] args) {
		/*Sim2g s2 = new Sim2g();
		Sim3g s3 = new Sim3g();
		Sim4g s4 = new Sim4g();*/
		Sim5g s5 = new Sim5g();
		
		s5.calling();
		s5.sms();
		s5.gprs();
		s5.volte4g();
		s5.net5g();
		
		
		
	}

}
