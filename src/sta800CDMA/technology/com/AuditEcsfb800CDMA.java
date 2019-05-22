package sta800CDMA.technology.com;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import awt.file.lincense.com.Ciqframe;

public class AuditEcsfb800CDMA {
	private static final Logger LOGGER = Logger.getLogger(Ciqframe.class.getName());
	public void readCIQ(File file,String s, String PN_OFF, String fileName, String eNB_id, List<String> lst)
	{
		 try {
	            //FileInputStream file = new FileInputStream(new File("C:\\Users\\esatnir\\Videos\\file read\\Complete SP05WO311 STA 2.5 TDD  for BBU No_ 1 2018_07_06_11_32_35.xlsx"));
	 
	            
	            XSSFWorkbook workbook = new XSSFWorkbook(file);
	 
	        
	            XSSFSheet sheet = workbook.getSheetAt(0);
	 
	            DataFormatter df = new DataFormatter();
	            int pnoff=0,pnoff1=0,pnoff2=0;
	           // String MNC_ID="120";
	            //String MCC_ID="310";
	           // String BandClass="bc10";
	            //System.out.println("dump_pnoff= "+PN_OFF);
	            
	           // System.out.println("inside of auditecfsb");
	            
	            String s1[]= s.split(" ");
	            String s2[]=PN_OFF.split(" ");
	            String LtmOff=Integer.toString((Integer.parseInt(s1[7])));
	            String cell_id;
	            int count;
	            int count1=0;
	            int count2=0;
	           // List<String> ciq_pn_off = new ArrayList<>();
	            HashSet<String> ciq_pn_off= new HashSet<>();
	            HashMap<Integer, String> ciq_pn_off1= new HashMap<>();
	            List<String> cell_Num= new ArrayList<>();
	            HashSet<String> pnoff_size= new HashSet<>();
	            HashSet<String> dump_pnoff= new HashSet<>();
/* Start Reading.............................................................................*/	            
	            
	          // System.out.println(sheet.getLastRowNum()+"inside of Audit 1"); 
	            for(int i=1; i<sheet.getLastRowNum()+1;i++)
	            {
	            	try {
	            	
	            	Row row=sheet.getRow(i);
	           // System.out.print("Hi");
	            	
	  	                
/* Start Comparing Fix Values............................................................................*/	  
	               
	            
	                 //    System.out.println("inside of AuditEcsfb"+df.formatCellValue(row.getCell(1))+" "+s1[0]);
	            
	                if(df.formatCellValue(row.getCell(1)).equals(s1[0])) {
	                	 //System.out.print(" \t BTS_Id Equal");
	                 }
	                	
	                 else
	                	 new CiqColorsheet800CDMA301().ciqColorsheet1(file,"BTS_ID",fileName);
	                 
	                 
	                 if(df.formatCellValue(row.getCell(22)).equals(s1[4])) {
	                	 //System.out.print("\tOTA_NID Equal");
	                 }
	                	//System.out.print("\tOTA_NId Equal");
	                 else
	                	 new CiqColorsheet800CDMA301().ciqColorsheet1(file,"OTA_NID",fileName);
	                 
	                // System.out.println("bye");
	                 
	                 if(df.formatCellValue(row.getCell(46)).equals(s1[6])) {
	                	// System.out.print("\tReg_Zone Equal");
	                 }
	                	//System.out.print("\tReg_Zone Equal");
	                 else
	                	 new CiqColorsheet800CDMA301().ciqColorsheet1(file,"REG_Z",fileName);
	                 
	                 if(df.formatCellValue(row.getCell(45)).equals(LtmOff)){
		                	//System.out.print("\tLTM_OFF Equal");
	                 }
	                 else
	                	 new CiqColorsheet800CDMA301().ciqColorsheet1(file,"LTM_OFF",fileName);
	                
/* Start Storing PN_OFF......................................................................*/	                 
	                 
	                 
	                 pnoff_size.add(df.formatCellValue(row.getCell(20)));
	                 cell_id= df.formatCellValue(row.getCell(19));
					 count=Integer.parseInt(cell_id);
					// System.out.println(count+"count1= "+count1);
				     if(count==0)
				   {
				    	 //System.out.println("inside the loop");
				    	 //ciq_pn_off[count1]= df.formatCellValue(row.getCell(14));
				    	 ciq_pn_off1.put(count,df.formatCellValue(row.getCell(20)));
				    			 count2++;
				    			 }
				     if(count==1)
				     {
				    	 ciq_pn_off1.put(count,df.formatCellValue(row.getCell(20)));
		    			 count2++; 
				     }
				     
				     if(count==2)
				     {
				    	 ciq_pn_off1.put(count,df.formatCellValue(row.getCell(20)));
		    			 count2++; 
				     }
	                 
	               
	          
					
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
	
	            
/* Start Comparing PN_OFF Values....................................................................*/	         
	            
	           System.out.println(count2+" "+pnoff_size.size()+" "+ciq_pn_off.size()+" "+s2.length);
	           
	            for(int i=0;i<count2;i++)
	            {
	            	
	            	//dump_pnoff.add(s2[i]);
	            	//System.out.println(ciq_pn_off1.get(i)+" "+s2[i]);
	            	if(ciq_pn_off1.get(i).equals(s2[i])) {
				    	// System.out.print("\tPN_OFF Equal");
				    	 }
				     else
				    	 new CiqColorsheet800CDMA301().ciqColorsheet1(file,"PN_OFF",fileName);
	            }
        
	            
	            
	            
	            
/* Start Comparing Cell_Num.......................................................................*/
	     
	          // System.out.println(lst+" "+cell_Num);
	            
	           /* if(lst.equals(cell_Num))
	            {}
	            else
	              new CiqColorsheet800CDMA301().ciqColorsheet1(file,"cell_Num",fileName);
	            */
	            LOGGER.log(Level.SEVERE, "800 CDMA/CIQFixValueAudit800CDMA/ReadECSFBDUMP800CDMA/AuditEcsfb800CDMA", count2+" "+pnoff_size.size()+" "+ciq_pn_off.size()+" "+s2.length);
		 
	            
		 
		 System.out.println("Complete Task2..............................>");
		 
		 
/* End Game.................................................................................*/	    		 
		
		 }catch (Exception e) {
	            e.printStackTrace();
		 }
	            
	        

	}

}
