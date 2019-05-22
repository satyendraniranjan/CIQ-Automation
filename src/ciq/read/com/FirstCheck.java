package ciq.read.com;

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

public class FirstCheck {
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
	    HashSet<String> channelcounter= new HashSet<>();
	    HashSet<String> antenna_counter= new HashSet<>();
	    HashMap<Integer, String>hm= new HashMap<>();
	    HashSet<String> diversity= new HashSet<>();
	   
	    int count = 0;
		int count1 = 0;
		String cell_Id = "";
	    List<String> lst = null,lst1 = null,lst2,lst3,lst4,lst5;
	    lst=new ArrayList<String>();
	    lst1=new ArrayList<String>();
	    String[] cellIdMatch1= {"0","1","2","3","4","5","6","7","8"};
	    String cellIdMatch2[]= {"0","1","3","4","6","7"};
	    String cellIdMatch3[]= {"0","3","6"};
	    String cellIdMatch4[]= {"0","1","2","3","4","5"};
	    //String cellIdMatch5[]= {"0","1","4","5"};
	    //String cellIdMatch6[]= {"0","4"};
	    String cellIdMatch7[]= {"0","1","2"};
	    String cellIdMatch8[]= {"0","1","3","4"};
	    //lst1.add(cellIdMatch1);
	    
	    String cellIda1[]= {"0","1","2","9","10","11","3","4","5"};
	    String cellIda2[]= {"0","1","9","10","3","4"};
	    String cellIda3[]= {"0","9","3"};		
	    String cellIda4[]= {"0","1","2","9","10","11"};
	    String cellIda8[]= {"0","1","9","10"};
	    String cellIda7[]= {"0","1","2"};
	    
	    
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

			String str = df.formatCellValue(row.getCell(0));

			
			if ((str.equals(cascade) || flag==0) &&  !str.isEmpty()  && !str.contains(" ")) {
			
					
					 channelcounter.add(df.formatCellValue(row.getCell(21)));
					 diversity.add(df.formatCellValue(row.getCell(28)));
					 
	/* Check Cascade Mismatch..............................................................................*/
					 //System.out.println(df.formatCellValue(row.getCell(0)).equals(cascade));
					 //System.out.println(df.formatCellValue(row.getCell(0)));
					 if(df.formatCellValue(row.getCell(0)).equals(cascade)) {}
						else
						{
							flagcascade=1;
							new CiqColorsheet1().ciqColorsheet1(file, "cascade", fileName);
						}			
					
					 cell_Id = df.formatCellValue(row.getCell(16));
						lst.add(cell_Id);
						count = Integer.parseInt(cell_Id);
						if (count == count1 && count1 < 3)
						{
				        count1++;
				        
				     
				        	
				        }
				
	
				
			}
	    	
	    	
	    }catch(java.lang.NumberFormatException ex)
	    {
	    	LOGGER.log(Level.SEVERE, "2.5 TDD CDU20/FirstCheck", ex);
	    	continue;
	    }
	    	
	    catch(java.lang.NullPointerException ax)
	    	{
	    	LOGGER.log(Level.SEVERE, "2.5 TDD CDU20/FirstCheck", ax);
	    	continue;
	    	}
	    	
	    	}
	    
	    
	    /*  Cell_ID Match..................................................................................*/
	    
	   // System.out.println(diversity.contains("8T8R")+" "+lst+" "+channelcounter.size()+" "+count1);
	    
	    if(diversity.size()==1)
	    {
	      if(diversity.contains("8T8R"))
	      {
	      if((count1==3 && channelcounter.size()==3) || (channelcounter.size()==3 && rownum==9))
	      {
	      	
	      	for(String s:cellIdMatch1)
	      		lst1.add(s);
	      	//System.out.println(lst1);
	      	if(lst.equals(lst1)) {//System.out.println("check1");
	      		}
	      	
	     else
	      		{
	  	      //System.out.println("cellId Mismatch");
	    	 flagcellid=1;
	  	   new CiqColorsheet1().ciqColorsheet1(file,"cellId",fileName);
	  	    // throw new MyException();
	      		}
	      		
	      }
	      else if(count1==3 && channelcounter.size()==2 || channelcounter.size()==2 && rownum==6)
	      {
	      	for(String s:cellIdMatch4)
	      		lst1.add(s);
	      	if(lst.equals(lst1)) {}
	      	else
	      	{
	      		//System.out.println("cellId Mismatch2");
	      		 flagcellid=1;
	      		new CiqColorsheet1().ciqColorsheet1(file,"cellId",fileName);
	      		//System.exit(0);
	          }
	      }
	      
	      
	      
	      else if(count1==3 && channelcounter.size()==1  || channelcounter.size()==1 && rownum==3)
	      {
	      	for(String s:cellIdMatch7)
	      		lst1.add(s);
	      	if(lst.equals(lst1)) { //System.out.println("cellId Match3");
	      		}
	      	
	      	else
	      	{
	      		//System.out.println("cellId Mismatch");
	      		 flagcellid=1;
	      		new CiqColorsheet1().ciqColorsheet1(file,"cellId",fileName);
	      		//System.exit(0);
	      	}
	      }
	      
	      
	      
	      else if(count1==2 && channelcounter.size()==3 )
	      {
	      	for(String s:cellIdMatch2)
	      		lst1.add(s);
	      	
	      	if(lst.equals(lst1)) {}
	      	else
	      	{   // System.out.println("cellId Mismatch4");
	      		 flagcellid=1;
	      		new CiqColorsheet1().ciqColorsheet1(file,"cellId",fileName);
	      		//System.exit(0);
	      	}
	      }
	      
	      
	      else if(count1==1 && channelcounter.size()==3 )
	      {
	      	for(String s:cellIdMatch3)
	      		lst1.add(s);
	      	
	      	if(lst.equals(lst1)) {}
	      	else
	      	{    //System.out.println("cellId Mismatch5");
	      		 flagcellid=1;
	      		new CiqColorsheet1().ciqColorsheet1(file,"cellId",fileName);
	      		//System.exit(0);
	      	}
	      }
	      
	      else if(count1==2 && channelcounter.size()==2 )
	      {
	      	for(String s:cellIdMatch8)
	      		lst1.add(s);
	      	//System.out.println(lst1+" "+lst);
	      	if(lst.equals(lst1)) {}
	      	else
	      	{
	      		//System.out.println("cellId Mismatch6");
	      		 flagcellid=1;
	      		new CiqColorsheet1().ciqColorsheet1(file,"cellId",fileName);
	      		//System.exit(0);
	      	}
	      }
	      
	      
	      }
	      
/* 4T4R...............................................................................................*/
	      
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
		  	   new CiqColorsheet1().ciqColorsheet1(file,"cellId",fileName);
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
			      		new CiqColorsheet1().ciqColorsheet1(file,"cellId",fileName);
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
			      		new CiqColorsheet1().ciqColorsheet1(file,"cellId",fileName);
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
			      		new CiqColorsheet1().ciqColorsheet1(file,"cellId",fileName);
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
			      		new CiqColorsheet1().ciqColorsheet1(file,"cellId",fileName);
			      		//System.exit(0);
			      	}
			      }
			      
			      else if(count1==2 && channelcounter.size()==2 )
			      {
			      	for(String s:cellIda8)
			      		lst1.add(s);
			      	System.out.println(lst1+" "+lst);
			      	if(lst.equals(lst1)) {}
			      	else
			      	{
			      		//System.out.println("cellId Mismatch");
			      		 flagcellid=1;
			      		new CiqColorsheet1().ciqColorsheet1(file,"cellId",fileName);
			      		//System.exit(0);
			      	}	
		      }
	    	  
	    	  
	    	  
	    	  
	    	  
	    	  
	      }else
	      {
	    	  flagcellid=1;
	    	  new CiqColorsheet1().ciqColorsheet1(file,"diversity",fileName);
	    	  new CiqColorsheet1().ciqColorsheet1(file,"cellId",fileName);
	      }
	      
	    }
	      
/* Return True or False.....................................................................................*/
	      
	      LOGGER.log(Level.SEVERE, "2.5 TDD CDU20/FirstCheck/flagcascade", flagcascade+" "+flagcellid);
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