package sta.ninteenthhundred.cdu30.technology.com;

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
import sta1900.fdd.technology.com.CiqColorsheet1900FDD1;
import sta1900.fdd.technology.com.CompareArfcn1900FDD;

public class ReadCIQOtherValues1900CDU30 {

	private static final Logger LOGGER = Logger.getLogger(Ciqframe.class.getName());
	@SuppressWarnings("unlikely-arg-type")
	public void readCIQValue(String channel, HashMap<String, String> hmValues, HashSet<String> antenna_name, File file, Object cascade, String fileName, String sitecode) throws java.lang.NullPointerException
	{
		try {
			
				
			LOGGER.setLevel(Level.ALL);
			
			//FileInputStream file = new FileInputStream(new File("C:\\Users\\esatnir\\Videos\\CIQ\\Complete PT03XC150 STA 2.5 TDD  for BBU No_ 1 2018_07_16_15_57_01.xlsx"));
			 
			String str1[]= channel.split(",");
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
						
					
						/*if(df.formatCellValue(row.getCell(20)).equals("1900"))
						{*/
							
						
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
                        new CompareOtherValues1900CDU30().compareOtherValues(file,alpha,alpha1,fileName);
						}
                        if(count==1)
                        {
                        beta1= df.formatCellValue(row.getCell(11))+" "+df.formatCellValue(row.getCell(13))+" "+df.formatCellValue(row.getCell(30))+" "+df.formatCellValue(row.getCell(36));;	
                        //ciqchannel.put(count, df.formatCellValue(row.getCell(21)));
                        new CompareOtherValues1900CDU30().compareOtherValues(file,beta,beta1,fileName);
                        }
                        if(count==2)
                        {
                    	gamma1= df.formatCellValue(row.getCell(11))+" "+df.formatCellValue(row.getCell(13))+" "+df.formatCellValue(row.getCell(30))+" "+df.formatCellValue(row.getCell(36));
                    	//ciqchannel.put(count, df.formatCellValue(row.getCell(21)));
                    	new CompareOtherValues1900CDU30().compareOtherValues(file,gamma,gamma1,fileName);
                        }
                        
						count1++;
					
						}
						
						ciqchannel.add(df.formatCellValue(row.getCell(28)));
						}
						/*else 
							new CiqColorsheet1900CDU301().ciqColorsheet1(file, "band", fileName);
						*/
						
						
						
					}
				}
				
		    	
				catch(java.lang.NullPointerException ax)
			    {
			    	continue;
			    }
		    	
		    	
		    	}
					
/*  Start Comparing Channel....................................................*/		    
		    
		    int counter=0;
		    for(int i=0;i<str1.length;i++)
		    {
		    	
		    try {
		    	//System.out.println("Start checking........");
		    	for(String s: ciqchannel)
		    		if(s.equals(str1[i]))
		    		{
		    			//System.out.println("Match");
		    			counter++;
		    		}
		    			
		   dumpchannel1.add(str1[i]);
		   
		   
		   
		   
		    }catch(Exception e)
		    {
              break;		   
		    }
		    }
		   // System.out.println(ciqchannel.isEmpty()+" "+!ciqchannel.isEmpty());
		    System.out.println(ciqchannel+" "+dumpchannel1);
		    //System.out.println(ciqchannel.first().equals(dumpchannel1.last()));
		    if(!ciqchannel.isEmpty())
		    {
		    	if(!dumpchannel1.isEmpty())
		    	{
		    //if((ciqchannel.first().equals(dumpchannel1.last()) && ciqchannel.size()==1) || (dumpchannel1.size()==1 && ciqchannel.equals(dumpchannel1))) {}
		   if(counter==ciqchannel.size())
		   {
			   System.out.println("channel match");
		   }
		    		else
		    	new CiqColorsheet1900CDU301().ciqColorsheet1(file,"channel",fileName);
		    	}
		    	else
		    	new CiqColorsheet1900CDU301().ciqColorsheet1(file,"channel",fileName);
		    }
		    else
		    	new CiqColorsheet1900CDU301().ciqColorsheet1(file,"channel",fileName);
		    
		  
		    
/* Start comparing Antenna Model........................................................................*/
		    
		    System.out.println(antenna_name+" "+ciq_antenna_name);
		    
		    LOGGER.log(Level.SEVERE, "1900 FDDCDU30/ScheduleNameSiteCode1900CDU30/ReadDump41900CDU30/Earfcn1900CDU30/ReadCIQOtherValue1900CDU30", antenna_name+" "+ciq_antenna_name);
		    if(!antenna_name.equals(ciq_antenna_name))
		    {
		    	new CiqColorsheet1900CDU301().ciqColorsheet1(file,"antenna_name",fileName);
		    }
		    
		    
		    
		    
		    new CompareArfcn1900CDU30().compareArfcn800FDD(file,channel,fileName);
		    
		    System.out.println("Completed Task3............................>"+dumpchannel1.first());
/* End .................................................................................*/		    
		    
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
