package learningforfun;

public class Rpract2 {

	public static void main(String[] args) {
		String s="Good Morning";
		int count =0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='o') {
				count++;
				
			}
		}
		System.out.println("Count of 'o' is :" +count);
	}

}
