package Parameterization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcel {
	
	public static void main(String[] args) throws IOException {
		
		 File f = new File("C:\\Users\\19016\\Documents\\Selenium\\LoginTest.xlsx");
		 FileInputStream fi = new FileInputStream(f);
		 
		 Workbook wb = WorkbookFactory.create(fi);
		 
		 Sheet Sheet0 = wb.getSheetAt(0);
		 
		Row row0 = Sheet0.getRow(1);
		Cell user1= row0.getCell(0);
		Cell pwd1 = row0.getCell(1);
		Cell flag1 = row0.getCell(2);
		System.out.println(user1 +" " +pwd1+" "+flag1);
		Row row1 = Sheet0.getRow(2);
		Cell user2= row1.getCell(0);
		Cell pwd2 = row1.getCell(1);
		Cell flag2 = row0.getCell(3);
		Row row2 = Sheet0.getRow(3);
		Cell user3= row2.getCell(0);
		Cell pwd3 = row2.getCell(1);
		Cell flag3 = row0.getCell(3);
		System.out.println(user2 +" " +pwd2+" "+flag2);
		System.out.println(user3 +" " +pwd3+" "+flag3);
		fi.close();
		
	
		
	}
	
	

}
