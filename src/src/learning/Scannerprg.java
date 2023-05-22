package learning;

import java.util.Scanner;

public class Scannerprg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name : ");
		String name = sc.nextLine();
		//System.out.println(name);
		String Check = "";
		String Orgname = name;
		for (int i = name.length() - 1; i >= 0; i--) {
			Check = Check + name.charAt(i);
		}
		if (Orgname.equalsIgnoreCase(Check)) {
			System.out.println("It is a Palindrome name");
		} else {
			System.out.println("It is not a Palindrome name");
		}
           
		sc.close();
	}

}
