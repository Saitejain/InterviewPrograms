package Recollect;

public class Largestnumberinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {48,56,12,23,91,88,98};
		int max = arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
				max=arr[i];
		}
          System.out.println("The largest number in an array is :" + max);
	}

}
