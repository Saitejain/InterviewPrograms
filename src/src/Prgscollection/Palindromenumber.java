package Prgscollection;
import java.util.*;
public class Palindromenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Number Below :");
	    int num = sc.nextInt();
		//int num=728;
	    int r,temp,sum=0;
        temp=num;
        while(num>1)
        {
        	r=num%10;
        	sum=(sum*10)+r;
        	num=num/10;
        }
        if(temp==sum) {
        	System.out.println("It is a Palindrome Number");
        }
        else
        {
        	System.out.println("It is not a Palindrome Number");
        }
	
		sc.close();

	}

}
