package Prgscollection;
import java.util.*;
public class Factorialnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Number Below to get factorial of it :");
		int num= sc.nextInt();
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of given number " +num+" is :" + fact);
		sc.close();
	}

}
