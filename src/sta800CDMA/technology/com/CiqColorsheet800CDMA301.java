package sta800CDMA.technology.com;

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

public class CiqColorsheet800CDMA301 {

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
				
				if(check.equals("eleven"))
				{
					row.getCell(11).setCellStyle(style);
				}
				
				
				if(check.equals("twelve"))
				{
					row.getCell(12).setCellStyle(style);
					//row.getCell(45).setCellStyle(style);
				}
				
				if(check.equals("thirteen"))
				{
					row.getCell(13).setCellStyle(style);
				}
				
				
				if(check.equals("fourteen"))
				{
					row.getCell(14).setCellStyle(style);
					//row.getCell(45).setCellStyle(style);
				}
				
				if(check.equals("fifteen"))
				{
					row.getCell(15).setCellStyle(style);
					//row.getCell(45).setCellStyle(style);
				}
				
				
				if(check.equals("sixteen"))
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
				
				if(check.equals("PN_OFF"))
				{
					row.getCell(20).setCellStyle(style);
					//row.getCell(45).setCellStyle(style);
				}
				
				if(check.equals("twentyone"))
				{
					row.getCell(20).setCellStyle(style);
					//row.getCell(45).setCellStyle(style);
				}
				
				if(check.equals("OTA_NID"))
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
				
				
				if(check.equals("azimuth"))
				{
					//System.out.println("azimuth");
					row.getCell(25).setCellStyle(style);
				}
				
				if(check.equals("antenna_name"))
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
					row.getCell(45).setCellStyle(style);
					
				}
				
				
				if(check.equals("REG_Z"))
				{
					row.getCell(46).setCellStyle(style);
					
				}
				
				if(check.equals("channel"))
				{
					//System.out.println("fourtyseven");
					row.getCell(47).setCellStyle(style);
					//row.getCell(53).setCellStyle(style);
					//row.getCell(73).setCellStyle(style);
					
				}
			
				
				if(check.equals("CSR_S_B"))
				{
					row.getCell(48).setCellStyle(style);
					
				}
				
				
				if(check.equals("eNB_S_B"))
				{
					row.getCell(49).setCellStyle(style);
					
				}
				
				
				if(check.equals("IP_R1"))
				{
					row.getCell(50).setCellStyle(style);
					
				}
				
				
				if(check.equals("IP_R2"))
				{
					row.getCell(51).setCellStyle(style);
					
				}
				
				
				if(check.equals("IP_R3"))
				{
					row.getCell(52).setCellStyle(style);
					
				}
				
				
				if(check.equals("IP_R4"))
				{
					row.getCell(53).setCellStyle(style);
					
				}
				
				
				if(check.equals("IP_R5"))
				{
					row.getCell(54).setCellStyle(style);
					
				}
				
				
				if(check.equals("IP_R6"))
				{
					row.getCell(55).setCellStyle(style);
					
				}
				
				if(check.equals("IP_R7"))
				{
					row.getCell(56).setCellStyle(style);
					
				}
				
				if(check.equals("IP_R8"))
				{
					row.getCell(57).setCellStyle(style);
					
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
