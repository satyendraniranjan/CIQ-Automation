package sta.ninteenthhundred.cdu30.technology.com;

import java.io.File;
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
import color.excel.com.CiqColorsheet1;

public class FirstCheck1900CDU30 {
private static final Logger LOGGER = Logger.getLogger(Ciqframe.class.getName());
	
	
	public boolean firstCheck(Object cascade, File file, String fileName)
	{
	try
			{
				
				LOGGER.setLevel(Level.ALL);
				//System.out.println("Inside of FirstCheck800CDU30");

		//FileInputStream file = new FileInputStream(new File("C:\\Users\\esatnir\\Videos\\CIQ\\Complete PT03XC150 STA 2.5 TDD  for BBU No_ 1 2018_07_16_15_57_01.xlsx"));
		 
	    
	    XSSFWorkbook workbook = new XSSFWorkbook(file);

	    
	    
	    XSSFSheet sheet = workbook.getSheetAt(0);
	    DataFormatter df = new DataFormatter();
	    HashSet<String> phycell= new HashSet<>();
	    HashSet<String> rsi=new HashSet<>();
	    HashSet<String> channelcounter= new HashSet<>();
	    HashSet<String> antenna_counter= new HashSet<>();
	    HashMap<Integer, String>hm= new HashMap<>();
	    HashSet<String> eNB_id= new HashSet<>();
	    HashSet<String> diversity= new HashSet<>();
	   
	    int count = 0;
		int count1 = 0;
		String cell_Id = "";
	    List<String> lst = null,lst1 = null;
	    lst=new ArrayList<String>();
	    lst1=new ArrayList<String>();
	    
	    String cellIdMatch1[]= {"0","9","18"};
	    String cellIdMatch2[]= {"0","9"};
	    String cellIdMatch3[]= {"0","1"};
	    String cellIdMatch4[]= {"0","9","18","1","10","19"};
	    String cellIdMatch5[]= {"0","9","1","10"};
	    //String cellIdMatch6[]= {"1","2"};

	    
	    /*String cellIdMatch11[]= {"0","1","2"};
	    String cellIdMatch12[]= {"0","1"};
	    String cellIdMatch13[]= {"0","6"};
	    String cellIdMatch14[]= {"0","1","2","6","7","8"};
	    String cellIdMatch15[]= {"0","1","6","7"};*/

	    //lst1.add(cellIdMatch1);
	    
	    int a=0;
	    int flagcascade=0;
		int flagcellid=0;
	   
	    //LOGGER.info("2.5 TDD CDU20/CIQFixValueAudit");
	  
	    /*Reading CIQ .............................................................................*/
	        int rownum=0;//Integer.toString(sheet.getLastRowNum());
	       // System.out.println(rownum.trim());
	    
	    for (int j = 1; j < sheet.getLastRowNum() + 1; j++) {
	        
	    	try 
	    	{
	    	
			Row row = sheet.getRow(j);
			//int st=Integer.parseInt(df.formatCellValue(row.getCell(0)));
			int flag = 0;

			int num = 0;
			
			String str = df.formatCellValue(row.getCell(1));
			//System.out.println(str);
			if ((str.equals(cascade) || flag==0) &&  !str.isEmpty()  && !str.contains(" ")) {	
			
				//System.out.println("Hi");
				
					
			cell_Id = df.formatCellValue(row.getCell(22));
			lst1.add(cell_Id);
			//System.out.println(lst);
			count = Integer.parseInt(df.formatCellValue(row.getCell(21)));
			if (count == count1 && count1 < 3)
			{
	        count1++;
	        
	       // if(df.formatCellValue(row.getCell(28)).equals("1"))
	        	
	        }
					 channelcounter.add(df.formatCellValue(row.getCell(28)));
					 
	/* Check Cascade Mismatch..............................................................................*/
					 //System.out.println(df.formatCellValue(row.getCell(0)).equals(cascade));
					 //System.out.println(df.formatCellValue(row.getCell(0)));
					 if(df.formatCellValue(row.getCell(1)).equals(cascade)) {}
						else
						{
							flagcascade=1;
							new CiqColorsheet1900CDU301().ciqColorsheet1(file, "cascade", fileName);
						}			
					
					
				
	
				
			}
	    	
	    	
	    }catch(Exception e)
	    {
	    	e.printStackTrace();
	    }
	    	
	    	}
	    
	    
	    /*  Cell_ID Match..................................................................................*/
	    
	   // System.out.println(channelcounter.size()+" "+lst1);
	      
	      if((count1==3 && channelcounter.size()==1))
	      {
	      	
	      	for(String s:cellIdMatch1)
	      		lst.add(s);
	      	//System.out.println(lst1);
	      	if(lst1.equals(lst)) {//System.out.println("check");
	      		}
	      	
	     else
	      		{
	  	      //System.out.println("cellId Mismatch");
	    	 flagcellid=1;
	  	   new CiqColorsheet1900CDU301().ciqColorsheet1(file,"cellId",fileName);
	  	    // throw new MyException();
	      		}
	      		
	      }
	      else if(count1==2 && channelcounter.size()==1 )
	      {
	      	for(String s:cellIdMatch2)
	      		lst.add(s);
	      	if(lst1.equals(lst)) {}
	      	else
	      	{
	      		//System.out.println("cellId Mismatch");
	      		 flagcellid=1;
	      		new CiqColorsheet1900CDU301().ciqColorsheet1(file,"cellId",fileName);
	      		//System.exit(0);
	          }
	      }
	      
	      
	      
	      else if(count1==1 && channelcounter.size()==1)
	      {
	      	for(String s:cellIdMatch3)
	      		lst.add(s);
	      	if(lst1.equals(lst)) { //System.out.println("cellId Match");
	      		
	      	}
	      	else
	      	{
	      		//System.out.println("cellId Mismatch");
	      		 flagcellid=1;
	      		new CiqColorsheet1900CDU301().ciqColorsheet1(file,"cellId",fileName);
	      		//System.exit(0);
	      	}
	      }
	      
	      else if(count1==3 && channelcounter.size()==2)
	      {
	      	for(String s:cellIdMatch4)
	      		lst.add(s);
	      	if(lst1.equals(lst)) { //System.out.println("cellId Match");
	      	}
	      	else
	      	{
	      		//System.out.println("cellId Mismatch");
	      		 flagcellid=1;
	      		new CiqColorsheet1900CDU301().ciqColorsheet1(file,"cellId",fileName);
	      		//System.exit(0);
	      	}
	      }
	      
	      else if(count1==2 && channelcounter.size()==2)
	      {
	      	for(String s:cellIdMatch5)
	      		lst.add(s);
	      	if(lst1.equals(lst)) { //System.out.println("cellId Match");
	      	}
	      	else
	      	{
	      		//System.out.println("cellId Mismatch");
	      		 flagcellid=1;
	      		new CiqColorsheet1900CDU301().ciqColorsheet1(file,"cellId",fileName);
	      		//System.exit(0);
	      	}
	      }
	      
	      
	     
	      
/* Return True or False.....................................................................................*/
	      
	      LOGGER.log(Level.SEVERE, "1900 FDD CDU30/FirstCheck/flagcascade", flagcascade+" "+flagcellid);
	     // System.out.println(flagcascade+" "+flagcellid);
	      if(flagcascade==1 || flagcellid==1)
	    	  return false;
	      else
	    	  return true;
	        
	    
	    
	    
	    
	    
	    
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	return false;
	
	
	
	}
}
