package Intprograms;

public class Charactercount {

	public static void main(String[] args) {
		String st="Sita Rama Laxman Hanuman";
		int totalcount = st.length();
		int remove=st.replace("s","").length();
		int count = totalcount-remove;
		System.out.println("Count of character occurence:"+count);
		
		/*int a=10,b=0;
		try {
			System.out.println(a/b);
		}
		catch(Exception e)
		{
			System.out.println("Something went wrong");
		}*/
		String s1= "asskdsbbbkdaosoasvvvbbbbb";
		int tcount=s1.length();
		int rem=s1.replace("b","").length();
		int cnt=tcount-rem;
		System.out.println("b=" +cnt);
		
	}

}
