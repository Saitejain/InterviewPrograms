package Intprograms;

import java.util.Scanner;

public class Swappingnumbers1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         //int a=45, b=98;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first value a:" );
		int a=sc.nextInt();
		System.out.println("Enter the first value b:" );
		int b=sc.nextInt();
          System.out.println("Before swapping the values:" +a +" "+b);
          int t=a;
              a=b;
              b=t;
              System.out.println("After Swapping the values:"+a+" "+b);
	}

}
