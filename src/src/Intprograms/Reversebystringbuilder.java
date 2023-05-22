package Intprograms;

import java.util.Scanner;

public class Reversebystringbuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        StringBuilder sbl=new StringBuilder();
        sbl.append(num);
        StringBuilder rev=sbl.reverse();
        System.out.println(rev);
	}

}
