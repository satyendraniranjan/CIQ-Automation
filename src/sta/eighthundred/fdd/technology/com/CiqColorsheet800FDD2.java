package sta.eighthundred.fdd.technology.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CiqColorsheet800FDD2 {

	public void ciqColorsheet2(File file,String check, String fileName)
	{

		
		
		try {

			 FileInputStream folder= new FileInputStream(file);
		    XSSFWorkbook workbook = new XSSFWorkbook(folder);

		   
		    
		    XSSFSheet sheet = workbook.getSheet("ECSFB Info");
			
			
			CellStyle style = workbook.createCellStyle();
			  // style.setFillForegroundColor(IndexedColors.GREEN.getIndex());
			style.setFillForegroundColor(IndexedColors.RED.getIndex());
			style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
			//style.setFillForegroundColor(IndexedColors.RED.getIndex());
			//style.setFillBackgroundColor(new HSSFColor.RED().getIndex());
			//style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
			// System.out.println(sheet.getLastRowNum());
			
			Font font = workbook.createFont();
	        font.setColor(IndexedColors.BLACK.getIndex());
	        style.setFont(font);
			
			
			 String s=Integer.toString(sheet.getLastRowNum());
	            int a=Integer.parseInt(s.trim());
	           
	            
/* Start Reading File................................................................*/	            	            
	            
	            
			 for(int i=1;i<a+1;i++)
			 {
				 try
				 {
				Row row= sheet.getRow(i);
				 
				
				if(check.equals("eNB_id"))
					row.getCell(0).setCellStyle(style);
				
				
				if(check.equals("cell_Num"))
					row.getCell(1).setCellStyle(style);
				
				
				
				if(check.equals("OTA_SID"))
					row.getCell(2).setCellStyle(style);
				
				if(check.equals("OTA_NId"))
					row.getCell(3).setCellStyle(style);
				
				if(check.equals("REG_Z"))
					row.getCell(4).setCellStyle(style);
				
				if(check.equals("MCC_ID"))
				{
				
					row.getCell(5).setCellStyle(style);
				}
				
				if(check.equals("MNC_ID"))
					row.getCell(6).setCellStyle(style);
				
				if(check.equals("LTM_OFF"))
					row.getCell(7).setCellStyle(style);
				
				
				if(check.equals("BSC_SId"))
					row.getCell(9).setCellStyle(style);
				
				if(check.equals("BSC_NId"))
					row.getCell(10).setCellStyle(style);
				
				
				
				if(check.equals("BTS_Id"))
					row.getCell(11).setCellStyle(style);
				
							
				if(check.equals("BandClass"))
					row.getCell(12).setCellStyle(style);
				
				if(check.equals("FA_Id"))
					row.getCell(13).setCellStyle(style);
				
				

				if(check.equals("PN_OFF"))
					row.getCell(14).setCellStyle(style);
				
				 
				}
				 catch(NullPointerException ax)
		            {
		            	continue;
		            }
			 }
				
/* Start Writing File..............................................................................*/				 
			
			
			FileOutputStream out = new FileOutputStream(new File("C:\\CIQ Audit\\"+fileName));
			workbook.write(out);
			out.close();
			folder.close();
			//System.out.println("Excel Color Done on sheet 2");
			
			
	/* End Game..............................................................................*/		
			
		}   catch (Exception e) {
			e.printStackTrace();
		}
	}
}
