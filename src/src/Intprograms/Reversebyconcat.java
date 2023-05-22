package Intprograms;

public class Reversebyconcat {

	public static void main(String[] args) {
		String st = "Saiteja ABCD";
		String rev = "";
		for (int i = st.length() - 1; i >= 0; i--) {
			rev = rev + st.charAt(i);
		}
		System.out.println("Reversed String:" + rev);

		String s2 = "flsdlhdsklhlkdlsdlkhfhlkhkldlk";
		String rev1 = "";
		for (int j = s2.length() - 1; j >= 0; j--) {
			rev1 = rev1 + s2.charAt(j);
		}
		System.out.println(rev1);

		String str = "Saiteja Inabath";
		String reve = "";
		char a[] = str.toCharArray();
		int len = a.length;
		for(int k=len-1;k>=0;k--)
		{
			reve=reve+str.charAt(k);
		}
		System.out.println(reve);
		
		String s3="Rama Sita";
		StringBuffer sb = new StringBuffer(s3);
		System.out.println(sb.reverse());
		
		String s4="Laxman Hanuman";
		String rev3="";
		for(int m=s4.length()-1;m>=0;m--)
		{
			rev3=rev3+s4.charAt(m);
		}
           System.out.println("After reversing the word:"+rev3);
	}

}
