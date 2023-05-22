package learningforfun;

public class Check1 {

	public static void main(String [] args) {
		
		String s= "saitejajjdsk";
		String r = "";
		for(int i=s.length()-1;i>=0;i--)
		{
			r= r+s.charAt(i);
		}
		System.out.println(r);
		
		String s1="fewowwowwoho";
		int count =0;
		for(int j=0;j<s1.length();j++)
		{
			if(s1.charAt(j)=='w') {
				count++;
			}
		}
		System.out.println("Count of w:"+count);
		
		String s2= "saiteja";
		for(int k=0;k<s2.length();k++)
		{
			System.out.println(s2.charAt(k));
		}
		
		
	}
}
