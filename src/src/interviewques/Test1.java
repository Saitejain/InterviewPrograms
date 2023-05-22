package interviewques;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "ProgrammingjavaProgramminghello";
		 String word ="Programming";
		 int count = 0;
		 int index = s.indexOf(word);
		 while(index!=-1)
		 {
			 count++;
			 index=s.indexOf(word,index+1);
		 }
	
		 System.out.println("The count of Programming " + count);
	

	}

}
