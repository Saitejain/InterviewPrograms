package Prgpract;

public class Trycatch1 {

	public static void main(String[] args) {
		int i=10,j=0;
		try 
		{
			int data=i/j;
			System.out.println(data);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("It is an arithmetic exception can't be executed");
		}
	}

}
