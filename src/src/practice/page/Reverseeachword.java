package practice.page;

public class Reverseeachword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Who is he";
		String[] words = s.split(" ");
		String Revstng = "";
		for (String w : words) {
			String rw = "";
			for (int i = w.length() - 1; i >= 0; i--) {
				rw = rw + w.charAt(i);
			}
			Revstng = Revstng + rw + " ";
		}
		System.out.println("Rev String is : "+ Revstng);

	}

}
