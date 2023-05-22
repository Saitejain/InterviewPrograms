package Methodsofstringclass;

public class Replace {

	public static void main(String[] args) {
	    String s1="match";
	    System.out.println(s1.replace('m','w'));
	    String s2="mammal";
	    System.out.println(s2.replace('m', 'd'));
	    String s3="Dettol";
	    System.out.println(s3.replace('t', 'r'));
	    String s4="Good morning 2 u ALL";
	    System.out.println(s4.replaceFirst(s4, s2));

	}

}
