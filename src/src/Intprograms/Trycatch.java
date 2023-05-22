package Intprograms;

public class Trycatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10,b=0;
		try
		{
			int c=a/b;
			System.out.println("rest of the code");
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}

	}

}
