package intpracticeprgms;

public class Sumofarray {

	public static void main(String[] args) {
		int a[] = {2,5,8,9,1};
		int sum=0;
		for(int i=0;i<=a.length-1;i++)
		{
			sum=sum+a[i];
		}
 System.out.println("Sum of Array:"+sum);
	}

}
