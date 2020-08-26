package exercise;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class writeCSV {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		// to generate new files
				String path = "data\\MyNEWFile.csv"; // relative file path
				// create a file object
				File f = new File(path);
				
				// write the file
				FileWriter fw = new FileWriter(f);// 
				
				//BufferedWriter is to write charaters of the file
				BufferedWriter bfw = new BufferedWriter(fw);
				
				bfw.write("Name, Grade, Class");
				bfw.newLine();
				bfw.write("JamesBond, 700, Selemium");
				bfw.close();
		
	}
	

}
