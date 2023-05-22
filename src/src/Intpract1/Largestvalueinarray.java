package Intpract1;

public class Largestvalueinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {25,36,12,15,43,4};
		int val = arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>val)
				val=arr[i];
		}
				
		System.out.println(val);

	}

}
