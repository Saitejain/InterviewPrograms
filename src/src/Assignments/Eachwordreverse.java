package Assignments;

public class Eachwordreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "java is easy";
		String[] words = s.split(" ");
		String revstrng = "";
		for(String w: words)
		{
			String revwords="";
			for(int i=w.length()-1;i>=0;i--)
			{
				revwords=revwords+w.charAt(i);
			}
			revstrng = revstrng+revwords+" ";
		}
		System.out.println("Rev string is :" + revstrng);
		

	}

}
