package Assignments;

public class Changeuppertoloweroddeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "JavaHDDIoo09234FO@#455";
		int capitals = 0, small = 0, digits = 0, special = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (Character.isUpperCase(ch)) {
				capitals++;
			} else if (Character.isLowerCase(ch)) {
				small++;
			} else if (Character.isDigit(ch)) {
				digits++;
			} else {
				special++;
			}
		}
		System.out.println("Count of Uppercase letters " + capitals);
		System.out.println("Count of Lowercase letters " + small);
		System.out.println("Count of Digits " + digits);
		System.out.println("Count of Special letters " + special);

	}

}
