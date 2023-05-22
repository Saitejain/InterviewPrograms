package Intprograms;

public class Findingduplicates4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String st = "saiittejaaa";
         char [] ch = st.toCharArray();
         System.out.println("Duplicates :");
         for(int i=0;i<ch.length;i++)
         {
        	 for(int j=i+1;j<ch.length;j++)
        	 {
        		 if(ch[i]==ch[j])
        		 {
        			
        			 System.out.println(ch[j]);
        			 break;
        		 }
        	 }
         }
		
		
	}

}
