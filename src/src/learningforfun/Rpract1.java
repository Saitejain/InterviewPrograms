package learningforfun;

public class Rpract1 {

	public static void main(String[] args) {
		String s="Good Morning";
		int Tcount=s.length();
		int Rcount=s.replace("o", "").length();
		int count=Tcount-Rcount;
		System.out.println("Count of 'o' is :" + count);
		
		String s1= "dsfiaeehiehkdsjkbkkjdbvkj";
		int cnt = 0;
		int cnt2 =0;
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)=='j')
			{
				cnt++;
			}
			if(s1.charAt(i)=='k') {
				cnt2++;
			}
		}
           System.out.println(cnt);
           System.out.println("count of k is : "+cnt2);
           
	}

}
