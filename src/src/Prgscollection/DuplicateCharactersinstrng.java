package Prgscollection;

public class DuplicateCharactersinstrng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ithink it is a sa";
		int count =0;
	   char [] words = s.toCharArray();
	   System.out.println("Duplicates in the String are :");
	   for(int i=0;i<s.length();i++) {
		   count =1;
		   for(int j=i+1;j<s.length();j++) {
			   if(words[i]==words[j]&&words[i]!=' ') {
				   count++;
				   words[j]=0;
			   }
		   }
		   if(count>1 && words[i]!=0) {
			   System.out.println(words[i]);
		   }
	   }
	   

	}

}
