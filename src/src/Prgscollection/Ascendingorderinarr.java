package Prgscollection;

public class Ascendingorderinarr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {8,5,1,4,6,9,2};
		int temp = 0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Elements in ascending order");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}

	}

}
