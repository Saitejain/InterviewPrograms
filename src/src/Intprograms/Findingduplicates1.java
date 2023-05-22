package Intprograms;

public class Findingduplicates1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            String arr[] = {"Java","Selenium","java","framework","Cucumber","Framework"};
            boolean flag = false;
            for(int i=0;i<arr.length;i++)
            {
            	for(int j=i+1;j<arr.length;j++)
            	{
            		if(arr[i].equalsIgnoreCase(arr[j]))
            		{
            			System.out.println("Found the Duplicate Elements:" +arr[i]);
            			flag =true;
            		}
            	}
            }
            if(flag==false)
            {
            	System.out.println("Duplicates not Found");
            }
	}

}
