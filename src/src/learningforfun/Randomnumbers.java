package learningforfun;
import java.lang.Math;
import java.util.Random;
public class Randomnumbers {

	public static void main(String[] args) {
		int max = 500;
		int min = 100;
		int b=(int)(Math.random()*(max-min+1)+min);
		System.out.println(b);

	}

}
