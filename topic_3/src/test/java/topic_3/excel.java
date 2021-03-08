package topic_3;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class excel {
	FileInputStream fis;
	XSSFWorkbook wb;
	XSSFSheet sheet1;
	@BeforeTest
	public void before() throws Exception {
		File src= new File("C:\\Users\\adilakshmi.polu\\Desktop\\workspace\\topic_3\\excels\\excel.xlsx");
		//Create an object of FileInputStream class to read excel file
		 fis= new FileInputStream(src);		 
		 wb= new XSSFWorkbook(fis);
		 sheet1=wb.getSheetAt(0);
	}
	 @Test
	 public void f() throws Exception {
			 
        int rowcount= sheet1.getLastRowNum();
        //Create a loop over all the rows of excel file to read it
		 for (int i=0;i<=rowcount;i++) {
			 String data=sheet1.getRow(i).getCell(0).getStringCellValue();
			 System.out.println("testdata from excel is " + data);
			 String data2=sheet1.getRow(i).getCell(1).getStringCellValue();
		 System.out.println("testdata from excel is " + data2);
		
		 } 
		 }
		 
	 @AfterTest
	public void afterClass()  throws Exception {
		wb.close();
		fis.close();
	}
	

}
