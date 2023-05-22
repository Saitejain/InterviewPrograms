package intpracticeprgms;
import java.util.HashMap;
public class Eachcharcountinstringpr2 {

	public static void main(String[] args) {
		String s="saiteja inabathina";
		HashMap<Character,Integer> charcount=new HashMap<>();
	//	int len=s.length();
		for(int i=s.length()-1;i>=0;i--)
		{
			if(charcount.containsKey(s.charAt(i)))
			{
				int count=charcount.get(s.charAt(i));
				charcount.put(s.charAt(i),++count);
			}
			else
			{
				charcount.put(s.charAt(i), 1);
			}
		}
		System.out.println(charcount);
		String st="Good morning";
		HashMap<Character,Integer> count= new HashMap<>();
		for(int j=st.length()-1;j>=0;j--)
		{
			if(count.containsKey(st.charAt(j)))
			{
				int con=count.get(st.charAt(j));
				count.put(st.charAt(j), ++con);
			}
			else
			{
				count.put(st.charAt(j), 1);
			}
		}
		System.out.println(count);
	}

}
