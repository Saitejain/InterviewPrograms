package learning;

public class Testobj1 {

	int i, j;

	public Testobj1() {
		// TODO Auto-generated constructor stub
		i = 40;
		j = 30;

	}

	public Testobj1(int i, int j) {
		this.i = i;
		this.j = j;
	}

	public int add() {
		return i + j;
	}

	public int sub() {
		return i - j;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Testobj1 t1 = new Testobj1();
		Testobj1 t2 = new Testobj1(90, 45);
		System.out.println(t1.add());
		System.out.println(t2.add());
		System.out.println(t2.sub());

	}

}
