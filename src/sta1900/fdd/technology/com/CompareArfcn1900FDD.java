package sta1900.fdd.technology.com;

import java.io.File;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import awt.file.lincense.com.Ciqframe;

public class CompareArfcn1900FDD {
	private static final Logger LOGGER = Logger.getLogger(Ciqframe.class.getName());
	public void compareArfcn800FDD(File file, String dumparfcn, String fileName)
	{
		try {
			
			
			XSSFWorkbook workbook = new XSSFWorkbook(file);
			 
	        
            XSSFSheet sheet = workbook.getSheet("ECSFB Info");
 
            DataFormatter df = new DataFormatter();
           
            HashSet<String> arfcn= new HashSet<>();
            String str1[]= dumparfcn.split(",");
            
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
	    
	   
     
	    
       int counter=0;
       String arfcn1=null;
     //  System.out.println(str1.length);
       for(int i=0;i<str1.length;i++)
       {
       for(String s:arfcn)
       {
    	    arfcn1 = s;
    	    if(str1[i].equals(arfcn1)) 
    	    {
    	    	counter++;
    	    }
       }
       }
       System.out.println("counter= "+counter);    
	   if(counter==0)
	    new CiqColorsheet1900FDD2().ciqColorsheet2(file,"FA_Id",fileName);
	    
	    LOGGER.log(Level.SEVERE, "1900 FDD/ScheduleNameSiteCode1900FDD/ReadDump41900FDD/ReadCIQOtherValue1900FDD/CompareArfcn1900FDD", "Arfcn= "+arfcn1+","+dumparfcn);	
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}catch(Exception e)
		{
			
		}
	}

}
