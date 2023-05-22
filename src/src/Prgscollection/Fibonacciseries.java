package Prgscollection;

public class Fibonacciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b=1,c=0,num=10;
		System.out.print(a+" "+b);
		for(int i=2;i<num;i++) {
			c=a+b;
			System.out.print(" " +c);
			a=b;
			b=c;
		}

	}

}
