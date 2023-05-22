package Learn1;

import java.util.Arrays;

public class AnagramCheck {
	
	public static Boolean checkIfAnagram(String s1,String s2) {
		if(s1.length()!=s2.length()) {
			return false;
		}
		char [] s1chars = s1.toLowerCase().toCharArray();
		char [] s2chars = s2.toLowerCase().toCharArray();
		Arrays.sort(s1chars);
		Arrays.sort(s2chars);
		return Arrays.equals(s1chars,s2chars);
 	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "listen";
		String s2 = "silent";
		
		Boolean isAnagram = checkIfAnagram(s1,s2);
		System.out.println(isAnagram);

	}

}
