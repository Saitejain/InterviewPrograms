package Learn1;

public class OccurenceOfLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "attachment";
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 't') {
				count++;
			}
		}
		System.out.println("Count of 't' = " + count);
	}

}
