package Prgpract;

public class Reversefirstandlast {

	public static void main(String[] args) {
		String s="My name is Saiteja";
		String c=" name is ";
		String s1=s.substring(0,2);
		String s2=s.substring(11,18);
		String r1="";
		String r2="";
		for(int i=s1.length()-1;i>=0;i--)
		{
			r1=r1+s1.charAt(i);
		}
		for(int j=s2.length()-1;j>=0;j--)
		{
			r2=r2+s2.charAt(j);
		}
		System.out.println(r1.concat(c).concat(r2));

	}

}
