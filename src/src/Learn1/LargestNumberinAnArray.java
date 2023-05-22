package Learn1;

public class LargestNumberinAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {2,5,9,1,6,4};
		int max = arr[0];
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>max) {
					max=arr[i];
				}
			}
		}
		System.out.println(max);

	}

}
