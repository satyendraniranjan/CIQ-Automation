package sta.ninteenthhundred.cdu30.technology.com;
import java.io.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import com.monitorjbl.xlsx.StreamingReader;

import awt.file.lincense.com.Ciqframe;


public class ReadDump1900CDU304 {

	private static final Logger LOGGER = Logger.getLogger(Ciqframe.class.getName());
	public  void readDump4(File file, Object cascade, String fileName, String band, String scheduleName, String sitecode) {
		// TODO Auto-generated method stub
		try {
			LOGGER.setLevel(Level.ALL);
			
			DataFormatter df = new DataFormatter();
			 HashMap<Integer, String> hm= new HashMap<>();
			    HashMap<Integer, String> hm2= new HashMap<>();
			    HashMap<Integer, String> hm1= new HashMap<>();
			    HashMap<Integer, String> hm3 = new HashMap<>();
			    HashMap<Integer, String> hm4 = new HashMap<>();
			    HashMap<Integer, String> hm5 = new HashMap<>();
			    HashMap<Integer, String> hm6 = new HashMap<>();
			    HashMap<Integer, String> hm7 = new HashMap<>();
			    HashMap<Integer, String> hm8 = new HashMap<>();
			    HashMap<Integer, String> hm9 = new HashMap<>();
			    HashMap<Integer, String>hm10 = new HashMap<>();
			    HashMap<Integer, String>hm11 = new HashMap<>();
			    HashMap<String,String> hmValues=new HashMap<>();
			    HashSet<String> allantenna_name= new HashSet<>();
			    HashSet<String> backhaul= new HashSet<>();
			    String Values=null;
			    String channel = null;
		
		File f = new File("C:\\Users\\esatnir\\Videos\\sprint\\Sprint Vision.xlsx");
		Workbook workbook = StreamingReader.builder()
		        .rowCacheSize(100)    // number of rows to keep in memory (defaults to 10)
		        .bufferSize(4096)     // buffer size to use when reading InputStream to file (defaults to 1024)
		        .open(f);       // InputStream or File for XLSX file (required)
		
		Sheet sheet = workbook.getSheetAt(0);	  
		int count=0,count1=0,count2=0,count3=0,count4=0,count5=0,count6=0,count7=0,count8=0,count9=0,count10=0,count11=0;
		int row=-1;
		
		
		
		
/* Start Reading File....................................................*/		
			 
		for (Row r : sheet) {
				  int flag = 0;
				  
				 
				  for(Cell c:r)
	           {
                  
						String str = c.getStringCellValue();

						String s = "";
						
						if (!str.equals(cascade) && flag == 0) {

							

							break;
						} else {
							
							row=r.getRowNum();
							flag = 1;
							
							
/* Start Reading Column.............................................*/							
							
								 if(c.getColumnIndex()==4)
				                  {
									 //System.out.println("hi"+c.getStringCellValue());
									 hm.put(count, c.getStringCellValue());
				                	 // System.out.print(hm);
				                  }
								  else if(c.getColumnIndex()==7)
								 {
									 hm1.put(count, c.getStringCellValue());    //
								 }
								 else if(c.getColumnIndex()==6)                
								 {
									 hm2.put(count, c.getStringCellValue());    //   
								 }
								 else if(c.getColumnIndex()==8)
								 {
									 hm3.put(count, c.getStringCellValue());   // 
								 }
								 else if(c.getColumnIndex()==3)
								 {
									 hm4.put(count, c.getStringCellValue());  //RFDS:Site Latitude RF Atoll
								 }
								 else if(c.getColumnIndex()==2)
								 {
									 hm5.put(count, c.getStringCellValue());  //RFDS:Site Longitude RF Atoll
								 }
								 else if(c.getColumnIndex()==1)
								 {
									 count++;
									 hm6.put(count, c.getStringCellValue());   // Backhaul
								 }
								 
								 else if(c.getColumnIndex()==9)
								 {
									 hm7.put(count, c.getStringCellValue());  //RSEC:Antenna1 Model
								     //allantenna_name.add(hm7.get(count));
								 }
								 else if(c.getColumnIndex()==11)
								 {
									 hm8.put(count, c.getStringCellValue());   // Diversity
								 }
								 else if(c.getColumnIndex()==12)
								 {
									 hm9.put(count, c.getStringCellValue());  //  Azimuth
								 }
								 else if(c.getColumnIndex()==4)
								 {
									 //hm10.put(count, c.getStringCellValue());
								 }
								 else if(c.getColumnIndex()==18)
								 {
									// hm11.put(count, c.getStringCellValue());
								 }
								 
	                          }
							
							// System.out.println();
							
						}
                    //count++;
				  
				 // System.out.println();
			  }
		
			 
/* Start Getting Specific Values.................................................*/
		//System.out.println(count);
		//System.out.println(scheduleName+" "+hm1.entrySet()+" "+hm2.entrySet()+" "+hm3.entrySet()+" "+hm4.entrySet()+" "+hm5.entrySet()+" "+hm6.entrySet()+" "+hm7.entrySet()+" "+hm8.entrySet()+" "+hm9.entrySet());
		
		HashSet<String> antenna_name=new HashSet<>();
		int flag2500=0;
			  for(int i=1;i<=count;i++)
			    {
			    try
			    {
			    	if(hm.get(i).contains(scheduleName) )
			    	{
			    		allantenna_name.add(hm7.get(i));
			    		if(hm1.get(i).contains("1900"))
			    		{
			    			flag2500=1;
			    			//System.out.println(hm2.get(i).contains("Gamma"));
			    			if(hm2.get(i).contains("Alpha"))
			    			{
			    				antenna_name.add(hm7.get(i));
			    				backhaul.add(hm6.get(i));
			    				//	hm1.get(i).contains("800")
			    				Values=hm4.get(i)+" "+hm5.get(i)+" "+hm8.get(i)+" "+hm9.get(i);
			    		//new ReadCIQOtherValues().readCIQValue(values);
			    				//hm6.get(i);
			    				hmValues.put("Alpha", Values);
			    				//new Earfcn().earfcn(hm3.get(i));
			    			channel=hm3.get(i);
			    				
			    			}
			    			else if (hm2.get(i).contains("Beta"))
			    			{
			    				antenna_name.add(hm7.get(i));
			    				backhaul.add(hm6.get(i));
			    			
			    				Values=hm4.get(i)+" "+hm5.get(i)+" "+hm8.get(i)+" "+hm9.get(i);
			                    hmValues.put("Beta", Values);
			                    //+" "+hm6.get(i)
			    			}
			    			
			    			else if(hm2.get(i).contains("Gamma"))
			    			{
			    				//System.out.println("Yes");
			    				antenna_name.add(hm7.get(i));
			    				backhaul.add(hm6.get(i));
			    				Values=hm4.get(i)+" "+hm5.get(i)+" "+hm8.get(i)+" "+hm9.get(i);
			                    hmValues.put("Gamma", Values);
			                    //+" "+hm6.get(i)
			    		    }
			    			
			    		}
			    	}
			    	
			    	
			    }catch(java.lang.NullPointerException ax)
				{
					LOGGER.log(Level.SEVERE, "2.5 TDD CDU20/CIQFixValueAudit/ReadECSFBDUMP", ax);
				}
				
            	catch(java.lang.NumberFormatException ax1)
				{
					LOGGER.log(Level.SEVERE, "2.5 TDD CDU20/CIQFixValueAudit/ReadECSFBDUMP", ax1);
				}
		    		
			    	
			    	
			    	
			    }
			    
			  
			  //System.out.println(antenna_name);
			  //channel = channel.replaceAll("\\s","");
			 // System.out.println(channel);
			  System.out.println("Antenna_Name= "+antenna_name+" "+"Finalized backhaul Value= "+backhaul);
			  
			  try
			  {
			  channel = ((String) channel).replaceAll("\\s","");
			  System.out.println(channel);
			  LOGGER.log(Level.SEVERE, "1900 FDDCDU30/ScheduleNameSiteCode1900CDU30/ReadDump41900CDU30", channel+" "+"Finalized backhaul Value= "+backhaul);
			 
			  }
			  catch(java.lang.NullPointerException ax)
			  {
				  ax.printStackTrace();
			  }
			  
			  
			  if(flag2500==0 || channel.equals("") || channel.equals(null))
			  {
				  new CiqColorsheet1900CDU301().ciqColorsheet1(file,"diversity",fileName);
	    			new CiqColorsheet1900CDU301().ciqColorsheet1(file,"azimuth",fileName);
	    			new CiqColorsheet1900CDU301().ciqColorsheet1(file,"channel",fileName);
	    			new CiqColorsheet1900CDU301().ciqColorsheet1(file,"antenna_name",fileName);
			  }
			  else
			  {
				  
			  if(antenna_name.contains("Antenna assigned on a different band"))
				  for(String st:allantenna_name)
				  {
				  if(!st.equals("Antenna assigned on a different band") && !st.equals("Existing Antenna"))
				  {
					  antenna_name.clear();
					  antenna_name.add(st);
				  }
				  }
			  
			  
			  LOGGER.log(Level.SEVERE, "1900 FDDCDU30/ScheduleNameSiteCode1900CDU30/ReadDump1900CDU30", hmValues+" "+antenna_name);
			  new ReadCIQOtherValues1900CDU30().readCIQValue(channel,hmValues,antenna_name,file,cascade,fileName,sitecode);
			  //new Earfcn2500800CDU30().earfcn(channel,hmValues,antenna_name,file,cascade,fileName,sitecode);
			  }
			//System.out.println(hm2.entrySet());
			//System.out.println(hmValues.entrySet());
			//System.out.println(hm2.get(i).contains("Gamma"));  
			
			  
			  
			  
			  
	/* End Game..........................................................*/		  
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		}

}
