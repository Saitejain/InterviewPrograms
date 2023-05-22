package learning;

import java.util.Scanner;

public class Swittchh {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		int num=sc.nextInt();
		
		switch(num) {
		
		case 1 : System.out.println("Hello this is 1");
		break;
		case 2 : System.out.println("Hello this is 2");
		break;
		case 3 : System.out.println("Hello this is 3");
		break;
		default :System.out.println("Hello you are out of range");
		break;
	
		}

	}

}
