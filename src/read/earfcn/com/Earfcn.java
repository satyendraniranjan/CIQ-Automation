package read.earfcn.com;

import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import awt.file.lincense.com.Ciqframe;
import ciq.read.com.ReadCIQOtherValues;
import ciq.read.com.ScheduleNameSiteCode;

public class Earfcn {

	private static final Logger LOGGER = Logger.getLogger(Ciqframe.class.getName());
	public void earfcn(String str, HashMap<String, String> hmValues, HashSet<String> antenna_name, File file1, Object cascade, String fileName, String sitecode)
	{
		try
		{
			LOGGER.setLevel(Level.ALL);
			FileInputStream file = new FileInputStream(new File("C:\\CIQ Audit\\Inventory\\EARFCN.xlsx"));
			 
		    
		    XSSFWorkbook workbook = new XSSFWorkbook(file);
           
		    String str1[]= str.split(",");
		   
		    HashMap<Integer, String> hm= new HashMap<>();
		    XSSFSheet sheet = workbook.getSheetAt(0);
		    DataFormatter df = new DataFormatter();
		    int a=str1.length-1;
		    
/* Start Getting Values From EARFCN........................................*/
		    
		    
		    
		    for(int i=2;i<sheet.getLastRowNum();i++)
		    {
		    	Row row= sheet.getRow(i);
		    	
		    try {
		    	
		    
		    	if(df.formatCellValue(row.getCell(0)).trim().equals(str1[a]))
		    	{
		    		
		    		
		    		hm.put(a, df.formatCellValue(row.getCell(1)));
		    		a--;
		    		i=2;
		    		
		    	}
		    }
		    catch(ArrayIndexOutOfBoundsException ex)
		    {
		    	continue;
		    }
		    }
		   System.out.println(hm);
		   LOGGER.log(Level.SEVERE, "2.5 TDD CDU20/ScheduleNameSiteCode/ReadDump4/Earfcn", hm);
		  // new ScheduleNameSiteCode().scheduleNameSiteCode(hm,hmValues,antenna_name,file1,cascade,fileName,band);
		  new ReadCIQOtherValues().readCIQValue(hm,hmValues,antenna_name,file1,cascade,fileName,sitecode);
		    
		    
		    
/* End Game.............................................................................*/		    
		    
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
