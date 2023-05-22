package learning;

public class Methods {
	static int dailycount = 10;
	public static void Company()
	{
		System.out.println("welcome to the company");
	}
	public void foodcourt()
	{
		int items = 80;
		System.out.println("No.of Items in food court: "+items);
	}
	public static void pendingwork(int tickets)
	{
		
		dailycount = dailycount - tickets;
		System.out.println(dailycount);
	}
	public int statusupdate()
	{
		return dailycount;

	}
	public void checkstatements()
	{
		System.out.printf("checking printf");
	}
	public static void main(String[] args) {
		Methods m = new Methods();
		
		Company();
		m.foodcourt();
		 pendingwork(5);
		 m.statusupdate();
		 m.checkstatements();
		 
		
	}
	
}
