package Prgpract;

public class Chacount {

	public static void main(String[] args) {
		String s = "gfgbosdoisdhfhdsiofhoidf";
		int count = 0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='o')
			{
				count++;
			}
		}
         System.out.println("Occurence of 'o' in the string is:"+count);
	}

}
