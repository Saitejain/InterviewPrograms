package interviewques;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="Sai Teja";
		String[] sp = s.split(" ");
		String rs="";
		for(String w:sp)
		{
			String rw="";
			for(int i=w.length()-1;i>=0;i--)
			{
				rw=rw+w.charAt(i);
			}
			rs=rs+rw+" ";
		}
		System.out.println("Given String is :" + s);
		System.out.println("The Reversed String is :" +rs);

	}

}
