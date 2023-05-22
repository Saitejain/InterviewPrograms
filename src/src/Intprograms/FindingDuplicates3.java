package Intprograms;

public class FindingDuplicates3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           String str="SaiteejaaTTII";
           char[] ch =str.toCharArray();
           System.out.println("The String is:" +str);
           System.out.println("The Duplicate letters in the string are:");
           for(int i=0;i<ch.length;i++)
           {
        	   for(int j=i+1;j<ch.length;j++)
        	   {
        		   if(ch[i]==ch[j])
        		   {
        			   System.out.println(ch[j]+ " ");
        			   break;
        		   }
        	   }
           }
	}

}
