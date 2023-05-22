package interviewques;

public class Sumoftwovaluescount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {10,20,30,15,25};
		int max = 40;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==max) {
					System.out.println("{"+arr[i]+" , "+arr[j]+"}");
				}
			}
		}

	}

}
