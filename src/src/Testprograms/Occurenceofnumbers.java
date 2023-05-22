package Testprograms;

public class Occurenceofnumbers {

	public static void main(String[] args) {
		int arr[] = new int [] {6,0,3,0,3,5};
		int num[]= new int[arr.length];
		int flag  = -1;
		
		for(int i=0;i<arr.length;i++)
		{
			int count =1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					num[j]= flag;
				}
			}
			if(num[i]!= flag)
               num[i]= count;
		}
		  System.out.println("Element | Frequency");
		   for(int i=0;i<num.length;i++)
		   {
			   if(num[i]!= flag)
				   System.out.println("  " +  arr[i]  + "     |  " + num[i]);
		   }
	
	}

}
