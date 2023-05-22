package Recollect;

public class Sumofarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {89,52,63,74,41};
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			sum = sum + arr[i];
		}
		System.out.println("The total sum of an array is:"+ sum);

	}

}
