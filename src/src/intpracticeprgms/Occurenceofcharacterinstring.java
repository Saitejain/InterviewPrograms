package intpracticeprgms;

public class Occurenceofcharacterinstring {

	public static void main(String[] args) {
		String s="saitejaassiiiaadglds";
	   int count = 0;
	   for(int i=0;i<s.length();i++)
	   {
		   if(s.charAt(i)=='s')
		   {
			   count++;
		   }
		   
	   }
	   System.out.println("s=" + count);
	}

}
