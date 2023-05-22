package Prgscollection;

public class TestDefCon {
	int num;
	String name;
	TestDefCon(){
		num = 100;
		name = "Sachin";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		 TestDefCon t1 = new TestDefCon();
		 TestDefCon t2 = new TestDefCon();
		 System.out.println(t1.num + t2.num);
		 System.out.println(t1.name);
	 	
	}

}
