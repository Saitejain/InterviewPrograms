package Intprograms;

public class Pr2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          String s="Saiteja I";
          String rev="";
          for(int i=s.length()-1;i>=0;i--)
          {
        	  rev=rev+s.charAt(i);
          }
		System.out.println("Reversed string:" + rev);
		
		String s1="sadkjssa@#$$$%dfkjssjkbd&&^%%%%";
		s1=s1.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s1);
		
	}

}
