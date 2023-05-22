package Testprograms;

public class Swappingwithtwovar {

	public static void main(String[] args) {
		int x=10, y=95;
		System.out.println("Value of x Before Swapping:" + x);
		System.out.println("Value of y Before Swapping:" + y);
		
		
		x=x+y;
		y=x-y;
		x=x-y;
		
		System.out.println("Value of x  After Swapping:" + x);
		System.out.println("Value of y  After Swapping:" + y);
	}

}
