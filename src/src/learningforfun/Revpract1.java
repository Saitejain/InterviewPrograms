package learningforfun;

public class Revpract1 {

	public static void main(String[] args) {
		String s = "saiteja i";
		String r = "";
		for(int i=s.length()-1;i>=0;i--)
		{
			r=r+s.charAt(i);
		}
     System.out.println("Reversed String is :"+r);
     
     StringBuffer sb = new StringBuffer(String.valueOf(s));
     sb.reverse();
    System.out.println("Reversed Stringbuffer:"+sb); 
    
    StringBuilder sbd= new StringBuilder();
    sbd.append(s);
    sbd.reverse();
    System.out.println("Reversed StringBuilder sbd is:"+ sbd);
	
	}

}
