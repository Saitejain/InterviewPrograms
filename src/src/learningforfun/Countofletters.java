package learningforfun;

public class Countofletters {

	public static void main(String[] args) {
		String s ="fsffsfpsp";
		int count = 0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='f')
			{
				count++;
			}
		}
		System.out.println("Count of 'f':" + count);
	}

}
