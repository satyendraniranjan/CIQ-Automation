package sta.eighthundred.fdd.technology.com;

import java.io.File;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import awt.file.lincense.com.Ciqframe;

public class CompareArfcn800FDD {
	private static final Logger LOGGER = Logger.getLogger(Ciqframe.class.getName());
	public void compareArfcn800FDD(File file, String dumparfcn, String fileName)
	{
		try {
			
			
			XSSFWorkbook workbook = new XSSFWorkbook(file);
			 
	        
            XSSFSheet sheet = workbook.getSheet("ECSFB Info");
 
            DataFormatter df = new DataFormatter();
           
            HashSet<String> arfcn= new HashSet<>();
            
            for(int i=1; i<sheet.getLastRowNum()+1;i++)
            {
            	try {
            	
            	Row row=sheet.getRow(i);
            	
            	
               arfcn.add(df.formatCellValue(row.getCell(13)));            
           
               }catch(ArrayIndexOutOfBoundsException ax)
            	{
                	 continue;
            	}
            	catch(java.lang.NullPointerException ax)
	            {
	            	continue;
	            }
            	catch(java.lang.NumberFormatException ex)
            	{
            		continue;
            	}
            	 
            	}
	    
	   
     
	    
       
       String arfcn1=null;
       for(String s:arfcn)
    	    arfcn1 = s;
       
       System.out.println(" ="+arfcn1+" ="+dumparfcn);    
	    if(!dumparfcn.equals(arfcn1))
	    new CiqColorsheet800FDD2().ciqColorsheet2(file,"FA_Id",fileName);
	    
	    LOGGER.log(Level.SEVERE, "800 FDD/ScheduleNameSiteCode800FDD/ReadDump4800FDD/Earfcn800FDD/ReadCIQOtherValue800FDD/CompareArfcn800FDD", "Arfcn= "+arfcn1+","+dumparfcn);	
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}catch(Exception e)
		{
			
		}
	}

}
