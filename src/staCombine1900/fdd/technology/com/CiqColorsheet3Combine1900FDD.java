package staCombine1900.fdd.technology.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import awt.file.lincense.com.Ciqframe;

public class CiqColorsheet3Combine1900FDD {
	
	private static final Logger LOGGER = Logger.getLogger(Ciqframe.class.getName());
	public void ciqColorsheet1(File file, String check, String fileName)
	{
		try {
			
			    FileInputStream folder= new FileInputStream(file);
			    XSSFWorkbook workbook = new XSSFWorkbook(folder);

			   
			    
			    XSSFSheet sheet = workbook.getSheet("IPBH");
				
			    DataFormatter df = new DataFormatter();
				CellStyle style = workbook.createCellStyle();
				style.setFillForegroundColor(IndexedColors.RED.getIndex());
				style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
				
				Font font = workbook.createFont();
		        font.setColor(IndexedColors.RED.getIndex());
		        style.setFont(font);
				
				 String s=Integer.toString(sheet.getLastRowNum());
		            int a=Integer.parseInt(s.trim());
		            
		            for(int i=1;i<2;i++)
					 {
						 try
						 {
							// System.out.println("Inside");
						Row row= sheet.getRow(i);
						   // row=sheet.getHeader()
						
						if(check.equals("zero"))
							row.getCell(0).setCellStyle(style);
						
						
						if(check.equals("one"))
							row.getCell(1).setCellStyle(style);
						
						
						
						if(check.equals("two"))
							row.getCell(2).setCellStyle(style);
						
						if(check.equals("three"))
							row.getCell(3).setCellStyle(style);
						
						if(check.equals("four"))
						{
							System.out.println("Inside four");
							row.getCell(4).setCellStyle(style);
						}
							
						if(check.equals("five"))
							row.getCell(5).setCellStyle(style);
						
						if(check.equals("six"))
							row.getCell(6).setCellStyle(style);
						
						if(check.equals("seven"))
							row.getCell(7).setCellStyle(style);
						
						
						if(check.equals("eight"))
							row.getCell(8).setCellStyle(style);
						
						if(check.equals("nine"))
							row.getCell(9).setCellStyle(style);
						
						
						
						if(check.equals("ten"))
							row.getCell(10).setCellStyle(style);
						
									
						if(check.equals("eleven"))
							row.getCell(11).setCellStyle(style);
						
						if(check.equals("twelve"))
							row.getCell(12).setCellStyle(style);
						
						

						if(check.equals("thirteen"))
							row.getCell(13).setCellStyle(style);
						
						
						if(check.equals("forteen"))
						{
							row.getCell(14).setCellStyle(style);
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
						
						if(check.equals("twenty"))
						{
							row.getCell(20).setCellStyle(style);
							//row.getCell(45).setCellStyle(style);
						}
						
						if(check.equals("twentyone"))
						{
							row.getCell(21).setCellStyle(style);
							//row.getCell(45).setCellStyle(style);
						}
						
						
						if(check.equals("twentytwo"))
						{
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
						
						
						}
						 catch(NullPointerException ax)
				            {
				            	continue;
				            }
					 }
						
		            
		            
/* Start Writing File.............................................................................*/
		            
		            FileOutputStream out = new FileOutputStream(new File("C:\\CIQ Audit\\"+fileName));
					workbook.write(out);
					out.close();
					folder.close();
			
		            //LOGGER.log(Level.SEVERE, "800 FDD/CIQFixValueAudit800/Ipbh/CiqColorsheet800FDD3");
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
