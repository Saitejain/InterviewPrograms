package learningforfun;

public class Reversedstrings {

	public static void main(String[] args) {
		String s = "saiteja";
		String r = "";
		for(int i=s.length()-1;i>=0;i--)
		{
			r=r+s.charAt(i);
		}
       System.out.println(r);
	}

}