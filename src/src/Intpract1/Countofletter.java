package Intpract1;

public class Countofletter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "backup base on basement backside building";
		int count =0;
	    for(int i=0;i<s.length();i++)
	    {
	    	if(s.charAt(i)=='b')
	    	{
	    		count++;
	    	}
	    			
	    }
	    System.out.println("Count of 'b' = "+ count);

	}

}
