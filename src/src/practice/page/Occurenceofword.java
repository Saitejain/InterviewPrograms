package practice.page;

public class Occurenceofword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "helloworldhelloworldhello";
		String word = "hello";
		int cnt = 0;
		int index=s.indexOf(word);
		while(index!=-1) {
			cnt++;
			index=s.indexOf(word,index+1);
		}
		System.out.println("Count of hello is : "+ cnt);

	}

}
