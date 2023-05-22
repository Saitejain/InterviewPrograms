package learning;

import java.util.Scanner;

public class Scannerprg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s1 = new Scanner(System.in);
		System.out.println("What is your Name :");
		String name = s1.nextLine();
		System.out.printf("Hi %s, how many years of experience you have \n", name);
		float Exp = s1.nextFloat();
		System.out.println("you having " + Exp + " years of Experience " + "Which domain you currently working on?");
		//System.out.println("Which domain you currently working on?");
		s1.nextLine();
		String domain = s1.nextLine();
		System.out.printf(" you currently working on %s domain ok", domain);
		s1.close();

	}

}
