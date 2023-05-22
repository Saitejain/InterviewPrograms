package Testprograms;

public class Swappingwiththirdvar {

	public static void main(String[] args) {
		int x=789, y= 456, z;
		
		System.out.println("Value of x Before Swapping:" + x);
		System.out.println("Value of y Before Swapping:" + y);
		z=x;
		x=y;
		y=z;
		System.out.println("Value of x  After Swapping:" + x);
		System.out.println("Value of y  After Swapping:" + y);

	}

}
