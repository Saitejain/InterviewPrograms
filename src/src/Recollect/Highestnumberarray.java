package Recollect;

public class Highestnumberarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[]arr = {7,14,21,56,63,28,35,42,49,70,80};
		int max = arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
				max=arr[i];
		}
		System.out.println(max);
	}

}
