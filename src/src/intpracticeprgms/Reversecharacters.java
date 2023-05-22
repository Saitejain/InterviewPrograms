package intpracticeprgms;

public class Reversecharacters {

	public static void main(String[] args) {
		String s="Sita Rama";
		String rev="";
		String s1="Lord Hanuman";
		String reve="";
		String s2="Good Morning";
		String revs="";
		for(int k=s2.length()-1;k>=0;k--)
		{
			revs=revs+s2.charAt(k);
		}
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		for(int j=s1.length()-1;j>=0;j--)
		{
			reve=reve+s1.charAt(j);
		}
		
        System.out.println(rev);
        System.out.println(reve);
        System.out.println(revs);
	}

}
