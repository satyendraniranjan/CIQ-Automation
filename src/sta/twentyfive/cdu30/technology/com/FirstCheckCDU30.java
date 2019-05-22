package sta.twentyfive.cdu30.technology.com;

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

public class FirstCheckCDU30 {
	private static final Logger LOGGER = Logger.getLogger(Ciqframe.class.getName());
	
	
	public boolean firstCheck(Object cascade, File file, String fileName)
	{
	try
			{
				
				LOGGER.setLevel(Level.ALL);

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
	    List<String> lst = null,lst1 = null,lst2,lst3,lst4,lst5;
	    lst=new ArrayList<String>();
	    lst1=new ArrayList<String>(); 
	    
	    String cellIdMatch1[]= {"3","4","5","12","13","14","6","7","8"};
	    String cellIdMatch2[]= {"3","4","5","12","13","14"};
	    String cellIdMatch3[]= {"3","12","6"};
	    String cellIdMatch4[]= {"3","4","12","13","6","7",};
	    String cellIdMatch7[]= {"3","4","5"};
	    String cellIdMatch8[]= {"3","4","12","13"};
	    
	    String cellIdMatch11[]= {"3","4","5","12","13","14","21","22","23"};
	    String cellIdMatch12[]= {"3","4","5","12","13","14"};
	    String cellIdMatch13[]= {"3","12","21"};
	    String cellIdMatch14[]= {"3","4","12","13","21","22",};
	    String cellIdMatch17[]= {"3","4","5"};
	    String cellIdMatch18[]= {"3","4","12","13"};
	    //lst1.add(cellIdMatch1);
	    
	    String cellIda1[]= {"3","12","21","4","13","22","5","14","23"};
	    String cellIda2[]= {"3","12","4","13","5","14"};
	    String cellIda3[]= {"3","4","5"};		
	    String cellIda4[]= {"3","12","21","4","13","22"};
	    String cellIda8[]= {"3","12","4","13"};
	    String cellIda7[]= {"3","12","21"};
	    
	   
	    
	    
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
			
				
				
					
			cell_Id = df.formatCellValue(row.getCell(22));
			lst.add(cell_Id);
			count = Integer.parseInt(df.formatCellValue(row.getCell(21)));
			if (count == count1 && count1 < 3)
			{
	        count1++;
	        
	       // if(df.formatCellValue(row.getCell(28)).equals("1"))
	        	
	        }
					 channelcounter.add(df.formatCellValue(row.getCell(28)));
					 diversity.add(df.formatCellValue(row.getCell(30)));
					 //System.out.println(df.formatCellValue(row.getCell(28)));
	/* Check Cascade Mismatch..............................................................................*/
					 //System.out.println(df.formatCellValue(row.getCell(0)).equals(cascade));
					 //System.out.println(df.formatCellValue(row.getCell(0)));
					 if(df.formatCellValue(row.getCell(1)).equals(cascade)) {}
						else
						{
							flagcascade=1;
							new CiqColorsheetCDU301().ciqColorsheet1(file, "cascade", fileName);
						}			
					
					
				
	
				
			}
	    	
	    	
	    }catch(Exception e)
	    {
	    	e.printStackTrace();
	    }
	    	
	    	}
	    
	    
	    /*  Cell_ID Match..................................................................................*/
	    
	    System.out.println(count1+" count1= "+channelcounter.size()+" "+lst);
	    System.out.println(diversity);
	    
	    if(diversity.size()==1)
	    {
	    if(diversity.contains("8T8R"))
	      {
	      
	      if((count1 ==3 && channelcounter.size()==3) || (channelcounter.size()==3 && rownum==9))
	      {
	      	
	      	for(String s:cellIdMatch1)
	      		lst1.add(s);
	      	//System.out.println(lst1);
	      	if(lst.equals(lst1)) {
	      		//System.out.println("check");
	      		}
	      	
	     else
	      		{
	  	      //System.out.println("cellId Mismatch");
	    	 flagcellid=1;
	  	   new CiqColorsheetCDU301().ciqColorsheet1(file,"cellId",fileName);
	  	    // throw new MyException();
	      		}
	      		
	      }
	      else if(count1==3 && channelcounter.size()==2 || channelcounter.size()==2 && rownum==6)
	      {
	      	for(String s:cellIdMatch2)
	      		lst1.add(s);
	      	if(lst.equals(lst1)) {
	      		//System.out.println("match channelsize=2");
	      	}
	      	else
	      	{
	      		//System.out.println("mismatch channelsize=2");
	      		 flagcellid=1;
	      		new CiqColorsheetCDU301().ciqColorsheet1(file,"cellId",fileName);
	      		//System.exit(0);
	          }
	      }
	      
	      
	      
	      else if(count1==3 && channelcounter.size()==1  || channelcounter.size()==1 && rownum==3)
	      {
	      	for(String s:cellIdMatch7)
	      		lst1.add(s);
	      	if(lst.equals(lst1)) { 
	      		//System.out.println("cellId Match=1");
	      		}
	      	else
	      	{
	      		//System.out.println("cellId Mismatch");
	      		 flagcellid=1;
	      		new CiqColorsheetCDU301().ciqColorsheet1(file,"cellId",fileName);
	      		//System.exit(0);
	      	}
	      }
	      
	      
	      
	      else if(count1==2 && channelcounter.size()==3 )
	      {
	      	for(String s:cellIdMatch4)
	      		lst1.add(s);
	      	
	      	if(lst.equals(lst1)) {
	      		//System.out.println("cellId match2");
	      	}
	      	else
	      	{    
	      		//System.out.println("cellId Mismatch2");
	      	
	      		 flagcellid=1;
	      		new CiqColorsheetCDU301().ciqColorsheet1(file,"cellId",fileName);
	      		//System.exit(0);
	      	}
	      }
	      
	      
	      else if(count1==1 && channelcounter.size()==3 )
	      {
	      	for(String s:cellIdMatch3)
	      		lst1.add(s);
	      	
	      	if(lst.equals(lst1)) {
	      		//System.out.println("cellId match1");
	      	}
	      	else
	      	{    
	      		//System.out.println("cellId Mismatch1");
	      		 flagcellid=1;
	      		new CiqColorsheetCDU301().ciqColorsheet1(file,"cellId",fileName);
	      		//System.exit(0);
	      	}
	      }
	      
	      else if(count1==2 && channelcounter.size()==2 )
	      {
	      	for(String s:cellIdMatch8)
	      		lst1.add(s);
	      	
	      	if(lst.equals(lst1)) {
	      		//System.out.println("Hi1="+channelcounter.size());
	      	}
	      	else
	      	{
	      		//System.out.println("Hi2="+channelcounter.size());
	      		//System.out.println("cellId Mismatch");
	      		 flagcellid=1;
	      		new CiqColorsheetCDU301().ciqColorsheet1(file,"cellId",fileName);
	      		//System.exit(0);
	      	}
	      }
	      }
	    
/* 4T4R..................................................................................*/
	    
	    
	    else if(diversity.contains("4T4R") || diversity.contains("2T2R"))
	      {
	    	  if((count1==3 && channelcounter.size()==3) || (channelcounter.size()==3 && rownum==9))
		      {
		      	
		      	for(String s:cellIda1)
		      		lst1.add(s);
		      	//System.out.println(lst1);
		      	if(lst.equals(lst1)) {//System.out.println("check");
		      		}
		      	
		     else
		      		{
		  	      //System.out.println("cellId Mismatch");
		    	 flagcellid=1;
		  	   new CiqColorsheetCDU301().ciqColorsheet1(file,"cellId",fileName);
		  	    // throw new MyException();
		      		}
		      	
		      }
		      	 else if(count1==3 && channelcounter.size()==2 || channelcounter.size()==2 && rownum==6)
			      {
			      	for(String s:cellIda4)
			      		lst1.add(s);
			      	if(lst.equals(lst1)) {}
			      	else
			      	{
			      		//System.out.println("cellId Mismatch");
			      		 flagcellid=1;
			      		new CiqColorsheetCDU301().ciqColorsheet1(file,"cellId",fileName);
			      		//System.exit(0);
			          }
			      }
			      
			      
			      
			      else if(count1==3 && channelcounter.size()==1  || channelcounter.size()==1 && rownum==3)
			      {
			      	for(String s:cellIda7)
			      		lst1.add(s);
			      	if(lst.equals(lst1)) { System.out.println("cellId Match");}
			      	else
			      	{
			      		//System.out.println("cellId Mismatch");
			      		 flagcellid=1;
			      		new CiqColorsheetCDU301().ciqColorsheet1(file,"cellId",fileName);
			      		//System.exit(0);
			      	}
			      }
			      
			      
			      
			      else if(count1==2 && channelcounter.size()==3 )
			      {
			      	for(String s:cellIda2)
			      		lst1.add(s);
			      	
			      	if(lst.equals(lst1)) {}
			      	else
			      	{    //System.out.println("cellId Mismatch");
			      		 flagcellid=1;
			      		new CiqColorsheetCDU301().ciqColorsheet1(file,"cellId",fileName);
			      		//System.exit(0);
			      	}
			      }
			      
			      
			      else if(count1==1 && channelcounter.size()==3 )
			      {
			      	for(String s:cellIda3)
			      		lst1.add(s);
			      	
			      	if(lst.equals(lst1)) {}
			      	else
			      	{    //System.out.println("cellId Mismatch");
			      		 flagcellid=1;
			      		new CiqColorsheetCDU301().ciqColorsheet1(file,"cellId",fileName);
			      		//System.exit(0);
			      	}
			      }
			      
	    	       
	    	  
			      else if(count1==2 && channelcounter.size()==2 )
			      {
			      	for(String s:cellIda8)
			      		lst1.add(s);
			      	System.out.println(lst1+" "+lst+" "+lst.equals(lst1));
			      	if(lst.equals(lst1)) {}
			      	else
			      	{
			      		//System.out.println("cellId Mismatch");
			      		 flagcellid=1;
			      		new CiqColorsheetCDU301().ciqColorsheet1(file,"cellId",fileName);
			      		//System.exit(0);
			      	}	
		      }
	    	 }
	    
	    /* 64T64R...................................................................................*/
	    
	    if(diversity.contains("64T64R"))
	      {
	      
	      if((count1 ==3 && channelcounter.size()==3) || (channelcounter.size()==3 && rownum==9))
	      {
	      	
	      	for(String s:cellIdMatch11)
	      		lst1.add(s);
	      	//System.out.println(lst1);
	      	if(lst.equals(lst1)) {
	      		//System.out.println("check");
	      		}
	      	
	     else
	      		{
	  	      //System.out.println("cellId Mismatch");
	    	 flagcellid=1;
	  	   new CiqColorsheetCDU301().ciqColorsheet1(file,"cellId",fileName);
	  	    // throw new MyException();
	      		}
	      		
	      }
	      else if(count1==3 && channelcounter.size()==2 || channelcounter.size()==2 && rownum==6)
	      {
	      	for(String s:cellIdMatch12)
	      		lst1.add(s);
	      	if(lst.equals(lst1)) {
	      		//System.out.println("match channelsize=2");
	      	}
	      	else
	      	{
	      		//System.out.println("mismatch channelsize=2");
	      		 flagcellid=1;
	      		new CiqColorsheetCDU301().ciqColorsheet1(file,"cellId",fileName);
	      		//System.exit(0);
	          }
	      }
	      
	      
	      
	      else if(count1==3 && channelcounter.size()==1  || channelcounter.size()==1 && rownum==3)
	      {
	      	for(String s:cellIdMatch17)
	      		lst1.add(s);
	      	if(lst.equals(lst1)) { 
	      		//System.out.println("cellId Match=1");
	      		}
	      	else
	      	{
	      		//System.out.println("cellId Mismatch");
	      		 flagcellid=1;
	      		new CiqColorsheetCDU301().ciqColorsheet1(file,"cellId",fileName);
	      		//System.exit(0);
	      	}
	      }
	      
	      
	      
	      else if(count1==2 && channelcounter.size()==3 )
	      {
	      	for(String s:cellIdMatch14)
	      		lst1.add(s);
	      	
	      	if(lst.equals(lst1)) {
	      		//System.out.println("cellId match2");
	      	}
	      	else
	      	{    
	      		//System.out.println("cellId Mismatch2");
	      	
	      		 flagcellid=1;
	      		new CiqColorsheetCDU301().ciqColorsheet1(file,"cellId",fileName);
	      		//System.exit(0);
	      	}
	      }
	      
	      
	      else if(count1==1 && channelcounter.size()==3 )
	      {
	      	for(String s:cellIdMatch13)
	      		lst1.add(s);
	      	
	      	if(lst.equals(lst1)) {
	      		//System.out.println("cellId match1");
	      	}
	      	else
	      	{    
	      		//System.out.println("cellId Mismatch1");
	      		 flagcellid=1;
	      		new CiqColorsheetCDU301().ciqColorsheet1(file,"cellId",fileName);
	      		//System.exit(0);
	      	}
	      }
	      
	      else if(count1==2 && channelcounter.size()==2 )
	      {
	      	for(String s:cellIdMatch18)
	      		lst1.add(s);
	      	
	      	if(lst.equals(lst1)) {
	      		//System.out.println("Hi1="+channelcounter.size());
	      	}
	      	else
	      	{
	      		//System.out.println("Hi2="+channelcounter.size());
	      		//System.out.println("cellId Mismatch");
	      		 flagcellid=1;
	      		new CiqColorsheetCDU301().ciqColorsheet1(file,"cellId",fileName);
	      		//System.exit(0);
	      	}
	      }
	      }
	    
	    
	    }else
	      {
	    	  flagcellid=1;
	    	  new CiqColorsheetCDU301().ciqColorsheet1(file,"diversity",fileName);
	    	  new CiqColorsheetCDU301().ciqColorsheet1(file,"cellId",fileName);
	      }
	    	  
	    	  
	      
	     // System.out.println("Hi3="+channelcounter.size());
/* Return True or False.....................................................................................*/
	      
	      LOGGER.log(Level.SEVERE, "2.5 TDD CDU30/FirstCheck/flagcascade", flagcascade+" "+flagcellid);
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