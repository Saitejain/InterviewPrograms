package Intprograms;

public class Eachwordreverseinstring {

	public static void main(String[] args) {
		String st="Welcome to JAVA";
		String[] words=st.split("\\s");
		String reverseString="";
		for(String w:words)
		{
			StringBuilder sb=new StringBuilder(w);
			sb.reverse();
			reverseString=reverseString+sb.toString()+" ";
		}
           System.out.println(reverseString);
	}

}
