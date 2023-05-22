package Recollect;

class animal{
   void eat () {
	   System.out.println("eating");
   }
   
}
class dog extends animal{
	void bark () {
		System.out.println("barking");
	}
}
class zoo extends dog{
	void assemble() {
		System.out.println("Assembled");
	}
}

public class Testinheritance {

	public static void main (String[] Args) {
		zoo z = new zoo();
		z.eat();
		z.bark();
		z.assemble();
	}
	
}
