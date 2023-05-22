package Intprograms;

public class Findingduplicates2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String str = "Saiitejjaa";
         int count;
         char ch[]=str.toCharArray();
         System.out.println("Duplicate Elements in a given String:");
         for(int i=0;i<ch.length;i++)
         {
        	 count=1;
        	 for(int j=i+1;j<ch.length;j++)
        	 {
        		 if(ch[i]==ch[j]&& ch[j]!=' ')
        		 {
        			 count++;
        			 ch[j]=0;
        		 }
        	 }
        	 if(count>1&&ch[i]!='0')
        	 {
        		System.out.println();
        	 }
         }
         
       
	}

}
