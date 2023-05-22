package learningforfun;

public class Countofduplicatenumbersinarray {

	public static void main(String[] args) {
	 
		int arr []= {1,5,5,4,6,2,4,5,4,2,};
		int i=0,j;
		int dupcount=0;
		while(i<arr.length)
		{
			j=i+1;
			while(j<arr.length)
			{
				if(arr[i]==arr[j])
				{
					dupcount++;
					break;
				}
				j++;
			}
			i++;
					
		}
		System.out.println("\nThe Total Number of Duplicates  = "+dupcount);
	}

}
