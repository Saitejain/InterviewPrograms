package interviewques;

import java.util.Scanner;

public class PrimeNumbereasy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number below ");
		int num = sc.nextInt();
		int count = 0;
		if(num>1) {
			for(int i=1;i<=num;i++)
			{
				if(num%i==0)
					count++;
			}
			if(count==2) {
				System.out.println("It is a Prime Number");
			}
			else 
			{
				System.out.println("It is not a Prime Number---Try Again with another Number");
			}
		}
		else
		{
			System.out.println("It is not a prime number");
		}
		
		sc.close();
		

	}

}
