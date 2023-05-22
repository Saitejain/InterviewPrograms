package Recollect;

public class Reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Good Afternoon @Summer";
		String r="";
		System.out.println("Before Reverse String is:"+ s);
		for(int i=s.length()-1;i>=0;i--)
		{
			r= r+s.charAt(i);
		}
		
		System.out.println("After Reversed String is :"+ r);
	}

}
