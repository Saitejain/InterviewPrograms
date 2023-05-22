package learning;

public class Differentvars {
	
	static  int lines = 20;
	static  int count = 30;
	String cond = "function";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Differentvars Differentvars = new Differentvars();
		System.out.println(lines);
		System.out.println(new Differentvars().cond);
		checkcnt(80);

	}
	public static void checkcnt(int height) {
		System.out.println(count);
		System.out.println(lines+count);
		height = 79;
		System.out.println(height);
		
	}
	
	

}
