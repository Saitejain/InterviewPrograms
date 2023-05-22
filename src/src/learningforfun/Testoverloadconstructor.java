package learningforfun;

public class Testoverloadconstructor {
	
	String name;
	int id;
	int salary;
	
	Testoverloadconstructor(String n,int sal)
	{
		name=n;
		salary=sal;
	}
	
	Testoverloadconstructor(int i,String n,int sal)
	{
		id=i;
		name=n;
		salary=sal;
	}
	
	void display()
	{
		System.out.println(id+" "+name+"  "+salary);
	}
	
	public static void main(String[] args)
	{
		Testoverloadconstructor t1 = new Testoverloadconstructor("Sai",80000);
		Testoverloadconstructor t2 = new Testoverloadconstructor(56,"Teja",85000);
		t1.display();
		t2.display();
	}
	

}
