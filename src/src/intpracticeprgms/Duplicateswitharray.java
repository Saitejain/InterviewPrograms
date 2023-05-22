package intpracticeprgms;

public class Duplicateswitharray {

	public static void main(String[] args) {
		String s="Saiteja inabathina";
		char [] ch=s.toCharArray();
		System.out.println("Entered String is:" +s);
		System.out.println("Duplicates in the String are:");
		for(int i=0;i<ch.length;i++)
		{
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					System.out.println(ch[j]);
					break;
				}
			}
		}
		int [] arr= {1,2,3,2,5,5,4,4,4};
		for(int k=0;k<arr.length;k++)
		{
			for(int l=k+1;l<arr.length;k++)
			{
				if(arr[k]==arr[l])
				{
					System.out.println(arr[l]);
					break;
				}
			}
		}

	}

}
