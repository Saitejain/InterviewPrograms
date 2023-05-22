package learningforfun;

public class Rpract5 {

	public static void main(String[] args) {
		String s="Saiteja I";
		String org=s;
		String r="";
		for(int i=s.length()-1;i>=0;i--)
		{
			r=r+s.charAt(i);
		}
		if(org.equalsIgnoreCase(r))
		{
			System.out.println("It is a palindrome");
		}
		else
		{
			System.out.println("It is not a palindrome");
		}
       System.out.println(r);
       StringBuilder sb=new StringBuilder();
       sb.append(s);
       sb.reverse();
       System.out.println(sb);
       StringBuffer sbf=new StringBuffer(String.valueOf(s));
       sbf.reverse();
       System.out.println(sbf);
       
       
	}

}
