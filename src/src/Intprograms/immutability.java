package Intprograms;

public class immutability {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Dulqar";
		s.concat("Salman");
		System.out.println(s);
		StringBuilder sb= new StringBuilder(s);
		sb.append(" Salman");
		System.out.println(sb);
	}

}
