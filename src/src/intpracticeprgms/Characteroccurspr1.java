package intpracticeprgms;

public class Characteroccurspr1 {

	public static void main(String[] args) {
		String s="beeteewpwjpespjpopop";
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='e' )
			{
				count++;
			}
		}
		System.out.println("Occurence of char 'e'=" +count);
		
		String s1="beeteewpwjpespjpopop";
		int Totalcount=s1.length();
		int Removecount=s1.replace("e","").length();
		int countt=Totalcount-Removecount;
		System.out.println("Count of char 'e'=" +countt);
	}

}
