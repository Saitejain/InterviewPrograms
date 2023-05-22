package learningforfun;

public class Rpract3 {

	public static void main(String[] args) {
		String s="Sita Rama";
		String r="";
		for(int i=s.length()-1;i>=0;i--)
		{
			r=r+s.charAt(i);
		}
         System.out.println("Reversed String is :" +r);
         
         String s1="saiteja i";
          s1= s1.replace("a", "");
         System.out.println(s1);
	}

}
