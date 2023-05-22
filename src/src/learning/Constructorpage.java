package learning;

public class Constructorpage {

	String name;
	int num;
	float exp;

	public Constructorpage() {
		name = "Sai teja";
		num = 24;
		exp = 4.10f;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Constructorpage cp = new Constructorpage();
		System.out.println(cp.name);
		System.out.println(cp.num);
		System.out.println(cp.exp);

	}

}
