package Prgpract;

public class Chacount2 {

	public static void main(String[] args) {
		String s = "rdsidofodofdofoo";
		int tcount = s.length();
		int rcount = s.replace("o","").length();
		int count = tcount - rcount;
		System.out.println("Occurence of char 'o' is: "+count);

	}

}
