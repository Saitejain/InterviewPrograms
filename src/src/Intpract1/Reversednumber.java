package Intpract1;

public class Reversednumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        long num= 9676655728L;
        long rev = 0L;
        while(num!=0)
        {
        	long rem = num%10;
        	rev = rev*10+rem;
        	num=num/10;
        }
        System.out.println("Reversed number = "+ rev);
	}

}
