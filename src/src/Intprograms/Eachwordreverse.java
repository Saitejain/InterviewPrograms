package Intprograms;

public class Eachwordreverse {

	public static void main(String[] args) {
		String st="Sita Rama Laxaman Hanuman";
		String[] words=st.split(" ");
		String reverseString="";
		for(String w:words)
		{
			String reverseWord = "";
			for(int i=w.length()-1;i>=0;i--)
			{
				reverseWord=reverseWord+w.charAt(i);
			}
			reverseString=reverseString+reverseWord+" ";
		}

          System.out.println(reverseString);
          
          String s1="Radha Krishna";
          String[] sep=s1.split(" ");
          String reveString="";
          for(String rk:sep )
          {
        	  String reveword="";
        	  for(int j=rk.length()-1;j>=0;j--)
        	  {
        		  reveword=reveword+rk.charAt(j);
        	  }
        	  reveString=reveString+reveword+" ";
          }
          System.out.println(reveString);

	}

}
