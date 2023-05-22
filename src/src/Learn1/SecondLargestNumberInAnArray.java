package Learn1;

public class SecondLargestNumberInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp,size;
		int [] arr = {2,3,5,6,4,8};
		size = arr.length;
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(arr[size-2]);

	}

}
