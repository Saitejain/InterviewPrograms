package learningforfun;

public class Firstlastreverse {

	public static void main(String[] args) {
		String s="my name is sai";
		String s3=" name is ";
		String s1=s.substring(0, 2);
		String s2=s.substring(11);
		String r1="";
		String r2="";
		//System.out.println(s.substring(0, 2));
		//System.out.println(s.substring(11));
		for(int i=s1.length()-1;i>=0;i--)
			r1=r1+s1.charAt(i);
		for(int j=s2.length()-1;j>=0;j--)
		{
			r2=r2+s2.charAt(j);
		}
			
		System.out.println(s);
		System.out.println(r1.concat(s3).concat(r2));

	}

}
