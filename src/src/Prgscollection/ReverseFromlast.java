package Prgscollection;

public class ReverseFromlast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "one two three four";
		String [] sp = s.split(" ");
		StringBuilder rev = new StringBuilder();
		for(int i=sp.length-1;i>=0;i--) {
			rev.append(sp[i]).append(" ");
			
		}
		String output = rev.toString().trim();
		System.out.println(output);

	}

}
