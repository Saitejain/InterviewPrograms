package Assignments;

public class Reversestrng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "java is super";
		String r= "";
		for(int i=s.length()-1;i>=0;i--)
		{
			r=r+s.charAt(i);
		}
		System.out.println("Reversed String is " + r);

	}

}
