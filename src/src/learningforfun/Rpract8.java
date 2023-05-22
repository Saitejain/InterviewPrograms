package learningforfun;

public class Rpract8 {

	public static void main(String[] args) {
		String s="eiuiewgiudbvjxnvieieieiabxhjvsdhbfc";
		int Tcount=s.length();
		int Rcount=s.replace("e", "").length();
		int count = Tcount-Rcount;
		System.out.println(count);
		
		String s1="aqwoejrpoweirouqwpuqpouepqwouepoqwueopqw";
		int cnt=0;
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)=='p')
			{
				cnt++;
			}
		}
		System.out.println(cnt);
		
	}

}
