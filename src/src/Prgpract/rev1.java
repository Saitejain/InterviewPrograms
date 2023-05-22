package Prgpract;

public class rev1 {

	public static void main(String[] args) {
		String s = "Sai teja Good Morning";
		String r= "";
		for(int i=s.length()-1;i>=0;i--)
		{
			r=r+s.charAt(i);
		}
          System.out.println(r);
	}

}
