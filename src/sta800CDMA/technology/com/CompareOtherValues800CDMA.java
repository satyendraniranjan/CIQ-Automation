package sta800CDMA.technology.com;

import java.io.File;

import java.math.BigDecimal;
import java.util.logging.Logger;

import awt.file.lincense.com.Ciqframe;

public class CompareOtherValues800CDMA {

	private static final Logger LOGGER = Logger.getLogger(Ciqframe.class.getName());
	public void compareOtherValues(File file, String[] dump, String ciq, String fileName)
	{
		try {
			
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
	    	
	    		//new CiqColorsheet800CDMA301().ciqColorsheet1(file,"latitude",fileName);
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
	    	
	    		//new CiqColorsheet800CDMA301().ciqColorsheet1(file,"longitude",fileName);
	    	}
	    	
	    	if(i==2)
	    	{
		    	if(ciq1[i].equals(dump[i]))
		    	{
		    		
		    	}
		    	//else
		    		//new CiqColorsheet800CDMA301().ciqColorsheet1(file,"diversity",fileName);
	    	}
	    	
	    	if(i==3)
	    	{
	    		System.out.println(ciq1[i]+" "+dump[i]);
		    	if(ciq1[i].equals(dump[i]))
		    	{
		    		
		    	}
		    	else
		    		new CiqColorsheet800CDMA301().ciqColorsheet1(file,"azimuth",fileName);
	    	}
	    }
	    
	    LOGGER.info("2.5 TDD CDU30/ScheduleNameSiteCodeCDU30/ReadDump4CDU30/Earfcn2500CDU30/ReadCIQOtherValueCDU30/CompareOtherValuesCDU30");
	    
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
