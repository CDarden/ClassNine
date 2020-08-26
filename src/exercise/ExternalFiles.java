package exercise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ExternalFiles {

	public static void main(String[] args) throws IOException {
		// to create a folder in your project, right click on your project name, new, create folder
		
		// properties: filename.properties
		//Text: Filename.txt
		//java: filename.java
		//html: filename.html
		//xml: filename.xml
// how to create a properties file
		//right click on data, new, file
		
		int a = 10;
		System.out.println(a);
		
		String b = "Hello";
		System.out.println(b);
		
		String path = "data\\test.properties";
		//formula for properties
		Properties prop = new Properties();
		//FileInputStream objname = new FileInputStream("C:\\Users\\14435\\eclipse-workspace\\ClassNine\\data\\test.properties");
		FileInputStream objname = new FileInputStream(path);// file outside my project
			
		prop.load(objname);
		
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("grade"));
		System.out.println(prop.getProperty("course"));
	}

}
