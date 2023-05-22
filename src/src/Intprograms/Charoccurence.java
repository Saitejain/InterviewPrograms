package Intprograms;

public class Charoccurence {

	public static void main(String[] args) {
	       String b="bawabbgawbb";
	       int count =0;
	       for(int i=0;i<b.length();i++)
	       {
	          
	           if(b.charAt(i)=='b' )
	           {
	               count ++;
	           }
	       }
	        System.out.println("b=" + count);
	    
	}

}
