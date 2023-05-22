package Assignments;

public class Occurenceofcharinstrng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hello world";
		int cnt = 0;
	    for(int i=0;i<s.length();i++)
	    {
	    	char ch =s.charAt(i);
	    	if(ch=='l')
	    	{
	    		cnt++;
	    	}	
	    }
	    System.out.println(cnt);
	}

}
