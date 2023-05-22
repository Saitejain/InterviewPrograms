package learningforfun;

public class Maximumnumber {

	public static void main(String[] args) {
       int [] arr = new int []{45,25,89,99,};
       int max= arr[0];
       for(int i=0;i<arr.length;i++)
       {
    	   if(arr[i]>max)
    		   max=arr[i];
       }
       System.out.println(max);
       
	}

}
