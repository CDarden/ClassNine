package exercise;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class WriteTextFile {

	public static void main(String[] args) throws IOException {
		
		// to generate new files
		String path = "data\\WriteABC.txt"; // relative file path
		// create a file object
		File f = new File(path);
		
		// write the file
		FileWriter fw = new FileWriter(f, true);// to not overwrite a file put commar true
		
		//BufferedWriter is to write charaters of the file
		BufferedWriter bfw = new BufferedWriter(fw);
		
		bfw.write("Hello World");
		bfw.newLine();
		bfw.write("Welcome to Orlando");
		bfw.newLine();
		bfw.write("where life never ends");
		// after you are done writing, you have to close the buffered writer before running it.
		bfw.close();
		
		
	}

}
