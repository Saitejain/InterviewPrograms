package Prgscollection;

public class PrametrizedConstructorExample {

	int id;
	String name;

	PrametrizedConstructorExample(int i, String n) {
		id = i;
		name = n;
	}

	void display() {
		System.out.println(id + " " + name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PrametrizedConstructorExample ps1 = new PrametrizedConstructorExample(25, "tej");
		PrametrizedConstructorExample ps2 = new PrametrizedConstructorExample(36, "wwf");
		ps1.display();
		ps2.display();

	}

}
