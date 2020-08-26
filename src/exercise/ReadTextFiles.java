package exercise;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextFiles {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String path = "data\\TextFiles.txt"; // relative file path
		// create a file object
		File f = new File(path);
		
		// Read the file
		FileReader fr = new FileReader(f);
		
		//BufferedReader is to read charaters of the file
		BufferedReader bfr = new BufferedReader(fr);
		
		//System.out.println(bfr.readLine());
		
		
		System.out.println(bfr.readLine());
		
		// i want to keep reading line by line. and to do that, i need to know how many lines are there.
		String line =null;
		while((line=bfr.readLine()) !=null) {
			System.out.println(line);
			
		}
	}
	
	

}
