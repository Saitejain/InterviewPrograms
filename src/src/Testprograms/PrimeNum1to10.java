package Testprograms;

public class PrimeNum1to10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=0,num=0;
		String primeNumbers = "";
		for( i=1;i<=10;i++) {
			int count =0;
			for(num=i;num>=1;num--) {
				if(i%num==0) {
					count = count +1;
				}
			}
			if(count == 2) {
				primeNumbers = primeNumbers+i+" ";
			}

		}
		System.out.print("Prime NUmbers from 1 to 10 are :");
		System.out.print(primeNumbers);
		
	}

}
