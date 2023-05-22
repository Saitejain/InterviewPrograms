package Firstphase;

public class CapitalLettersFirstForEachWord {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "i am working on java program";
		String sp [] = s.split(" ");
		String Req = "";
		for(String w:sp) {
			String first = w.substring(0,1);
			String last = w.substring(1);
			Req += first.toUpperCase()+last+" ";
		}
		System.out.println(Req);
         
	}
}
