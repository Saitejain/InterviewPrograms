package Learn1;

public class DuplicatesCharactersInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Hello World";
		int count =0;
		char [] s1 =s.toCharArray();
		System.out.println("Duplicates in the String are :");
		for(int i=0;i<s.length();i++) {
			count =1;
			for(int j=i+1;j<s.length();j++) {
				if(s1[i]==s1[j]&&s1[i]!=' ') {
					count++;
					s1[j]=0;
				}
			}
			if(count>1 && s1[i]!=0) {
				System.out.println(s1[i]);
			}
			
		}
		
				

	}

}
