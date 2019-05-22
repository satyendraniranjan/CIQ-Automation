package staCombine1900.fdd.technology.com;

import java.io.File;
import java.io.FileInputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import awt.file.lincense.com.Ciqframe;

public class CompareOtherValuesCombine1900FDD {

	private static final Logger LOGGER = Logger.getLogger(Ciqframe.class.getName());
	public void compareOtherValues(File file, String[] dump, String ciq, String fileName)
	{
		try {
			//System.out.println(ciq);
		String[] ciq1=ciq.split(" ");
		//System.out.println(ciq1.length+" "+dump.length);
		
		/*String latitude = null;
		String longitude = null;
		String diversity = null;
		String azimuth = null;*/
		//System.out.println(ciq1[0]);
		//System.out.println(dump[0]);
		
		//System.out.println(ciq1[0].trim()!=dump[0].trim());
	    for(int i=0;i<ciq1.length;i++)
	    {
	    	try
	    	{
	    	//System.out.print("\t"+ciq1[i]);
	    	//System.out.println();
	    	//System.out.print("\t"+dump[i]);
	    	if(i==0)
	    	{	
	    		double a=Double.parseDouble(ciq1[i]);
	    		double b=Double.parseDouble(dump[i]);
	    		BigDecimal aa = new BigDecimal(a);
	    		BigDecimal bb = new BigDecimal(b);
	    		aa = aa.setScale(2, BigDecimal.ROUND_DOWN);
	    		bb = bb.setScale(2, BigDecimal.ROUND_DOWN);
	    		//System.out.print( aa!=bb);
	    	if(aa.equals(bb))
	    	{
	    		
	    	}
	    	/*else
	    		new CiqColorsheet1900FDD1().ciqColorsheet1(file,"latitude",fileName);*/
	    	}
	    	
	    	if(i==1)
	    	{
	    		double a=Double.parseDouble(ciq1[i]);
	    		double b=Double.parseDouble(dump[i]);
	    		BigDecimal aa = new BigDecimal(a);
	    		BigDecimal bb = new BigDecimal(b);
	    		aa = aa.setScale(2, BigDecimal.ROUND_DOWN);
	    		bb = bb.setScale(2, BigDecimal.ROUND_DOWN);
	    	if(aa.equals(bb))
	    	{
	    		
	    	}
	    	/*else
	    		new CiqColorsheet1900FDD1().ciqColorsheet1(file,"longitude",fileName);*/
	    	}
	    	
	    	if(i==2)
	    	{
	    		//System.out.println(ciq1[i]+" "+dump[i]+" "+ciq1[i].equals(dump[i])+" "+ciq1[i].length());
		    	if(ciq1[i].equals(dump[i]))
		    	{
		    		
		    	}
		    	else
		    		new CiqColorsheet1Combine1900FDD().ciqColorsheet1(file,"diversity",fileName);
	    	}
	    	
	    	/*if(i==3)
	    	{
		    	if(ciq1[i].equals(dump[i]))
		    	{
		    		
		    	}
		    	else
		    		new CiqColorsheet800FDD1().ciqColorsheet1(file,"azimuth",fileName);
	    	}*/
	    	
	    }catch(java.lang.NullPointerException ax)
		{
	    	//System.out.println(ax);
	    	//new CiqColorsheet800FDD1().ciqColorsheet1(file,"latitude",fileName);
	    	//new CiqColorsheet800FDD1().ciqColorsheet1(file,"longitude",fileName);
	    	//new CiqColorsheet800FDD1().ciqColorsheet1(file,"diversity",fileName);
			continue;
		}
    	catch(java.lang.NumberFormatException ex)
    	{
    		System.out.println(ex);
    		new CiqColorsheet1Combine1900FDD().ciqColorsheet1(file,"latitude",fileName);
    		new CiqColorsheet1Combine1900FDD().ciqColorsheet1(file,"longitude",fileName);
	    	new CiqColorsheet1Combine1900FDD().ciqColorsheet1(file,"diversity",fileName);
    		continue;
    	}
    
	    }
	    
	    
	    
	    
/*.......................................START COMPARING ARFCN........................................*/	    
	    
	   
            
            
	    
	    
	    
	    
	    LOGGER.info(" 1900 FDD/ScheduleNameSiteCode1900FDD/ReadDump41900FDD/ReadCIQOtherValue1900FDD/CompareOtherValues1900FDD");
	    
	    
	    
	    
	    }
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
