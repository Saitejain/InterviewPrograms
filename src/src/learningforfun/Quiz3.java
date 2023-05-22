package learningforfun;

public class Quiz3 {

	public static void main(String[] args) {
		int[]a= {0,2,4,1,3};
		for(int i=0;i<a.length;i++)
		{
			a[i]=a[(a[i]+3)%a.length];
		}
		System.out.println(a[1]);
		String s="dsnfksdfo333535ouefhinflAAGHKKD";
	     s=s.replaceAll("[^a-zA-Z]", "");
	     System.out.println(s);
	     String st="4584";
	     int i=Integer.parseInt(st);
	     System.out.println(i);

	}

}
