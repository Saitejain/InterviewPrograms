package Recollect;

public class Testparamconstr {
	
	int id;
	String name;
	
Testparamconstr(int i,String n){
	id=i;
	name=n;
	
	}
void display() {
	System.out.println(id+" "+name);
}

public static void main(String[] Args) {
	Testparamconstr t1 = new Testparamconstr(88,"tej");
	Testparamconstr t2 = new Testparamconstr(89,"roman");
	t1.display();
	t2.display();
}

	
}
	
