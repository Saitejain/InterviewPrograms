package Intpract1;

import java.util.Scanner;

public class Matrixcheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The Number Of Rows");

		int row = sc.nextInt();

		System.out.println("Enter The Number Of Columns");

		int cols = sc.nextInt();

		// defining 2D array to hold matrix data

		int[][] matrix = new int[row][cols];

		System.out.println("Enter Matrix Data");

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < cols; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}

		System.out.println("Your Matrix is : ");

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(matrix[i][j]);
			}
           System.out.println();
			
		}
	}

}
