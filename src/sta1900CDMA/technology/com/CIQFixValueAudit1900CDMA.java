package sta1900CDMA.technology.com;

import java.io.File;



import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import awt.file.lincense.com.Ciqframe;
import sta.ninteenthhundred.cdu30.technology.com.CiqColorsheet1900CDU301;
import sta800CDMA.technology.com.MatchPaiValues;
import sta800CDMA.technology.com.MatchSwitchMscPair;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;

public class CIQFixValueAudit1900CDMA {
	//private static final FillPatternType CellStyle = null;

	private static final Logger LOGGER = Logger.getLogger(Ciqframe.class.getName());
	public void cIQFixValueAudit(File file, String fileName, Object cascade) 
	{
		try
		{

			//System.out.println("Inside of CIQFixValueAudit800CDU30");
	//FileInputStream file = new FileInputStream(new File("C:\\Users\\esatnir\\Videos\\CIQ\\Complete PT03XC150 STA 2.5 TDD  for BBU No_ 1 2018_07_16_15_57_01.xlsx"));
	 
    
    XSSFWorkbook workbook = new XSSFWorkbook(file);

    
    
    XSSFSheet sheet = workbook.getSheetAt(0);
    DataFormatter df = new DataFormatter();
    HashSet<String> phycell= new HashSet<>();
    HashSet<String> rsi=new HashSet<>();
    HashSet<String> channelcounter= new HashSet<>();
    HashSet<String> antenna_counter= new HashSet<>();
    HashMap<Integer, String>hm= new HashMap<>();
    HashSet<String> bts_id= new HashSet<>();
    HashSet<String> diversity= new HashSet<>();
    HashSet<String> mscpair = new HashSet<>();
    HashSet<String> paiValues= new HashSet<>();
    String bsmname=null;
    String bts=null;
   
    int count = 0;
	int count1 = 0;
	//System.out.println("Yes"+cascade);
	
	String Bandwidth1="5";
	String Bandwidth2="10";
	
	//String MCC_ID="310";
	//String MNC_ID="120";
	String satellite = null ,Lsmr = null,LsmN = null,LsmS = null,Eutran,Eutran_id = null,Rrh,Electrical,Mechanical,StratE,Carrier = null,Frame = null,Trackingcode = null,Puncturing = null,Cabinet = null,AntennaVendor = null;
    String cell_Id = "";
    List<String> lst = null,lst1 = null,lst2,lst3,lst4,lst5;
    lst=new ArrayList<String>();
    lst1=new ArrayList<String>();
   
    
   
    int a=0;
    int Vlan=0;
    int Enode_name=0;
    int Fixed_value=0;
    int rrhcount=0;
   
  
    /*Reading CIQ .............................................................................*/
        int rownum=0;//Integer.toString(sheet.getLastRowNum());
      // System.out.println(sheet.getLastRowNum());
    
    for (int j = 1; j < sheet.getLastRowNum() + 1; j++) {
    	
    	try 
    	{
    	
		Row row = sheet.getRow(j);
		//int st=Integer.parseInt(df.formatCellValue(row.getCell(1)));
		int flag = 0;
		
		int num = 0;
			
		for (int k = 0; k <= 0; k++) {
			
			
           
			
			String str = df.formatCellValue(row.getCell(k));

			String s = "";
			
			if ((!str.equals(cascade)) && flag == 0) {

				

				break;
			} else {
				
				
				
				   rownum++;
				
	 
		/* Matching Other Values...............................................................*/
					
				flag = 1;
				//cell_Id = df.formatCellValue(row.getCell(22));
				//lst.add(cell_Id);
				count = Integer.parseInt(df.formatCellValue(row.getCell(10)));
				if (count == count1 && count1 < 3)
				{
		        count1++;
		        
		       // if(df.formatCellValue(row.getCell(28)).equals("1"))
		        	
		        }
				
				//System.out.println("count1="+count1);
				diversity.add(df.formatCellValue(row.getCell(41)));
				bts_id.add(df.formatCellValue(row.getCell(1)));
			    antenna_counter.add(df.formatCellValue(row.getCell(15)));
				//phycell.add(df.formatCellValue(row.getCell(24)));
				//rsi.add(df.formatCellValue(row.getCell(25)));
			    //channelcounter.add(df.formatCellValue(row.getCell(47)));
			    mscpair.add(df.formatCellValue(row.getCell(8)));
				bts=df.formatCellValue(row.getCell(1));
				bsmname=df.formatCellValue(row.getCell(3));
				paiValues.add(df.formatCellValue(row.getCell(42)));
				paiValues.add(df.formatCellValue(row.getCell(43)));
				paiValues.add(df.formatCellValue(row.getCell(44)));
				
	/* VLAN_Check.....................................................................................*/			
				
			   // System.out.println("hi");
				/*if(df.formatCellValue(row.getCell(44)).equals("16") && df.formatCellValue(row.getCell(47)).equals("24")){
					//System.out.print("\tVLAN is Match");
				}
				else
					new CiqColorsheet800CDMA301().ciqColorsheet1(file,"VLAN", fileName);
					*/
							
			
/*	 FIX Value..............................................................................*/		
				//System.out.println(df.formatCellValue(row.getCell(3)).equals(""));
				//System.out.println(row.getCell(3)==null);
				
			   if(row.getCell(2)==null || df.formatCellValue(row.getCell(2)).equals(""))
				new CiqColorsheet1900CDMA301().ciqColorsheet1(file,"market",fileName);
			
			   if(row.getCell(3)==null || df.formatCellValue(row.getCell(3)).equals(""))
				new CiqColorsheet1900CDMA301().ciqColorsheet1(file,"three",fileName);
			     
			
				
				if(row.getCell(4)==null || df.formatCellValue(row.getCell(4)).equals(""))
					new CiqColorsheet1900CDMA301().ciqColorsheet1(file,"four",fileName);
				
				if(row.getCell(5)==null || df.formatCellValue(row.getCell(5)).equals(""))
					new CiqColorsheet1900CDMA301().ciqColorsheet1(file,"five",fileName);
				
				if(row.getCell(6)==null || df.formatCellValue(row.getCell(6)).equals(""))
					new CiqColorsheet1900CDMA301().ciqColorsheet1(file,"six",fileName);
				
				if(row.getCell(7)==null || df.formatCellValue(row.getCell(7)).equals(""))
					new CiqColorsheet1900CDMA301().ciqColorsheet1(file,"seven",fileName);
				
				if(row.getCell(8)==null || df.formatCellValue(row.getCell(8)).equals(""))
					new CiqColorsheet1900CDMA301().ciqColorsheet1(file,"eight",fileName);
				
				if(row.getCell(9)==null || df.formatCellValue(row.getCell(9)).equals(""))
					new CiqColorsheet1900CDMA301().ciqColorsheet1(file,"nine",fileName);
				
				if(row.getCell(10)==null || df.formatCellValue(row.getCell(10)).equals(""))
					new CiqColorsheet1900CDMA301().ciqColorsheet1(file,"ten",fileName);
				
				if(row.getCell(11)==null || df.formatCellValue(row.getCell(11)).equals(""))
					new CiqColorsheet1900CDMA301().ciqColorsheet1(file,"PN_OFF",fileName);
				
				
				if(row.getCell(12)==null || df.formatCellValue(row.getCell(12)).equals(""))
					new CiqColorsheet1900CDMA301().ciqColorsheet1(file,"OTA_SID",fileName);
				
				if(row.getCell(13)==null || df.formatCellValue(row.getCell(13)).equals(""))
					new CiqColorsheet1900CDMA301().ciqColorsheet1(file,"OTA_NID",fileName);
				
				if(row.getCell(14)==null || df.formatCellValue(row.getCell(14)).equals(""))
					new CiqColorsheet1900CDMA301().ciqColorsheet1(file,"fourteen",fileName);
				
				
				if(row.getCell(15)==null || df.formatCellValue(row.getCell(15)).equals(""))
					new CiqColorsheet1900CDMA301().ciqColorsheet1(file,"azimuth",fileName);
				
				if(row.getCell(16)==null || df.formatCellValue(row.getCell(16)).equals(""))
					new CiqColorsheet1900CDMA301().ciqColorsheet1(file,"antenna",fileName);
				
				if(row.getCell(17)==null || df.formatCellValue(row.getCell(17)).equals(""))
					new CiqColorsheet1900CDMA301().ciqColorsheet1(file,"seventeen",fileName);
				
				if(row.getCell(18)==null || df.formatCellValue(row.getCell(18)).equals(""))
				{
					//System.out.println("Inside RRHModel");
					new CiqColorsheet1900CDMA301().ciqColorsheet1(file,"eighteen",fileName);
				}
				
				
				if(row.getCell(19)==null || df.formatCellValue(row.getCell(19)).equals(""))
					new CiqColorsheet1900CDMA301().ciqColorsheet1(file,"nineteen",fileName);
				
				if(row.getCell(20)==null || df.formatCellValue(row.getCell(20)).equals(""))
					new CiqColorsheet1900CDMA301().ciqColorsheet1(file,"twenty",fileName);
				
				if(row.getCell(21)==null || df.formatCellValue(row.getCell(21)).equals(""))
					new CiqColorsheet1900CDMA301().ciqColorsheet1(file,"twentyone",fileName);
				
				if(row.getCell(22)==null || df.formatCellValue(row.getCell(22)).equals(""))
					new CiqColorsheet1900CDMA301().ciqColorsheet1(file,"twentytwo",fileName);
				
				if(row.getCell(23)==null || df.formatCellValue(row.getCell(23)).equals(""))
					new CiqColorsheet1900CDMA301().ciqColorsheet1(file,"twentythree",fileName);
				
				if(row.getCell(24)==null || df.formatCellValue(row.getCell(24)).equals(""))
					new CiqColorsheet1900CDMA301().ciqColorsheet1(file,"twentyfour",fileName);
				
				if(row.getCell(25)==null || df.formatCellValue(row.getCell(25)).equals(""))
					new CiqColorsheet1900CDMA301().ciqColorsheet1(file,"twentyfive",fileName);
				
				if(row.getCell(26)==null || df.formatCellValue(row.getCell(26)).equals(""))
					new CiqColorsheet1900CDMA301().ciqColorsheet1(file,"twentysix",fileName);
				
				if((row.getCell(27)==null || df.formatCellValue(row.getCell(27)).equals("")))
				    new CiqColorsheet1900CDMA301().ciqColorsheet1(file,"twentyseven",fileName);
				
				if((row.getCell(28)==null || df.formatCellValue(row.getCell(28)).equals("")))
				    new CiqColorsheet1900CDMA301().ciqColorsheet1(file,"twentyeight",fileName);
				
				
			
				if(row.getCell(29)==null || df.formatCellValue(row.getCell(29)).equals(""))
				    new CiqColorsheet1900CDMA301().ciqColorsheet1(file,"twentynine",fileName);
				
				if(row.getCell(30)==null || df.formatCellValue(row.getCell(30)).equals(""))
				    new CiqColorsheet1900CDMA301().ciqColorsheet1(file,"thirty",fileName);
				
				
				if(row.getCell(31)==null || df.formatCellValue(row.getCell(31)).equals(""))
				    new CiqColorsheet1900CDMA301().ciqColorsheet1(file,"thirtyone",fileName);
				
				
				if(row.getCell(32)==null || df.formatCellValue(row.getCell(32)).equals(""))
				{
					//System.out.println("inside career");
					new CiqColorsheet1900CDMA301().ciqColorsheet1(file,"thirtytwo",fileName);
				}
				
				if(row.getCell(33)==null || df.formatCellValue(row.getCell(33)).equals(""))
				{
					//System.out.println("Inside Frame");
					new CiqColorsheet1900CDMA301().ciqColorsheet1(file,"thirtythree",fileName);
				}
				
				if(row.getCell(34)==null || df.formatCellValue(row.getCell(34)).equals(""))
				{
					//System.out.println("Inside Frame");
					new CiqColorsheet1900CDMA301().ciqColorsheet1(file,"thirtyfour",fileName);
				}
				
				
				if(row.getCell(35)==null || df.formatCellValue(row.getCell(35)).equals("") || !df.formatCellValue(row.getCell(35)).equals("1"))
					new CiqColorsheet1900CDMA301().ciqColorsheet1(file,"thirtyfive",fileName);
				
				if(row.getCell(36)==null || df.formatCellValue(row.getCell(36)).equals(""))
					new CiqColorsheet1900CDMA301().ciqColorsheet1(file,"thirtysix",fileName);

				if(row.getCell(37)==null || df.formatCellValue(row.getCell(37)).equals(""))
					new CiqColorsheet1900CDMA301().ciqColorsheet1(file,"thirtyseven",fileName);
				
				if(row.getCell(38)==null || df.formatCellValue(row.getCell(38)).equals(""))
				{
					//System.out.println("Inside Mechanical");
					new CiqColorsheet1900CDMA301().ciqColorsheet1(file,"thirtyeight",fileName);
				}
				
				
		
				if(row.getCell(39)==null || df.formatCellValue(row.getCell(39)).equals(""))
				{
					//System.out.println("Inside Network_Mask");
					new CiqColorsheet1900CDMA301().ciqColorsheet1(file,"thirtynine",fileName);
				}
				
				
				if(row.getCell(40)==null || df.formatCellValue(row.getCell(40)).equals(""))
					new CiqColorsheet1900CDMA301().ciqColorsheet1(file,"forty",fileName);
							
							
				if(row.getCell(41)==null || df.formatCellValue(row.getCell(41)).equals(""))
					new CiqColorsheet1900CDMA301().ciqColorsheet1(file,"fortyone",fileName);
				
				/*if(row.getCell(42)==null || df.formatCellValue(row.getCell(42)).equals(""))
				{
					//System.out.println("Inside Csr_Port");
					new CiqColorsheet800CDMA301().ciqColorsheet1(file,"CSR_Port",fileName);
				
				}
				
				
				if(row.getCell(43)==null || df.formatCellValue(row.getCell(43)).equals(""))
					new CiqColorsheet800CDMA301().ciqColorsheet1(file,"Fiber_SFP",fileName);
				*/
				
				if(row.getCell(45)==null || df.formatCellValue(row.getCell(45)).equals(""))
					new CiqColorsheet1900CDMA301().ciqColorsheet1(file,"fortyfive",fileName);
				
				if(row.getCell(46)==null || df.formatCellValue(row.getCell(46)).equals(""))
				{
					//System.out.println("eNB_OAM");
					new CiqColorsheet1900CDMA301().ciqColorsheet1(file,"fortysix",fileName);
				}
				
				
				if(row.getCell(47)==null  || df.formatCellValue(row.getCell(47)).equals(""))
				{
					//System.out.println("Mismatch");
					new CiqColorsheet1900CDMA301().ciqColorsheet1(file,"fortyseven",fileName);
				}
				
				if(row.getCell(48)==null  || df.formatCellValue(row.getCell(48)).equals(""))
					new CiqColorsheet1900CDMA301().ciqColorsheet1(file,"fortyeight",fileName);
				
				if(!df.formatCellValue(row.getCell(48)).equals("0"))
				{
					new CiqColorsheet1900CDMA301().ciqColorsheet1(file,"fortyeight",fileName);
				}
				
				if(row.getCell(49)==null  || df.formatCellValue(row.getCell(49)).equals(""))
					new CiqColorsheet1900CDMA301().ciqColorsheet1(file,"fourtynine",fileName);
				
				
				
				if(row.getCell(50)==null  || df.formatCellValue(row.getCell(50)).equals(""))
					new CiqColorsheet1900CDMA301().ciqColorsheet1(file,"fifty",fileName);
				
				if(row.getCell(51)==null || df.formatCellValue(row.getCell(51)).equals(""))
					new CiqColorsheet1900CDMA301().ciqColorsheet1(file,"fiftyone",fileName);
				
				if(row.getCell(52)==null || df.formatCellValue(row.getCell(52)).equals(""))
					new CiqColorsheet1900CDMA301().ciqColorsheet1(file,"fiftytwo",fileName);
				
				if(!df.formatCellValue(row.getCell(52)).equals("3"))
				{
					new CiqColorsheet1900CDMA301().ciqColorsheet1(file,"fiftytwo",fileName);
				}
				
				if(row.getCell(53)==null || df.formatCellValue(row.getCell(53)).equals(""))
					new CiqColorsheet1900CDMA301().ciqColorsheet1(file,"fiftythree",fileName);
				
				if(row.getCell(54)==null || df.formatCellValue(row.getCell(54)).equals(""))
					new CiqColorsheet1900CDMA301().ciqColorsheet1(file,"fiftyfour",fileName);
				
				if(row.getCell(55)==null || df.formatCellValue(row.getCell(55)).equals(""))
					new CiqColorsheet1900CDMA301().ciqColorsheet1(file,"fiftyfive",fileName);
				
				if(row.getCell(56)==null || df.formatCellValue(row.getCell(56)).equals(""))
					new CiqColorsheet1900CDMA301().ciqColorsheet1(file,"fiftysix",fileName);
				
				if(!df.formatCellValue(row.getCell(56)).equals("4"))
				{
					new CiqColorsheet1900CDMA301().ciqColorsheet1(file,"fiftysix",fileName);
				}
				
				if(row.getCell(57)==null  || df.formatCellValue(row.getCell(57)).equals(""))
					new CiqColorsheet1900CDMA301().ciqColorsheet1(file,"fiftyseven",fileName);
				
				if(row.getCell(58)==null  || df.formatCellValue(row.getCell(58)).equals(""))
					new CiqColorsheet1900CDMA301().ciqColorsheet1(file,"fiftyeight",fileName);
				
				if(row.getCell(59)==null  || df.formatCellValue(row.getCell(59)).equals(""))
					new CiqColorsheet1900CDMA301().ciqColorsheet1(file,"fiftynine",fileName);
				
				if(row.getCell(60)==null  || df.formatCellValue(row.getCell(60)).equals(""))
					new CiqColorsheet1900CDMA301().ciqColorsheet1(file,"sixty",fileName);
				
				if(row.getCell(61)==null  || df.formatCellValue(row.getCell(61)).equals(""))
					new CiqColorsheet1900CDMA301().ciqColorsheet1(file,"sixtyone",fileName);
				
				if(row.getCell(62)==null  || df.formatCellValue(row.getCell(62)).equals(""))
					new CiqColorsheet1900CDMA301().ciqColorsheet1(file,"sixtytwo",fileName);
				
				if(row.getCell(63)==null  || df.formatCellValue(row.getCell(63)).equals(""))
					new CiqColorsheet1900CDMA301().ciqColorsheet1(file,"sixtythree",fileName);
				
				if(row.getCell(64)==null  || df.formatCellValue(row.getCell(64)).equals(""))
					new CiqColorsheet1900CDMA301().ciqColorsheet1(file,"sixtyfour",fileName);
				
				if(row.getCell(65)==null  || df.formatCellValue(row.getCell(65)).equals(""))
					new CiqColorsheet1900CDMA301().ciqColorsheet1(file,"sixtyfive",fileName);
				
				if(row.getCell(66)==null  || df.formatCellValue(row.getCell(66)).equals(""))
					new CiqColorsheet1900CDMA301().ciqColorsheet1(file,"sixtysix",fileName);
				
				if(row.getCell(67)==null  || df.formatCellValue(row.getCell(67)).equals(""))
					new CiqColorsheet1900CDMA301().ciqColorsheet1(file,"sixtyseven",fileName);
				
				if(row.getCell(68)==null  || df.formatCellValue(row.getCell(68)).equals(""))
					new CiqColorsheet1900CDMA301().ciqColorsheet1(file,"sixtyeight",fileName);
				
				if(row.getCell(69)==null  || df.formatCellValue(row.getCell(69)).equals(""))
					new CiqColorsheet1900CDMA301().ciqColorsheet1(file,"sixtynine",fileName);
				
				if(row.getCell(70)==null  || df.formatCellValue(row.getCell(70)).equals(""))
					new CiqColorsheet1900CDMA301().ciqColorsheet1(file,"seventy",fileName);
				
				if(row.getCell(71)==null  || df.formatCellValue(row.getCell(71)).equals(""))
					new CiqColorsheet1900CDMA301().ciqColorsheet1(file,"seventyone",fileName);
				
				if(row.getCell(72)==null  || df.formatCellValue(row.getCell(72)).equals(""))
					new CiqColorsheet1900CDMA301().ciqColorsheet1(file,"seventytwo",fileName);
				
				if(!df.formatCellValue(row.getCell(72)).equals("1"))
				{
					new CiqColorsheet1900CDMA301().ciqColorsheet1(file,"seventytwo",fileName);
				}
				
				if(row.getCell(73)==null  || df.formatCellValue(row.getCell(73)).equals(""))
					new CiqColorsheet1900CDMA301().ciqColorsheet1(file,"seventythree",fileName);
				
				if(row.getCell(74)==null  || df.formatCellValue(row.getCell(74)).equals(""))
					new CiqColorsheet1900CDMA301().ciqColorsheet1(file,"seventyfour",fileName);
				
				if(row.getCell(75)==null  || df.formatCellValue(row.getCell(75)).equals(""))
					new CiqColorsheet1900CDMA301().ciqColorsheet1(file,"seventyfive",fileName);
				
				
				
			
			}
		}
		}catch(java.lang.NullPointerException ax)
		{
			continue;
		}
    	catch(java.lang.NumberFormatException ex)
    	{
    		continue;
    	}
    
    
    }
		
   
    //System.out.println(rownum+" "+count1);
    
    
    
  
    
    
  
    
    /* Azimuth Verify ........................................................*/
    
    
    /*if(count1==antenna_counter.size())
    {}
    else
    	new CiqColorsheet1900CDMA301().ciqColorsheet1(file, "azimuth", fileName);*/
    
    
    /*..................................MSC Pair....................................*/
    
 String st1 = null;
 
 String st2[]=null;
 
 
 String  pair1;
 String pair2;
    
    for(String st:mscpair)
    {
    	st1= st+"_"+bts;
    	st2= st.split("/");
    }
    
    
    pair1=st2[0];
    pair2=st2[1];
    String fabricate1= pair2+"/"+pair1+"_"+bts;
    pair1= pair1.replaceAll("\\s","");
    String fabricate= pair1+"/"+pair2+"_"+bts;
   
    
    System.out.println(st1);
    
    
    
    
   
    
   /* Calling Second task.............................................................................*/ 
    
      
    
    
    String eNB_Id = null;     
     for(String st:bts_id)
    	 eNB_Id=st;
     
     
     

     new MatchPaiValues1900CDMA().switchMscPair(file, fileName, cascade ,st1,paiValues,fabricate,fabricate1); 
     new MatchSwitchMscPair1900CDMA().matchSwithcMscPair(file, cascade, fileName,bsmname,mscpair);
     
     LOGGER.log(Level.SEVERE, "1900 CDMA/CIQFixValueAudit1900CDMA", lst);
     new staconnectivity1900CDMA().ipbh(file, cascade, fileName, eNB_Id, lst);      
            
            
            
   
     
    /*END.......................................................................................*/     
            System.out.println("Complete Task1....................>");
        
    
		    }catch(Exception e)
			{
				e.printStackTrace();
			}
		
	}

	

}
		
