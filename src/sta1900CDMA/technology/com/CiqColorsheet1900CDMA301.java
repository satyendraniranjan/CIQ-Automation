package sta1900CDMA.technology.com;

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

public class CiqColorsheet1900CDMA301 {

	public void ciqColorsheet1(File file,String check , String fileName) {
		try {

			
          FileInputStream folder= new FileInputStream(file);
			 
		    
		   XSSFWorkbook  workbook = new XSSFWorkbook(folder);

		  
		    
		    XSSFSheet sheet = workbook.getSheetAt(0);
			//System.out.println("Yes");
			
			CellStyle style = workbook.createCellStyle();
			style.setFillForegroundColor(IndexedColors.RED.getIndex());
			style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
			Font font = workbook.createFont();
	          font.setColor(IndexedColors.BLACK.getIndex());
	          style.setFont(font);
	            
			 String s=Integer.toString(sheet.getLastRowNum());
	            int a=Integer.parseInt(s.trim());
	         
	            
/* Start Reading File................................................................*/	            
	            
			 for(int i=1;i<a+1;i++)
			 {
				 try {
				Row row= sheet.getRow(i);
				 
				
				if(check.equals("cascade"))
	               {
	            	   row.getCell(0).setCellStyle(style);
	               }
				

				if(check.equals("BTS_ID"))
	               {
	            	   row.getCell(1).setCellStyle(style);
	               }
				
				if(check.equals("market"))
	               {
	            	   row.getCell(2).setCellStyle(style);
	               }
				
				
				if(check.equals("third"))
	               {
	            	   row.getCell(3).setCellStyle(style);
	               }
				
				
				if(check.equals("four"))
				{
					row.getCell(4).setCellStyle(style);
					//row.getCell(45).setCellStyle(style);
				}
				
				if(check.equals("five"))
				{
					row.getCell(5).setCellStyle(style);
					//row.getCell(45).setCellStyle(style);
				}
				
				if(check.equals("six"))
				{
					row.getCell(6).setCellStyle(style);
					//row.getCell(45).setCellStyle(style);
				}
				
				if(check.equals("seven"))
				{
					row.getCell(7).setCellStyle(style);
					//row.getCell(45).setCellStyle(style);
				}
				
				if(check.equals("eight"))
				{
					row.getCell(8).setCellStyle(style);
				}
				
				if(check.equals("nine"))
				{
					//System.out.println("inside enodeB color");
					row.getCell(9).setCellStyle(style);
					//row.getCell(45).setCellStyle(style);
				}
				
				if(check.equals("ten"))
				{
					row.getCell(10).setCellStyle(style);
					//row.getCell(45).setCellStyle(style);
				}
				
				if(check.equals("PN_OFF"))
				{
					row.getCell(11).setCellStyle(style);
				}
				
				
				if(check.equals("OTA_SID"))
				{
					row.getCell(12).setCellStyle(style);
					//row.getCell(45).setCellStyle(style);
				}
				
				if(check.equals("OTA_NID"))
				{
					row.getCell(13).setCellStyle(style);
				}
				
				
				if(check.equals("fourteen"))
				{
					row.getCell(14).setCellStyle(style);
					//row.getCell(45).setCellStyle(style);
				}
				
				if(check.equals("azimuth"))
				{
					//System.out.println("inside azimuth");
					row.getCell(15).setCellStyle(style);
					//row.getCell(45).setCellStyle(style);
				}
				
				
				if(check.equals("antenna"))
				{
					row.getCell(16).setCellStyle(style);
					//row.getCell(45).setCellStyle(style);
				}
				
				
				if(check.equals("seventeen"))
				{
					row.getCell(17).setCellStyle(style);
					//row.getCell(45).setCellStyle(style);
				}
				
				
				if(check.equals("eighteen"))
				{
					row.getCell(18).setCellStyle(style);
					//row.getCell(45).setCellStyle(style);
				}
				
				
				if(check.equals("nineteen"))
				{
					row.getCell(19).setCellStyle(style);
					//row.getCell(45).setCellStyle(style);
				}
				
				if(check.equals("twenty"))
				{
					row.getCell(20).setCellStyle(style);
					//row.getCell(45).setCellStyle(style);
				}
				
				if(check.equals("twentyone"))
				{
					row.getCell(20).setCellStyle(style);
					//row.getCell(45).setCellStyle(style);
				}
				
				if(check.equals("twentytwo"))
				{
					//System.out.println("Hi");
					row.getCell(22).setCellStyle(style);
				}
               
				if(check.equals("twentythree"))
				{
					row.getCell(23).setCellStyle(style);
					//row.getCell(45).setCellStyle(style);
				}
				
				
				if(check.equals("twentyfour"))
                 {
	              row.getCell(24).setCellStyle(style);
                 }
				
				
				if(check.equals("twentyfive"))
				{
					System.out.println("inside twenty five");
					row.getCell(25).setCellStyle(style);
				}
				
				if(check.equals("twentysix"))
                {
	                  row.getCell(26).setCellStyle(style);
                }
				
				if(check.equals("twentyseven"))
				{
					row.getCell(27).setCellStyle(style);
					//row.getCell(45).setCellStyle(style);
				}
				
				if(check.equals("twentyeight"))
				{
					row.getCell(28).setCellStyle(style);
				}
				
				if(check.equals("twentynine"))
				{
					row.getCell(29).setCellStyle(style);
					//row.getCell(45).setCellStyle(style);
				}
				
				if(check.equals("thirty"))
				{
					row.getCell(30).setCellStyle(style);
				}
				if(check.equals("thirtyone"))
				{
					row.getCell(31).setCellStyle(style);
					//row.getCell(45).setCellStyle(style);
				}
				
				if(check.equals("thirtytwo"))
				{
					row.getCell(32).setCellStyle(style);
					//row.getCell(45).setCellStyle(style);
				}
				
				if(check.equals("thirtythree"))
				{
					row.getCell(33).setCellStyle(style);
					//row.getCell(45).setCellStyle(style);
				}

				if(check.equals("thirtyfour"))
				{
					row.getCell(34).setCellStyle(style);
				}
				
				if(check.equals("thirtyfive"))
				{
					row.getCell(35).setCellStyle(style);
					//row.getCell(45).setCellStyle(style);
				}
				
				if(check.equals("thirtysix"))
				{
					row.getCell(36).setCellStyle(style);
				}
				
				
				
				
			
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				if(check.equals("thirtyseven"))
				{
					row.getCell(37).setCellStyle(style);
					//row.getCell(45).setCellStyle(style);
				}
				
				if(check.equals("thirtyeight"))
				{
					row.getCell(38).setCellStyle(style);
					//row.getCell(45).setCellStyle(style);
				}
				
				
				if(check.equals("thirtynine"))
				{
					row.getCell(39).setCellStyle(style);
					
				}
				
				
				if(check.equals("forty"))
				{
					row.getCell(40).setCellStyle(style);
					
				}
				
				
				
				if(check.equals("fortyone"))
				{
					row.getCell(41).setCellStyle(style);
					
				}
				
				
				if(check.equals("fortytwo"))
				{
					//System.out.println("insdie of fortytwo");
					row.getCell(42).setCellStyle(style);
					
				}
				
				
				
				
				if(check.equals("fortythree"))
				{
					row.getCell(43).setCellStyle(style);
					
				}
				
				

				if(check.equals("fortyfour"))
				{
					
					row.getCell(44).setCellStyle(style);
					//row.getCell(47).setCellStyle(style);
				}
				
				
				
				if(check.equals("LTM_OFF"))
				{
					//System.out.println("insdie of ltm");
					row.getCell(45).setCellStyle(style);
					
				}
				
				
				if(check.equals("REG_Z"))
				{
					row.getCell(46).setCellStyle(style);
					
				}
				
				if(check.equals("channel"))
				{
					//System.out.println("fourtyseven");
					row.getCell(49).setCellStyle(style);
					row.getCell(73).setCellStyle(style);
					row.getCell(53).setCellStyle(style);
					
				}
			
				
				if(check.equals("fortyeight"))
				{
					row.getCell(48).setCellStyle(style);
					
				}
				
				
				if(check.equals("fortynine"))
				{
					row.getCell(49).setCellStyle(style);
					
				}
				
				
				if(check.equals("fifty"))
				{
					row.getCell(50).setCellStyle(style);
					
				}
				
				
				if(check.equals("fiftyone"))
				{
					row.getCell(51).setCellStyle(style);
					
				}
				
				
				if(check.equals("fiftytwo"))
				{
					row.getCell(52).setCellStyle(style);
					
				}
				
				
				if(check.equals("fiftythree"))
				{
					row.getCell(53).setCellStyle(style);
					
				}
				
				
				if(check.equals("fiftyfour"))
				{
					row.getCell(54).setCellStyle(style);
					
				}
				
				
				if(check.equals("fiftyfive"))
				{
					row.getCell(55).setCellStyle(style);
					
				}
				
				if(check.equals("fiftysix"))
				{
					row.getCell(56).setCellStyle(style);
					
				}
				
				if(check.equals("fiftyseven"))
				{
					row.getCell(57).setCellStyle(style);
					
				}
				
				if(check.equals("fiftyeight"))
				{
					row.getCell(58).setCellStyle(style);
					
				}
				if(check.equals("fiftynine"))
				{
					row.getCell(59).setCellStyle(style);
					
				}
				if(check.equals("sixty"))
				{
					row.getCell(60).setCellStyle(style);
					
				}
				if(check.equals("sixtyone"))
				{
					row.getCell(61).setCellStyle(style);
					
				}
				if(check.equals("sixtytwo"))
				{
					row.getCell(62).setCellStyle(style);
					
				}
				if(check.equals("sixtythree"))
				{
					row.getCell(63).setCellStyle(style);
					
				}
				if(check.equals("sixtyfour"))
				{
					row.getCell(64).setCellStyle(style);
					
				}
				if(check.equals("sixtyfive"))
				{
					row.getCell(65).setCellStyle(style);
					
				}
				if(check.equals("sixtysix"))
				{
					row.getCell(66).setCellStyle(style);
					
				}
				if(check.equals("sixtyseven"))
				{
					row.getCell(67).setCellStyle(style);
					
				}
				if(check.equals("sixtyeight"))
				{
					row.getCell(68).setCellStyle(style);
					
				}
				
				if(check.equals("sixtynine"))
				{
					row.getCell(69).setCellStyle(style);
					
				}
				
				if(check.equals("seventy"))
				{
					row.getCell(70).setCellStyle(style);
					
				}
				
				if(check.equals("seventyone"))
				{
					row.getCell(71).setCellStyle(style);
					
				}
				
				if(check.equals("seventytwo"))
				{
					row.getCell(72).setCellStyle(style);
					
				}
				
				if(check.equals("seventythree"))
				{
					row.getCell(73).setCellStyle(style);
					
				}
				
				if(check.equals("seventyfour"))
				{
					row.getCell(74).setCellStyle(style);
					
				}
				
				if(check.equals("seventyfive"))
				{
					row.getCell(75).setCellStyle(style);
					
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
