package sta.ninteenthhundred.cdu30.technology.com;

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

public class AuditEcsfb1900CDU30 {
	private static final Logger LOGGER = Logger.getLogger(Ciqframe.class.getName());
	public void readCIQ(File file,String s, String PN_OFF, String fileName, String eNB_id, List<String> lst)
	{
		 try {
	            //FileInputStream file = new FileInputStream(new File("C:\\Users\\esatnir\\Videos\\file read\\Complete SP05WO311 STA 2.5 TDD  for BBU No_ 1 2018_07_06_11_32_35.xlsx"));
	 
	            
	            XSSFWorkbook workbook = new XSSFWorkbook(file);
	 
	        
	            XSSFSheet sheet = workbook.getSheet("ECSFB Info");
	 
	            DataFormatter df = new DataFormatter();
	            int pnoff=0,pnoff1=0,pnoff2=0;
	           // String MNC_ID="120";
	            //String MCC_ID="310";
	            String BandClass="bc1";
	            //System.out.println(PN_OFF);
	            String s1[]= s.split(" ");
	            String s2[]=PN_OFF.split(" ");
	            String LtmOff=Integer.toString((Integer.parseInt(s1[7])*2));
	            String cell_id;
	            int count;
	            int count1=3;
	            int count2=0;
	           // List<String> ciq_pn_off = new ArrayList<>();
	            HashMap<Integer,String> ciq_pn_off= new HashMap<>();
	            List<String> cell_Num= new ArrayList<>();
	            HashSet<String> pnoff_size= new HashSet<>();
/* Start Reading.............................................................................*/	            
	            
	           System.out.println(sheet.getLastRowNum()); 
	            for(int i=1; i<sheet.getLastRowNum()+1;i++)
	            {
	            	try {
	            	
	            	Row row=sheet.getRow(i);
	            	
	            if(!df.formatCellValue(row.getCell(0)).equals(eNB_id)) {
	            	break;
	            }	
	            
	            
	            	
	         //String str = df.formatCellValue(row.getCell(13));
	         
	         
/* Start Comparing eNB_id ............................................................................*/	         
	         
	         
	       //System.out.println(eNB_id+" "+(df.formatCellValue(row.getCell(0))));  
	      if((df.formatCellValue(row.getCell(0)).equals(eNB_id.toString())) && (row.getCell(0)!=null && !df.formatCellValue(row.getCell(0)).equals(""))) {}
	      else
	    	  new CiqColorsheet1900CDU302().ciqColorsheet2(file,"eNB_id",fileName);
	    	
	     // System.out.println("hi");
	     // System.out.println(df.formatCellValue(row.getCell(1))); 
	      cell_Num.add(df.formatCellValue(row.getCell(1)));
	         
	           
	                
/* Start Comparing Fix Values............................................................................*/	  
	                
	                
	                if(df.formatCellValue(row.getCell(2)).equals(s1[3]))
	                {
	                  // System.out.print("OTA_sid Equal");
	                
	                } else
	                	 new CiqColorsheet1900CDU302().ciqColorsheet2(file,"OTA_SID",fileName);
	                
	                 if(df.formatCellValue(row.getCell(9)).equals(s1[0])) {
	                	 //System.out.print(" \t BTS_Id Equal");
	                 }
	                	
	                 else
	                	 new CiqColorsheet1900CDU302().ciqColorsheet2(file,"BTS_Id",fileName);
	                 
	                 if(df.formatCellValue(row.getCell(7)).equals(s1[1])) {
	                	 //System.out.print("\tBSC_SId Equal");
	                 }
	                	
	                 else
	                	 new CiqColorsheet1900CDU302().ciqColorsheet2(file,"BSC_SId",fileName);
	                 
	                 if(df.formatCellValue(row.getCell(8)).equals(s1[2])) {
	                	 //System.out.print("\tBSC_NId Equal");
	                 }
	                	//System.out.print("\tBSC_NId Equal");
	                 else
	                	 new CiqColorsheet1900CDU302().ciqColorsheet2(file,"BSC_NId",fileName);
	                 
	                 if(df.formatCellValue(row.getCell(3)).equals(s1[4])) {
	                	 //System.out.print("\tOTA_NId Equal");
	                 }
	                	//System.out.print("\tOTA_NId Equal");
	                 else
	                	 new CiqColorsheet1900CDU302().ciqColorsheet2(file,"OTA_NId",fileName);
	                 
	                 if(df.formatCellValue(row.getCell(11)).equals(s1[5])) {
	                	 //System.out.print("\tFA_Id Equal");
	                 }
	                	//System.out.print("\tFA_Id Equal");
	                 else
	                	 new CiqColorsheet1900CDU302().ciqColorsheet2(file,"FA_Id",fileName);
	                 
	                 if(df.formatCellValue(row.getCell(4)).equals(s1[6])) {
	                	 //System.out.print("\tReg_Zone Equal");
	                 }
	                	//System.out.print("\tReg_Zone Equal");
	                 else
	                	 new CiqColorsheet1900CDU302().ciqColorsheet2(file,"REG_Z",fileName);
	                 
	                 if(df.formatCellValue(row.getCell(5)).equals(LtmOff)){
		                	//System.out.print("\tLTM_OFF Equal");
	                 }
	                 else
	                	 new CiqColorsheet1900CDU302().ciqColorsheet2(file,"LTM_OFF",fileName);
	                
/* Start Storing PN_OFF......................................................................*/	                 
	                 
	                 
	                 pnoff_size.add(df.formatCellValue(row.getCell(12)));
	                 cell_id= df.formatCellValue(row.getCell(1));
					 count=Integer.parseInt(cell_id);
					 //System.out.println(ciq_pn_off.length);
				     if(count==count1 && count1<6 && count1>2)
				   {
				    	 //ciq_pn_off[count1]= df.formatCellValue(row.getCell(14));
				    	 ciq_pn_off.put(count2, df.formatCellValue(row.getCell(12)));
				    			 count2++;
				    			 count1++;
				    			
				    			 
				     }
	                 
	               
	                 

	                 
/* Start Comparing Fix Values..............................................................*/
	                 
	                 
	                 if(BandClass.equals(df.formatCellValue(row.getCell(10)))){
	                	//System.out.print("\tBandClass Equal");
	                 }
	                 else
	                	 new CiqColorsheet1900CDU302().ciqColorsheet2(file,"BandClass",fileName); 
	                 
	                 
	                // System.out.println();
	                 
					
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
	            	
	            	if(ciq_pn_off.get(i).equals(s2[i]) && pnoff_size.size()==count2 && ciq_pn_off.size()<=s2.length) {
				    	 //System.out.print("\tPN_OFF Equal");
				    	 }
				     else
				    	 new CiqColorsheet1900CDU302().ciqColorsheet2(file,"PN_OFF",fileName);
	            }
        
	            
	            
	            
	            
/* Start Comparing Cell_Num.......................................................................*/
	     
	          // System.out.println(lst+" "+cell_Num);
	            
	            if(lst.equals(cell_Num))
	            {}
	            else
	              new CiqColorsheet1900CDU302().ciqColorsheet2(file,"cell_Num",fileName);
	            
	            LOGGER.log(Level.SEVERE, "1900 FDDCDU30/CIQFixValueAudit1900CDU30/ReadECSFBDUMP1900CDU30/AuditEcsfb1900CDU30", count2+" "+pnoff_size.size()+" "+ciq_pn_off.size()+" "+s2.length);
		 
		 
		 System.out.println("Complete Task2..............................>");
		 
		 
/* End Game.................................................................................*/	    		 
		
		 }catch (Exception e) {
	            e.printStackTrace();
		 }
	            
	        

	}

}
