package sta.twentyfive.cdu30.technology.com;

import java.io.File;


import java.io.FileInputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import awt.file.lincense.com.Ciqframe;


public class ReadCIQOtherValuesCDU30 {

	private static final Logger LOGGER = Logger.getLogger(Ciqframe.class.getName());
	public void readCIQValue(HashMap<Integer, String> dumpchannel, HashMap<String, String> hmValues, HashSet<String> antenna_name, File file, Object cascade, String fileName, String sitecode) throws java.lang.NullPointerException
	{
		try {
			
			LOGGER.setLevel(Level.ALL);
			
			
			//FileInputStream file = new FileInputStream(new File("C:\\Users\\esatnir\\Videos\\CIQ\\Complete PT03XC150 STA 2.5 TDD  for BBU No_ 1 2018_07_16_15_57_01.xlsx"));
			 
		    
		    XSSFWorkbook workbook = new XSSFWorkbook(file);

		    
		    
		    XSSFSheet sheet = workbook.getSheetAt(0);
		    DataFormatter df = new DataFormatter();
		    int flagfinal=0;
		   
		    String alpha[] = null;
		    String beta[] = null;
		    String gamma[] = null;
		  
		    //System.out.println(hmValues.entrySet());
		    if(hmValues.containsKey("Alpha"))
		    {
		    	  alpha=hmValues.get("Alpha").split(" ");
		 
		    }
		   
		    
		    if(hmValues.containsKey("Beta"))
		    {
		     beta= hmValues.get("Beta").split(" ");  
		   
		    }
		    
		    
		    if(hmValues.containsKey("Gamma"))
		    {
		    	gamma= hmValues.get("Gamma").split(" ");
		    
		 
		    }
		    
		    
		  
		    TreeSet<String>ciqchannel= new TreeSet<>();
		    TreeSet<String>dumpchannel1= new TreeSet<>();
		    HashSet<String> ciq_antenna_name= new HashSet<>();
		    String alpha1 = null;
		    String beta1=null;
		    String gamma1=null;
		    String Values[];
		    
		   
		    int count = 0;  
			int count1 = 0;

			
			
			Row row = null;
			String cell_Id = "";
		    int a=0;
		    int Vlan=0;
		    int Enode_name=0;
		    int Fixed_value=0;
		  
		    
/* Start Reading CIQ..........................................................................*/
		    
		    
		    for (int j = 1; j < sheet.getLastRowNum() + 1; j++) {
		    	try {
		    		
		    	

				 row = sheet.getRow(j);
				int flag = 0;

				int num = 0;
				
				for (int k = 1; k <=1; k++) {

					
					String str = df.formatCellValue(row.getCell(k));

					String s = "";
					
					if (!str.equals(cascade) && flag == 0) {

						

						break;
					} else {
						
					
						flag = 1;
						
						cell_Id = df.formatCellValue(row.getCell(21));
						count = Integer.parseInt(cell_Id);
						if (count == count1 && count1 < 3){
					    //System.out.println(df.formatCellValue(row.getCell(34)));
						ciq_antenna_name.add(df.formatCellValue(row.getCell(34)));
							
/* Start Reading Azimuth, Antenna, Latitude and Longitude and Diversity..................*/
							
						if(count==0)
						{
                        alpha1= df.formatCellValue(row.getCell(11))+" "+df.formatCellValue(row.getCell(13))+" "+df.formatCellValue(row.getCell(30))+" "+df.formatCellValue(row.getCell(36));
						//ciqchannel.put(count, df.formatCellValue(row.getCell(21)));
                        new CompareOtherValuesCDU30().compareOtherValues(file,alpha,alpha1,fileName);
						}
                        if(count==1)
                        {
                        beta1= df.formatCellValue(row.getCell(11))+" "+df.formatCellValue(row.getCell(13))+" "+df.formatCellValue(row.getCell(30))+" "+df.formatCellValue(row.getCell(36));;	
                        //ciqchannel.put(count, df.formatCellValue(row.getCell(21)));
                        new CompareOtherValuesCDU30().compareOtherValues(file,beta,beta1,fileName);
                        }
                        if(count==2)
                        {
                    	gamma1= df.formatCellValue(row.getCell(11))+" "+df.formatCellValue(row.getCell(13))+" "+df.formatCellValue(row.getCell(30))+" "+df.formatCellValue(row.getCell(36));
                    	//ciqchannel.put(count, df.formatCellValue(row.getCell(21)));
                    	new CompareOtherValuesCDU30().compareOtherValues(file,gamma,gamma1,fileName);
                        }
                        
						count1++;
					
						}
						
						ciqchannel.add(df.formatCellValue(row.getCell(28)));
						
						
						if(!sitecode.equals(df.formatCellValue(row.getCell(6))))
						{
							//new CiqColorsheetCDU301().ciqColorsheet1(file,"sitecode",fileName);
						}
						
						}
				}
				
		    	}
				catch(java.lang.NullPointerException ax)
			    {
			    	continue;
			    }
		    	
		    	
		    	}
					
/*  Start Comparing Channel....................................................*/		    
		    
		    for(int i=0;i<3;i++)
		    {
		    	
		    try {
		    dumpchannel1.add(dumpchannel.get(i));
		    }catch(Exception e)
		    {
              break;		   
		    }
		    }
		    
		   // System.out.println("outside of channel"+ciqchannel+" "+dumpchannel1);
		    if(ciqchannel.equals(dumpchannel1  )) {
		    	//System.out.println("channel match");
		    }
		    else
		    {
		    	new CiqColorsheetCDU301().ciqColorsheet1(file,"channel",fileName);
		    	//System.out.println("channel mismatch");
		    }
		    
		    System.out.println("Completed Task3............................>");
		    
		    
/* Start comparing Antenna Model........................................................................*/
		    //System.out.println(ciq_an);
		    
		    System.out.println(antenna_name+" "+ciq_antenna_name);
		    
		    if(!antenna_name.equals(ciq_antenna_name))
		    {
		    	new CiqColorsheetCDU301().ciqColorsheet1(file,"antenna_name",fileName);
		    }
		    LOGGER.log(Level.SEVERE, "2.5 TDD CDU30/ScheduleNameSiteCodeCDU30/ReadDump4CDU30/Earfcn2500CDU30/ReadCIQOtherValueCDU30", antenna_name+" "+ciq_antenna_name);
		    
		   
		    
		    
		    
		    
		    
		    
		    
/* End Game.................................................................................*/		    
		    
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
