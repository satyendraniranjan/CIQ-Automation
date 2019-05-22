package sta1900.fdd.technology.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.hssf.util.HSSFColor.GREEN;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CiqColorsheet1900FDD1 {

	public void ciqColorsheet1(File file,String check , String fileName) {
		try {

			
          FileInputStream folder= new FileInputStream(file);
			 
		    
		   XSSFWorkbook  workbook = new XSSFWorkbook(folder);

		  
		    
		    XSSFSheet sheet = workbook.getSheet("1900");
			//System.out.println("Yes");
			
			CellStyle style = workbook.createCellStyle();
			style.setFillForegroundColor(IndexedColors.RED.getIndex());
			style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
			Font font = workbook.createFont();
	        font.setColor(IndexedColors.BLACK.getIndex());
	        style.setFont(font);
	            
			 String s=Integer.toString(sheet.getLastRowNum());
	            int a=Integer.parseInt(s.trim());
	         
	            //System.out.println("Hi"+a+s);
/* Start Reading File................................................................*/	            
	            
			 for(int i=1;i<sheet.getLastRowNum()+1;i++)
			 {
				 try {
					 
					// System.out.println("No");
				Row row= sheet.getRow(i);
				 

				if(check.equals("cascade"))
	               {
	            	   row.getCell(0).setCellStyle(style);
	               }
				
				
				if(check.equals("market"))
	               {
	            	   row.getCell(1).setCellStyle(style);
	               }
				
				if(check.equals("market_id"))
	               {
	            	   row.getCell(2).setCellStyle(style);
	               }
				
				
				if(check.equals("LSR"))
				{
					row.getCell(3).setCellStyle(style);
					//row.getCell(45).setCellStyle(style);
				}
				
				if(check.equals("LSM"))
				{
					row.getCell(4).setCellStyle(style);
					//row.getCell(45).setCellStyle(style);
				}
				
				if(check.equals("LSM_IP"))
				{
					row.getCell(5).setCellStyle(style);
					//row.getCell(45).setCellStyle(style);
				}
				
				if(check.equals("eNB_id"))
				{
					row.getCell(6).setCellStyle(style);
				}
				
				
				if(check.equals("sitecode"))
				{
					//System.out.println("inside enodeB color");
					row.getCell(7).setCellStyle(style);
					//row.getCell(45).setCellStyle(style);
				}
				
				
				if(check.equals("EnodeB"))
				{
					//System.out.println("inside enodeB color");
					row.getCell(8).setCellStyle(style);
					//row.getCell(45).setCellStyle(style);
				}
				
				if(check.equals("Cabinet"))
				{
					row.getCell(9).setCellStyle(style);
					//row.getCell(45).setCellStyle(style);
				}
				
				
				if(check.equals("cellId"))
				{
					row.getCell(11).setCellStyle(style);
					//row.getCell(45).setCellStyle(style);
				}
				
				
				if(check.equals("latitude"))
				{
					//System.out.println("long");
					row.getCell(12).setCellStyle(style);
				}
				
				
				if(check.equals("Latitude_Ns"))
				{
					row.getCell(13).setCellStyle(style);
					//row.getCell(45).setCellStyle(style);
				}
				
				if(check.equals("longitude"))
				{
					//System.out.println("long");
					row.getCell(14).setCellStyle(style);
				}
				
				
				if(check.equals("Latitude_Ws"))
				{
					row.getCell(15).setCellStyle(style);
					//row.getCell(45).setCellStyle(style);
				}
				
				if(check.equals("Trackcode"))
				{
					row.getCell(16).setCellStyle(style);
					//row.getCell(45).setCellStyle(style);
				}
				
				
				if(check.equals("Tac_Hex"))
				{
					row.getCell(17).setCellStyle(style);
					//row.getCell(45).setCellStyle(style);
				}
				
				
				/*if(check.equals("RRH"))
				{
					row.getCell(17).setCellStyle(style);
					//row.getCell(45).setCellStyle(style);
				}
				*/
				
				if(check.equals("phycell"))
				{
					row.getCell(19).setCellStyle(style);
					//row.getCell(45).setCellStyle(style);
				}
				
				
				if(check.equals("sss"))
				{
					row.getCell(20).setCellStyle(style);
					//row.getCell(45).setCellStyle(style);
				}
				
				if(check.equals("pss"))
				{
					row.getCell(21).setCellStyle(style);
					//row.getCell(45).setCellStyle(style);
				}
				
				if(check.equals("rsi"))
				{
					row.getCell(22).setCellStyle(style);
					//row.getCell(45).setCellStyle(style);
				}
				
				
				if(check.equals("plmn"))
				{
					row.getCell(23).setCellStyle(style);
				}
               
				if(check.equals("band"))
				{
					row.getCell(24).setCellStyle(style);
					//row.getCell(45).setCellStyle(style);
				}
				
				
				if(check.equals("bandwidth"))
                 {
	              row.getCell(25).setCellStyle(style);
                 }
				
				
				if(check.equals("channel"))
				{
					//System.out.println("channel");
					row.getCell(26).setCellStyle(style);
				}
				
				if(check.equals("UEarfcn"))
                {
	                  row.getCell(27).setCellStyle(style);
                }
				
				if(check.equals("rru"))
				{
					row.getCell(28).setCellStyle(style);
					//row.getCell(45).setCellStyle(style);
				}
				
				if(check.equals("Career"))
				{
					row.getCell(29).setCellStyle(style);
				}
				
				
				if(check.equals("mcc"))
				{
					row.getCell(30).setCellStyle(style);
				}
				
				
				if(check.equals("mnc"))
				{
					row.getCell(31).setCellStyle(style);
				}
				
				
				
				if(check.equals("ecgi"))
				{
					row.getCell(32).setCellStyle(style);
					//row.getCell(45).setCellStyle(style);
				}
				
				
				if(check.equals("diversity"))
				{
					//System.out.println("diversity");
					row.getCell(33).setCellStyle(style);
				}
				
				
				
				
				
			 }catch(java.lang.NullPointerException ax)
				 {
				 continue;
				 }
				 
			 }
	
			 
			 
/* Start Writing File..............................................................................*/			
			
				 
			 
			FileOutputStream out = new FileOutputStream(new File("C:\\CIQ Audit\\"+fileName));
			workbook.write(out);
			out.close();
			folder.close();
			//System.out.println("Excel Color Done");
			
/* End Game..............................................................................*/			
			
		}   catch (Exception e) {
			e.printStackTrace();
		}

	}
}
