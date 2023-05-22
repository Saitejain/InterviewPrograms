package Intprograms;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Writedataintotextfile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        FileWriter fw =new FileWriter("C:\\Users\\saite\\Desktop\\java practice\\Test123.txt");
        BufferedWriter bw=new BufferedWriter(fw);
        bw.write("Testing the java program ");
        bw.write("by creating testing file ");
        bw.write("in java program and writing the script ");
        bw.write("Initialization done....");
        
        System.out.println("Finished....");
		bw.close();
		
	}

}
