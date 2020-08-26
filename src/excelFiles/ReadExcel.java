package excelFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		XSSFWorkbook wb = new XSSFWorkbook();
		
		XSSFSheet s1 = wb.createSheet("Snacks");
		XSSFSheet s2 = wb.createSheet("Desserts");
		
		Row r1 = s1.createRow(0);
		Row r2 = s1.createRow(1);
		
		Cell cA = r2.createCell(0);
		cA.setCellValue("Samosa");
		
		// writing a file
		String path = "data\\myExcelData.xlsx"; // relative file path
		File f = new File(path);
		FileOutputStream fos = new FileOutputStream(f);// 
		
		wb.write(fos);
		fos.close();
		
	}

}
