package intpracticeprgms;

public class Revpr1 {

	public static void main(String[] args) {
		String s="Saiteja Inabathina";
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev =rev+s.charAt(i);
		}
          System.out.println("Reversed String:"+rev);
          String s1="Teja Sai";
          StringBuffer sb=new StringBuffer(String.valueOf(s1));
          sb.reverse();
          System.out.println("StringBuffer reversed:" +sb);
          String s2="ias ajet";
          StringBuilder sb1=new StringBuilder();
          sb1.append(s2);
          sb1.reverse();
          System.out.println("StringBuilder reversed:" +sb1);
          
	}

}
