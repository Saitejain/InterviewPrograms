package Assignments;

public class Characterpresenceinbothstrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "Newyork";
		String s2 = "Nwyk";
		char[] ch = s1.toCharArray();
		char[] ch2 = s2.toCharArray();
		for (int i = 0; i < ch.length; i++) {

			for (int j = 0; j < ch2.length; j++) {

				if (ch[i] == ch2[j]) {
					System.out.println(ch[j]);
					break;

				}
			}
		}

	}

}
