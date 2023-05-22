package Assignments;

import java.util.Scanner;

public class Oddeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Please Enter your number :");
		int n = s1.nextInt();
		/*if(n==0)
		{
			System.out.println("It is an even number");
		}*/
		
		if(n%2==0)
		{
			System.out.println(n + " It is an even number");
		}
		else {
			System.out.println(n + " It is an odd number");
		}
		

	}

}
