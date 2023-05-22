package Intprograms;

public class Countofwords {

	public static void main(String[] args) {
		String st = "Welcome to JAVA program";
		int count = 1;
		for(int i=0;i<st.length();i++)
		{
			if(st.charAt(i)==' ' && st.charAt(i+1)!=' ')
			{
				count++;
			}
		}
        System.out.println("No of words in the String:" +count);
	}

}
