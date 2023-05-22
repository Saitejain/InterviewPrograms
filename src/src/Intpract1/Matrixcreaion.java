package Intpract1;

import java.util.Scanner;

public class Matrixcreaion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no.of Rows");
		int row = sc.nextInt();
		System.out.println("Enter no.of columns");
		int cols = sc.nextInt();
		int[][] matrix = new int[row][cols];
		System.out.println("Enter the matrix data: ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < cols; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		System.out.println("Your matrix is : ");

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.printf(matrix[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
