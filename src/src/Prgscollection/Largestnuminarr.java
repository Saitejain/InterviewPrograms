package Prgscollection;

public class Largestnuminarr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {25,30,12,14,21,29};
		int  max =arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println(max);
		

	}

}
