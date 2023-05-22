package learningforfun;

public class Intttqs {
	
	 public static void getdata() {
  	   String s ="jhdshfkkf";
  	   String r="";
  	   for(int j=s.length()-1;j>=0;j--)
  	   {
  		   r= r+s.charAt(j);
  	   }
  	   System.out.println(r);
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int count = 10;
           int n1=0,n2=1,n3=0;
           for(int i=2;i<count;++i)
           {
        	   n3=n1+n2;
        	      System.out.println(n3);
           n1=n2;
           n2=n3;
           
           getdata();
           
     
           }
           
          
           
       
	}

}
