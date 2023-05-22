package Assignments;

import java.util.Random;

public class randomtest {
	
	public static void otp() {
		Random r = new Random();
		System.out.println(r.nextInt(50));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.out.println("from Main method");
		otp();

	}

}
