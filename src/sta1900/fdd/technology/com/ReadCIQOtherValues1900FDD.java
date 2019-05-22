package sta1900.fdd.technology.com;

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
import sta.twentyfive.cdu30.technology.com.CiqColorsheetCDU301;

public class ReadCIQOtherValues1900FDD {

	private static final Logger LOGGER = Logger.getLogger(Ciqframe.class.getName());
	@SuppressWarnings("unlikely-arg-type")
	public void readCIQValue(String channel, HashMap<String, String> hmValues, HashSet<String> antenna_name, File file, Object cascade, String fileName, String sitecode) throws java.lang.NullPointerException
	{
		try {
			
				
			LOGGER.setLevel(Level.ALL);
			
		
			 
			String str1[]= channel.split(",");
		    XSSFWorkbook workbook = new XSSFWorkbook(file);

		    
		    
		    XSSFSheet sheet = workbook.getSheet("1900");
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
		    //System.out.println("fifth");
		    
		    for (int j = 1; j < a+1; j++) {
		    	try {
		    		
		    	
		    		//System.out.println("four");
				 row = sheet.getRow(j);
				int flag = 0;

				int num = 0;
				
				for (int k = 0; k <=0; k++) {

					
					String str = df.formatCellValue(row.getCell(k));

					String s = "";
					//System.out.println("first"+cascade+" "+str);
					if (!str.equals(cascade) && flag == 0) {

						

						break;
					} else {
						
					
						flag = 1;
						
						cell_Id = df.formatCellValue(row.getCell(10));
						count = Integer.parseInt(cell_Id);
						if (count == count1 && count1 < 3){
					
						//ciq_antenna_name.add(df.formatCellValue(row.getCell(34)));
							
/* Start Reading Azimuth, Antenna, Latitude and Longitude and Diversity..................*/
							
						if(count==0)
						{
                        alpha1= df.formatCellValue(row.getCell(12))+" "+df.formatCellValue(row.getCell(14))+" "+df.formatCellValue(row.getCell(33));
						//ciqchannel.put(count, df.formatCellValue(row.getCell(21)));
                        new CompareOtherValues1900FDD().compareOtherValues(file,alpha,alpha1,fileName);
						}
                        if(count==1)
                        {
                        beta1= df.formatCellValue(row.getCell(12))+" "+df.formatCellValue(row.getCell(14))+" "+df.formatCellValue(row.getCell(33));	
                        //ciqchannel.put(count, df.formatCellValue(row.getCell(21)));
                        new CompareOtherValues1900FDD().compareOtherValues(file,beta,beta1,fileName);
                        }
                        if(count==2)
                        {
                    	gamma1= df.formatCellValue(row.getCell(12))+" "+df.formatCellValue(row.getCell(14))+" "+df.formatCellValue(row.getCell(33));
                    	//ciqchannel.put(count, df.formatCellValue(row.getCell(21)));
                    	new CompareOtherValues1900FDD().compareOtherValues(file,gamma,gamma1,fileName);
                        }
                        
						count1++;
					
						}
						
						//System.out.println(df.formatCellValue(row.getCell(25)));
						ciqchannel.add(df.formatCellValue(row.getCell(26)));
						
						if(!sitecode.equals(df.formatCellValue(row.getCell(7))))
						{
							//new CiqColorsheet1900FDD1().ciqColorsheet1(file,"sitecode",fileName);
						}
						
				}
				}
				
		    	}
				catch(java.lang.NullPointerException ax)
			    {
			    	continue;
			    }
		    	
		    	
		    	}
					
/*  Start Comparing Channel............................................................*/		    
		    
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
		    	new CiqColorsheet1900FDD1().ciqColorsheet1(file,"channel",fileName);
		    	}
		    	else
		    	new CiqColorsheet1900FDD1().ciqColorsheet1(file,"channel",fileName);
		    }
		    else
		    	new CiqColorsheet1900FDD1().ciqColorsheet1(file,"channel",fileName);
		    
		    System.out.println("Completed Task3............................>"+dumpchannel1.first());
		    
		    
/* Start comparing Antenna Model........................................................................*/
		    
		    System.out.println(antenna_name);
		    
		    LOGGER.log(Level.SEVERE, "1900 FDD/ScheduleNameSiteCode1900FDD/ReadDump41900FDD/ReadCIQOtherValue1900FDD", "antenna_name= "+antenna_name);
		
		    new CompareArfcn1900FDD().compareArfcn800FDD(file,channel,fileName);
		    /*if(!antenna_name.equals(ciq_antenna_name))
		    {
		    	new CiqColorsheet800FDD1().ciqColorsheet1(file,"antenna_name",fileName);
		    }
		    */
		    
		    
		    
		    
		    
		    
/* End Game.................................................................................*/		    
		    
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
