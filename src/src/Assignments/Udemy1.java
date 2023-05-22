package Assignments;
import java.util.*;

public class Udemy1 {
	
	 public static void checkNumber(){
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the Number: ");
	        int num = sc.nextInt();
	        if(num>0)
	        {
	            System.out.println("It is positive number");
	        }
	        else if(num<0)
	        {
	            System.out.println("It is negative number");
	        }
	        else if(num==0)
	        {
	            System.out.println("It is zero number");
	        }
	        }
	 public static void main(String[] args) {
		 Udemy1 u1 = new Udemy1();
		checkNumber();
		u1.checkNumber();
	}
	   
	}


