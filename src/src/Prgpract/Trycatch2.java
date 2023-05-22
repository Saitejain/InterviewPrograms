package Prgpract;

public class Trycatch2 {

	public static void main(String[] args) {
		int  i=50,j=0;
		try
		{
			int data=i/0;
			System.out.println(data);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("It can't execute");
		}
	}

}
