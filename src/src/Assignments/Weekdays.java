package Assignments;

import java.util.Scanner;

public class Weekdays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the day");
		int num = s1.nextInt();
		if (num == 0) {
			System.out.println("It is sunday");
		} else if (num == 1) {
			System.out.println("It is monday");

		} else if (num == 2) {
			System.out.println("It is Tuesday");

		} else if (num == 3) {
			System.out.println("It is Wednesday");

		} else if (num == 4) {
			System.out.println("It is Thursday");

		} else if (num == 5) {
			System.out.println("It is Friday");

		} else if (num == 6) {
			System.out.println("It is saturday");

		}

	}

}
