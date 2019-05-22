package ciq.read.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadCIQ {
	public void readCIQ()
	{
		 try {
	            FileInputStream file = new FileInputStream(new File("C:\\\\Users\\\\esatnir\\\\Videos\\\\file read\\\\Complete SP05WO311 STA 2.5 TDD  for BBU No_ 1 2018_07_06_11_32_35.xlsx"));
	 
	            
	            XSSFWorkbook workbook = new XSSFWorkbook(file);
	 
	        
	            XSSFSheet sheet = workbook.getSheetAt(0);
	 
	            DataFormatter df = new DataFormatter();
	            
	          /*
	            for(int i=1; i<2;i++)
	            {
	            	Row row=sheet.getRow(i);
	            	
	            		String str = df.formatCellValue(row.getCell(0));
	            		System.out.println(str);
	            	new ReadECSFBDUMP().readCIQ(str);
	            }*/
	        }
	        catch (Exception e) {
	            e.printStackTrace();
	        }

	}

}
