package Prgscollection;

public class Duplicatesinarr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {2,5,2,3,4,5,3,4};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[j]);
				}
			}
		}

	}

}
