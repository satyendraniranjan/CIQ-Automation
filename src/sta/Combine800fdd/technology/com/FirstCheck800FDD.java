package sta.Combine800fdd.technology.com;

import java.io.File
;
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


public class FirstCheck800FDD {
private static final Logger LOGGER = Logger.getLogger(Ciqframe.class.getName());
	
	
	public boolean firstCheck(Object cascade, File file, String fileName)
	{
	try
			{
				
				LOGGER.setLevel(Level.ALL);
				//System.out.println("Inside of FirstCheck800CDU30");

		//FileInputStream file = new FileInputStream(new File("C:\\Users\\esatnir\\Videos\\CIQ\\Complete PT03XC150 STA 2.5 TDD  for BBU No_ 1 2018_07_16_15_57_01.xlsx"));
		 
	    
	    XSSFWorkbook workbook = new XSSFWorkbook(file);

	    
	    
	    XSSFSheet sheet = workbook.getSheet("800");
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
	    
	    String cellIdMatch1[]= {"15","16","17"};
	    String cellIdMatch2[]= {"15","16"};
	    String cellIdMatch3[]= {"15"};

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
			
			String str = df.formatCellValue(row.getCell(0));
			if ((str.equals(cascade) || flag==0) &&  !str.isEmpty()  && !str.contains(" ")) {	
			
				
				
					
			cell_Id = df.formatCellValue(row.getCell(11));
			lst.add(cell_Id);
			count = Integer.parseInt(df.formatCellValue(row.getCell(10)));
			if (count == count1 && count1 < 3)
			{
	        count1++;
	        
	       // if(df.formatCellValue(row.getCell(28)).equals("1"))
	        	
	        }
					 channelcounter.add(df.formatCellValue(row.getCell(25)));
					 
	/* Check Cascade Mismatch..............................................................................*/
					 //System.out.println(df.formatCellValue(row.getCell(0)).equals(cascade));
					 //System.out.println(df.formatCellValue(row.getCell(0)));
					 if(df.formatCellValue(row.getCell(0)).equals(cascade)) {}
						else
						{
							flagcascade=1;
							new CiqColorsheetCombine800FDD1().ciqColorsheet1(file, "cascade", fileName);
						}			
					
					
				
	
				
			}
	    	
	    	
	    }catch(Exception e)
	    {
	    	e.printStackTrace();
	    }
	    	
	    	}
	    
	    
	    /*  Cell_ID Match..................................................................................*/
	    
	    //System.out.println(channelcounter.size());
	      
	      if((count1==3 && channelcounter.size()==1))
	      {
	      	
	      	for(String s:cellIdMatch1)
	      		lst1.add(s);
	      	//System.out.println(lst1);
	      	if(lst.equals(lst1)) {//System.out.println("check");
	      		}
	      	
	     else
	      		{
	  	      //System.out.println("cellId Mismatch");
	    	 flagcellid=1;
	  	   new CiqColorsheetCombine800FDD1().ciqColorsheet1(file,"cellId",fileName);
	  	    // throw new MyException();
	      		}
	      		
	      }
	      else if(count1==2 && channelcounter.size()==1 )
	      {
	      	for(String s:cellIdMatch2)
	      		lst1.add(s);
	      	if(lst.equals(lst1)) {}
	      	else
	      	{
	      		//System.out.println("cellId Mismatch");
	      		 flagcellid=1;
	      		new CiqColorsheetCombine800FDD1().ciqColorsheet1(file,"cellId",fileName);
	      		//System.exit(0);
	          }
	      }
	      
	      
	      
	      else if(count1==1 && channelcounter.size()==1)
	      {
	      	for(String s:cellIdMatch3)
	      		lst1.add(s);
	      	if(lst.equals(lst1)) { System.out.println("cellId Match");}
	      	else
	      	{
	      		//System.out.println("cellId Mismatch");
	      		 flagcellid=1;
	      		new CiqColorsheetCombine800FDD1().ciqColorsheet1(file,"cellId",fileName);
	      		//System.exit(0);
	      	}
	      }
	      
	      
	      
	     
	      
/* Return True or False.....................................................................................*/
	      
	      LOGGER.log(Level.SEVERE, "800 FDD /FirstCheck/flagcascade", flagcascade+" "+flagcellid);
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
