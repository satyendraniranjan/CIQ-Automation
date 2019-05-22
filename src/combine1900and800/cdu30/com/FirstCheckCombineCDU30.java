package combine1900and800.cdu30.com;

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
import sta.ninteenthhundred.cdu30.technology.com.CiqColorsheet1900CDU301;

public class FirstCheckCombineCDU30 {
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
	    HashSet<String> channelcounter1= new HashSet<>();
	    HashSet<String> antenna_counter= new HashSet<>();
	    HashMap<Integer, String>hm= new HashMap<>();
	    HashSet<String> eNB_id= new HashSet<>();
	    HashSet<String> diversity= new HashSet<>();
	   
	    int count = 0;
		int count1 = 0;
		int count2=0;
		String cell_Id = "";
		String cell_Id1="";
		List<String> lstnew=null, lstnew1=null;
	    List<String> lst = null,lst1 = null,lst2,lst3,lst4,lst5;
	    lst=new ArrayList<String>();
	    lst1=new ArrayList<String>();
	    lstnew= new ArrayList<String>();
	    lstnew1= new ArrayList<String>();
	    String cellIdMatch1[]= {"2","11","20"};
	    String cellIdMatch2[]= {"2","11"};
	    String cellIdMatch3[]= {"2"};
	    
	    
	    String cellIdMatch4[]= {"0","9","18"};
	    String cellIdMatch5[]= {"0","9"};
	    String cellIdMatch6[]= {"0","1"};
	    String cellIdMatch7[]= {"0","9","18","1","10","19"};
	    String cellIdMatch8[]= {"0","9","1","10"};
	    //String cellIdMatch9[]= {"1"};

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
			if ((str.equals(cascade) || flag==0) &&  !str.isEmpty()  && !str.contains(" ")) {	
				
				//System.out.println(df.formatCellValue(row.getCell(20)).equals("1900")+" "+df.formatCellValue(row.getCell(22)));
			
				
			if(df.formatCellValue(row.getCell(20)).equals("1900"))
			{
					
			cell_Id = df.formatCellValue(row.getCell(22));
			lst.add(cell_Id);
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
					 
			}
			
			//System.out.println(df.formatCellValue(row.getCell(20)).equals("800")+" "+df.formatCellValue(row.getCell(22)));
					
			if(df.formatCellValue(row.getCell(20)).equals("800"))
			{
					
		//System.out.println(df.formatCellValue(row.getCell(20)).equals("800")+" "+df.formatCellValue(row.getCell(22)));
			cell_Id1 = df.formatCellValue(row.getCell(22));
			lstnew.add(cell_Id1);
			count=0;
			count = Integer.parseInt(df.formatCellValue(row.getCell(21)));
			if (count == count2 && count2 < 3)
			{
	        count2++;
	       // System.out.println("count= "+count2);
	       // if(df.formatCellValue(row.getCell(28)).equals("1"))
	        	
	        }
					 channelcounter1.add(df.formatCellValue(row.getCell(28)));
					 
	/* Check Cascade Mismatch..............................................................................*/
					 //System.out.println(df.formatCellValue(row.getCell(0)).equals(cascade));
					 //System.out.println(df.formatCellValue(row.getCell(0)));
					 
			}
					 
			
			
			
			
			
			
			
			
			
					 if(df.formatCellValue(row.getCell(1)).equals(cascade)) {}
						else
						{
							flagcascade=1;
							new CiqColorsheetCombineCDU301().ciqColorsheet1(file, "cascade", fileName);
						}			
									
			}
	    	
	    	
	    }catch(Exception e)
	    {
	    	e.printStackTrace();
	    }
	    	
	    	}
	    
	    
	    
	    
	    
	   // System.out.println(lstnew+" ="+lst);
	    
	 /*  Cell_ID Match of 1900...............................................................................*/
	    
	    //System.out.println(channelcounter.size());
	    //System.out.println(count1+" "+channelcounter.size());
	    
	    if((count1==3 && channelcounter.size()==1))
	      {
	      	
	      	for(String s:cellIdMatch4)
	      		lst1.add(s);
	      	//System.out.println(lst1);
	      	if(lst1.equals(lst)) {//System.out.println("check");
	      		}
	      	
	     else
	      		{
	  	      //System.out.println("cellId Mismatch");
	    	 flagcellid=1;
	  	   new CiqColorsheetCombineCDU301().ciqColorsheet1(file,"cellId",fileName);
	  	    // throw new MyException();
	      		}
	      		
	      }
	      else if(count1==2 && channelcounter.size()==1 )
	      {
	      	for(String s:cellIdMatch5)
	      		lst1.add(s);
	      	if(lst1.equals(lst)) {}
	      	else
	      	{
	      		//System.out.println("cellId Mismatch");
	      		 flagcellid=1;
	      		new CiqColorsheetCombineCDU301().ciqColorsheet1(file,"cellId",fileName);
	      		//System.exit(0);
	          }
	      }
	      
	      
	      
	      else if(count1==1 && channelcounter.size()==1)
	      {
	      	for(String s:cellIdMatch6)
	      		lst1.add(s);
	      	if(lst1.equals(lst)) { //System.out.println("cellId Match");
	      		
	      	}
	      	else
	      	{
	      		//System.out.println("cellId Mismatch");
	      		 flagcellid=1;
	      		new CiqColorsheetCombineCDU301().ciqColorsheet1(file,"cellId",fileName);
	      		//System.exit(0);
	      	}
	      }
	      
	      else if(count1==3 && channelcounter.size()==2)
	      {
	      	for(String s:cellIdMatch7)
	      		lst1.add(s);
	      	if(lst1.equals(lst)) { //System.out.println("cellId Match");
	      	}
	      	else
	      	{
	      		//System.out.println("cellId Mismatch");
	      		 flagcellid=1;
	      		new CiqColorsheetCombineCDU301().ciqColorsheet1(file,"cellId",fileName);
	      		//System.exit(0);
	      	}
	      }
	      
	      else if(count1==2 && channelcounter.size()==2)
	      {
	      	for(String s:cellIdMatch8)
	      		lst1.add(s);
	      	if(lst1.equals(lst)) { //System.out.println("cellId Match");
	      	}
	      	else
	      	{
	      		//System.out.println("cellId Mismatch");
	      		 flagcellid=1;
	      		new CiqColorsheetCombineCDU301().ciqColorsheet1(file,"cellId",fileName);
	      		//System.exit(0);
	      	}
	      }
	    
	    
	      
	    
	      
/* Cell_id match of 800.....................................................................................*/
	      
	  //  System.out.println(count2+" "+channelcounter1.size());
	    
	      if((count2==3 && channelcounter1.size()==1))
	      {
	      	
	      	for(String s:cellIdMatch1)
	      		lstnew1.add(s);
	     //System.out.println(lst1);
	      	if(lstnew.equals(lstnew1)) {//System.out.println("check");
	      		}
	      	
	     else
	      		{
	  	      //System.out.println("cellId Mismatch");
	    	 flagcellid=1;
	  	   new CiqColorsheetCombineCDU301().ciqColorsheet1(file,"cellId",fileName);
	  	    // throw new MyException();
	      		}
	      		
	      }
	      else if(count2==2 && channelcounter1.size()==1 )
	      {
	      	for(String s:cellIdMatch2)
	      		lstnew1.add(s);
	      	if(lstnew.equals(lstnew1)) {}
	      	else
	      	{
	      		//System.out.println("cellId Mismatch");
	      		 flagcellid=1;
	      		new CiqColorsheetCombineCDU301().ciqColorsheet1(file,"cellId",fileName);
	      		//System.exit(0);
	          }
	      }
	      
	      
	      
	      else if(count2==1 && channelcounter1.size()==1)
	      {
	      	for(String s:cellIdMatch3)
	      		lstnew1.add(s);
	      	if(lstnew.equals(lstnew1)) { 
	      		//System.out.println("cellId Match");
	      		}
	      	else
	      	{
	      		//System.out.println("cellId Mismatch");
	      		 flagcellid=1;
	      		new CiqColorsheetCombineCDU301().ciqColorsheet1(file,"cellId",fileName);
	      		//System.exit(0);
	      	}
	      }
	      
	      
	      
	     
	      
/* Return True or False.....................................................................................*/
	      
	      LOGGER.log(Level.SEVERE, "Combine FDD CDU30/FirstCheckCombineCDU30/flagcascade", flagcascade+" "+flagcellid);
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
