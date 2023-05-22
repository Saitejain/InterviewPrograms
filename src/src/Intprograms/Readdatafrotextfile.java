package Intprograms;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Readdatafrotextfile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
    FileReader fr = new FileReader("C:\\Users\\saite\\Desktop\\java practice\\Test123.txt");
    BufferedReader br=new BufferedReader(fr);
    String str;
    while((str=br.readLine())!=null)
    {
    	System.out.println(str);
    }
	}

}
