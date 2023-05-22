package Learn1;

public class ReverseEachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Sai Teja i";
		String [] words = s.split(" ");
		String Revword = "";
		for(String w:words) {
			String r ="";
			for(int i=w.length()-1;i>=0;i--) {
				r=r+w.charAt(i);
			}
			Revword = Revword+r+" ";
		}
		System.out.println(Revword);

	}

}
