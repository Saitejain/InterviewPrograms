package learningforfun;

public class Palindrome {

	public static void main(String[] args) {
		String s = "MadaM";
		String r ="";
		String org = "MADAM";
		for(int i=s.length()-1;i>=0;i--)
		{
			r=r+s.charAt(i);
		}
           if(org.equalsIgnoreCase(r)) 
           {
        	System.out.println("It is palindrome string");   
           }
           else
           {
        	   System.out.println("It is not Palindrome");
           }
	}

}
