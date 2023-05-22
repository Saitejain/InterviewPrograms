package Recollect;

public class Factorials {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i,fact=1;
		int num=10;
		for( i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of "+ num + " is:"+ fact);
	}

}
