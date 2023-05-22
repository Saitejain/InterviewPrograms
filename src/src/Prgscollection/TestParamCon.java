package Prgscollection;

public class TestParamCon {
	int num;
	int age;

	TestParamCon(int i,int j) {
		num = i;
		age = j;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestParamCon t1 = new TestParamCon(10,20);
		TestParamCon t2 = new TestParamCon(20,30);
		System.out.println(t1.num + t1.age);
	}

}
