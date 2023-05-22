package Assignments;

import java.util.Scanner;

public class Studentresult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Marks :");
		int marks = s.nextInt();
		if (marks < 35) {
			System.out.println("You got failed Best of luck for the next attempt");
		}

		else if (marks == 35) {
			System.out.println("You got the pass marks");
		} else if (marks > 35 && marks <= 70) {
			System.out.println("You got third class");
		} else if (marks > 70 && marks <= 85) {
			System.out.println("You got the Second class");
		} else if (marks > 85) {
			System.out.println("You got the First class");
		}

	}

}
