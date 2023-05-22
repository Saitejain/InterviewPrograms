package Learn1;

public class Reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Sai Teja I";
		String r = "";
		for(int i=s.length()-1;i>=0;i--) {
			r=r+s.charAt(i);
		}
		System.out.println(r);

	}

}
