package Prgpract;

public class Numarr1 {

	public static void main(String[] args) {
		int arr[]= {1,1,2,3,4,5,7,4,5,5,9,10,6,};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[j]);
					break;
				}
			}
		}
	}

}
