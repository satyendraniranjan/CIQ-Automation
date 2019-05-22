package ciq.read.com;

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
import color.excel.com.CiqColorsheet1;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;

public class CIQFixValueAudit {
	//private static final FillPatternType CellStyle = null;
	private static final Logger LOGGER = Logger.getLogger(Ciqframe.class.getName());
	
	public void cIQFixValueAudit(File file, String fileName, Object cascade) 
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
    HashSet<String> carrier= new HashSet<>();
   
    int count = 0;
	int count1 = 0;

	
	String Bandwidth="20";
	String MCC_ID="310";
	String MNC_ID="120";
	String satellite = null ,Lsmr = null,LsmN = null,LsmS = null,Eutran,Eutran_id = null,Rrh,Electrical,Mechanical,StratE,Carrier = null,Frame = null,Trackingcode = null,Puncturing = null,Cabinet = null,AntennaVendor = null;
    String cell_Id = "";
    List<String> lst = null,lst1 = null,lst2,lst3,lst4,lst5;
    lst=new ArrayList<String>();
    lst1=new ArrayList<String>();
    String[] cellIdMatch1= {"0","1","2","3","4","5","6","7","8"};
    String cellIdMatch2[]= {"0","1","3","4","6","7"};
    String cellIdMatch3[]= {"0","3","6"};
    String cellIdMatch4[]= {"0","1","2","3","4","5",};
    //String cellIdMatch5[]= {"0","1","4","5"};
    //String cellIdMatch6[]= {"0","4"};
    String cellIdMatch7[]= {"0","1","2"};
    String cellIdMatch8[]= {"0","1","3","4"};
    //lst1.add(cellIdMatch1);
    
    int a=0;
    int Vlan=0;
    int Enode_name=0;
    int Fixed_value=0;
    int rrhcount=0;
   
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
			
		for (int k = 0; k <= 0; k++) {
			
			

			
			String str = df.formatCellValue(row.getCell(k));

			String s = "";
			
			if ((!str.equals(cascade)) && flag == 0) {

				

				break;
			} else {
				
				//System.out.println("No");
				
				   rownum++;
				
	 /* Matching Cascade........................................................................*/
					
					
					/*if(df.formatCellValue(row.getCell(0)).equals(cascade)) {}
					else
						new CiqColorsheet1().ciqColorsheet1(file, "cascade", fileName);*/
								
	/* Matching Other Values...............................................................*/
					
				flag = 1;
				cell_Id = df.formatCellValue(row.getCell(16));
				lst.add(cell_Id);
				count = Integer.parseInt(cell_Id);
				if (count == count1 && count1 < 3)
				{
		        count1++;
		        
		       // if(df.formatCellValue(row.getCell(28)).equals("1"))
		        	
		        }
				
				//System.out.println("count1="+count1);
				diversity.add(df.formatCellValue(row.getCell(28)));
				eNB_id.add(df.formatCellValue(row.getCell(6)));
			    antenna_counter.add(df.formatCellValue(row.getCell(13)));
				phycell.add(df.formatCellValue(row.getCell(17)));
				rsi.add(df.formatCellValue(row.getCell(18)));
			    channelcounter.add(df.formatCellValue(row.getCell(21)));	
			    carrier.add(df.formatCellValue(row.getCell(22)));
	/* VLAN_Check.....................................................................................*/			
				
			   // System.out.println("hi");
				if(df.formatCellValue(row.getCell(41)).equals("34") && df.formatCellValue(row.getCell(45)).equals("42")){
					//System.out.print("\tVLAN is Match");
				}
				else
					new CiqColorsheet1().ciqColorsheet1(file,"VLAN", fileName);
					
				
				if(df.formatCellValue(row.getCell(19)).equals("20"))
				{}
				else
					new CiqColorsheet1().ciqColorsheet1(file, "bandwidth", fileName);
				
				
				
	/*			
	 ENODEB_Name..............................................................................*/			
				String enb_id=df.formatCellValue(row.getCell(6));
				String Network_sitecode=df.formatCellValue(row.getCell(9));
				String enode_name=Network_sitecode+"BBULTE0"+enb_id;
				
				if(enode_name.equals(df.formatCellValue(row.getCell(7)))){
					//System.out.print("\tEnodeB_Name is Match");
				}
				else
					new CiqColorsheet1().ciqColorsheet1(file,"EnodeB", fileName);
				
				
				
				
   /* RRH ..................................................................................*/
				
			//System.out.println(df.formatCellValue(row.getCell(12)).equals("1"));
			if(df.formatCellValue(row.getCell(12)).equals("1"))
				rrhcount++;
				
				
				
				
			
/*	 FIX Value..............................................................................*/		
				//System.out.println(df.formatCellValue(row.getCell(3)).equals(""));
				//System.out.println(row.getCell(3)==null);
				
				
				
				if(row.getCell(3)==null || df.formatCellValue(row.getCell(3)).equals(""))
				{
					//System.out.println("yes");
					new CiqColorsheet1().ciqColorsheet1(file,"Satellite",fileName);	
				}
				
				if(row.getCell(4)==null || df.formatCellValue(row.getCell(4)).equals(""))
					new CiqColorsheet1().ciqColorsheet1(file,"LSR",fileName);
				
				if(row.getCell(5)==null || df.formatCellValue(row.getCell(5)).equals(""))
					new CiqColorsheet1().ciqColorsheet1(file,"LSM",fileName);
				
				if(row.getCell(8)==null || df.formatCellValue(row.getCell(8)).equals(""))
					new CiqColorsheet1().ciqColorsheet1(file,"LSM_IP",fileName);
				

				if(row.getCell(11)==null || df.formatCellValue(row.getCell(11)).equals(""))
					new CiqColorsheet1().ciqColorsheet1(file,"Eutran_Id",fileName);
				
				
				if(row.getCell(22)==null || df.formatCellValue(row.getCell(22)).equals(""))
					new CiqColorsheet1().ciqColorsheet1(file,"Career",fileName);
				
					
				
				if(row.getCell(23)==null || df.formatCellValue(row.getCell(23)).equals(""))
					new CiqColorsheet1().ciqColorsheet1(file,"Frame",fileName);
				
				
				if(row.getCell(26)==null || df.formatCellValue(row.getCell(26)).equals(""))
					new CiqColorsheet1().ciqColorsheet1(file,"Trackcode",fileName);
				
				if(row.getCell(27)==null || df.formatCellValue(row.getCell(27)).equals(""))
					new CiqColorsheet1().ciqColorsheet1(file,"Puncturing",fileName);
				
				if(row.getCell(29)==null || df.formatCellValue(row.getCell(29)).equals(""))
					new CiqColorsheet1().ciqColorsheet1(file,"Cabinet",fileName);
				
				if(row.getCell(31)==null || df.formatCellValue(row.getCell(31)).equals(""))
					new CiqColorsheet1().ciqColorsheet1(file,"Avendor",fileName);
				
				if(row.getCell(12)==null || df.formatCellValue(row.getCell(12)).equals(""))
					new CiqColorsheet1().ciqColorsheet1(file,"RRH",fileName);
				
				if(row.getCell(14)==null || df.formatCellValue(row.getCell(14)).equals(""))
					new CiqColorsheet1().ciqColorsheet1(file,"Electrical",fileName);
				
				if(row.getCell(15)==null || df.formatCellValue(row.getCell(15)).equals(""))
					new CiqColorsheet1().ciqColorsheet1(file,"Mechanical",fileName);
				
				if(row.getCell(20)==null || df.formatCellValue(row.getCell(20)).equals(""))
			    new CiqColorsheet1().ciqColorsheet1(file,"SEarfcn",fileName);
				
				if(row.getCell(10)==null || df.formatCellValue(row.getCell(10)).equals(""))
					new CiqColorsheet1().ciqColorsheet1(file,"Eutran",fileName);
				
				if(row.getCell(34)==null || df.formatCellValue(row.getCell(34)).equals(""))
					new CiqColorsheet1().ciqColorsheet1(file,"Network_Mask",fileName);
				
				if(row.getCell(35)==null || df.formatCellValue(row.getCell(35)).equals(""))
					new CiqColorsheet1().ciqColorsheet1(file,"CSR_Hostname",fileName);
				
				if(row.getCell(36)==null || df.formatCellValue(row.getCell(36)).equals(""))
					new CiqColorsheet1().ciqColorsheet1(file,"CSR_Type",fileName);
				
				if(row.getCell(37)==null || df.formatCellValue(row.getCell(37)).equals(""))
					new CiqColorsheet1().ciqColorsheet1(file,"CSR_Port",fileName);
				
				if(row.getCell(38)==null || df.formatCellValue(row.getCell(38)).equals(""))
					new CiqColorsheet1().ciqColorsheet1(file,"CSR_MGMT",fileName);
				
				if(row.getCell(39)==null || df.formatCellValue(row.getCell(39)).equals(""))
					new CiqColorsheet1().ciqColorsheet1(file,"DU_Fiber_CSR",fileName);
				
				if(row.getCell(40)==null || df.formatCellValue(row.getCell(40)).equals(""))
					new CiqColorsheet1().ciqColorsheet1(file,"Fiber_SFP",fileName);
				
				if(row.getCell(42)==null || df.formatCellValue(row.getCell(42)).equals(""))
					new CiqColorsheet1().ciqColorsheet1(file,"OAM_Prefix",fileName);
				
				if(row.getCell(43)==null || df.formatCellValue(row.getCell(43)).equals(""))
					new CiqColorsheet1().ciqColorsheet1(file,"CSR_OAM_IP",fileName);
				
				if(row.getCell(44)==null || df.formatCellValue(row.getCell(44)).equals(""))
					new CiqColorsheet1().ciqColorsheet1(file,"eNB_OAM",fileName);
				
				if(row.getCell(46)==null || df.formatCellValue(row.getCell(46)).equals(""))
					new CiqColorsheet1().ciqColorsheet1(file,"eNB_Prefix",fileName);
				
				if(row.getCell(47)==null  || df.formatCellValue(row.getCell(47)).equals(""))
					new CiqColorsheet1().ciqColorsheet1(file,"CSR_S_B",fileName);
				
				if(row.getCell(48)==null  || df.formatCellValue(row.getCell(48)).equals(""))
					new CiqColorsheet1().ciqColorsheet1(file,"eNB_S_B",fileName);
				
				if(row.getCell(49)==null  || df.formatCellValue(row.getCell(49)).equals(""))
					new CiqColorsheet1().ciqColorsheet1(file,"IP_R1",fileName);
				
				if(row.getCell(50)==null  || df.formatCellValue(row.getCell(50)).equals(""))
					new CiqColorsheet1().ciqColorsheet1(file,"IP_R2",fileName);
				
				if(row.getCell(51)==null || df.formatCellValue(row.getCell(51)).equals(""))
					new CiqColorsheet1().ciqColorsheet1(file,"IP_R3",fileName);
				
				if(row.getCell(52)==null || df.formatCellValue(row.getCell(52)).equals(""))
					new CiqColorsheet1().ciqColorsheet1(file,"IP_R4",fileName);
				
				if(row.getCell(53)==null || df.formatCellValue(row.getCell(53)).equals(""))
					new CiqColorsheet1().ciqColorsheet1(file,"IP_R5",fileName);
				
				if(row.getCell(54)==null || df.formatCellValue(row.getCell(54)).equals(""))
					new CiqColorsheet1().ciqColorsheet1(file,"IP_R6",fileName);
				
				if(row.getCell(55)==null || df.formatCellValue(row.getCell(55)).equals(""))
					new CiqColorsheet1().ciqColorsheet1(file,"IP_R7",fileName);
				
				if(row.getCell(56)==null || df.formatCellValue(row.getCell(56)).equals(""))
					new CiqColorsheet1().ciqColorsheet1(file,"IP_R8",fileName);
				
				
				if(row.getCell(57)==null || df.formatCellValue(row.getCell(57)).equals(""))
					new CiqColorsheet1().ciqColorsheet1(file,"EVC_BW",fileName);
				
				if(row.getCell(58)==null || df.formatCellValue(row.getCell(58)).equals(""))
					new CiqColorsheet1().ciqColorsheet1(file,"EVC_Type",fileName);
				
				if(row.getCell(59)==null || df.formatCellValue(row.getCell(59)).equals(""))
					new CiqColorsheet1().ciqColorsheet1(file,"Primary_IPA",fileName);
				
				if(row.getCell(60)==null || df.formatCellValue(row.getCell(60)).equals(""))
					new CiqColorsheet1().ciqColorsheet1(file,"BH_60",fileName);
				
				if(row.getCell(61)==null || df.formatCellValue(row.getCell(61)).equals(""))
					new CiqColorsheet1().ciqColorsheet1(file,"BH_61",fileName);
				
				if(row.getCell(62)==null || df.formatCellValue(row.getCell(62)).equals(""))
					new CiqColorsheet1().ciqColorsheet1(file,"BH_62",fileName);
				
				if(row.getCell(63)==null || df.formatCellValue(row.getCell(63)).equals(""))
				{   //System.out.println("hi");
					new CiqColorsheet1().ciqColorsheet1(file,"BH_63",fileName);
				}
				
				if(row.getCell(64)==null || df.formatCellValue(row.getCell(64)).equals(""))
					new CiqColorsheet1().ciqColorsheet1(file,"BH_64",fileName);
				
				if(row.getCell(65)==null || df.formatCellValue(row.getCell(65)).equals(""))
					new CiqColorsheet1().ciqColorsheet1(file,"BH_65",fileName);
				
				if(row.getCell(66)==null || df.formatCellValue(row.getCell(66)).equals(""))
					new CiqColorsheet1().ciqColorsheet1(file,"BH_66",fileName);
				
				if(row.getCell(67)==null || df.formatCellValue(row.getCell(67)).equals(""))
					new CiqColorsheet1().ciqColorsheet1(file,"BH_67",fileName);
				
				if(row.getCell(68)==null || df.formatCellValue(row.getCell(6)).equals(""))
					new CiqColorsheet1().ciqColorsheet1(file,"BH_68",fileName);
				
				if(row.getCell(69)==null || df.formatCellValue(row.getCell(69)).equals(""))
					new CiqColorsheet1().ciqColorsheet1(file,"BH_69",fileName);
				
				if(row.getCell(70)==null || df.formatCellValue(row.getCell(70)).equals(""))
					new CiqColorsheet1().ciqColorsheet1(file,"BH_70",fileName);
				
				/*if(row.getCell(71)==null)
					new CiqColorsheet1().ciqColorsheet1(file,"BH_70",fileName);*/
				
				
				if(df.formatCellValue(row.getCell(24)).equals(MCC_ID))
				{
					//System.out.print("\tMCC_ID is Equal");
				}
				else new CiqColorsheet1().ciqColorsheet1(file,"MCC_ID",fileName);
				
				
				if(df.formatCellValue(row.getCell(25)).equals(MNC_ID))
				{
					//System.out.print("\tMNC_ID is Equal");
					
				}else
				new CiqColorsheet1().ciqColorsheet1(file,"MNC_ID",fileName);
					
				//System.out.println();
				//count1++;
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
		
   
   // System.out.println(rownum);
    
    
    
  
    
    
    /* Start Checking Carrier_Aggregation.........................................................*/
    //System.out.println(channelcounter+" "+carrier.toString());
   // System.out.println(!carrier.contains("Yes"));
    
    if(channelcounter.size()==1)
    {
    	if(!carrier.contains("No") && !carrier.contains("NO"))
    		new CiqColorsheet1().ciqColorsheet1(file,"Career",fileName);	
    	
    }
    else if(channelcounter.size()==2 || channelcounter.size()==3)
    {
    	if(!carrier.contains("Yes") && !carrier.contains("YES"))
    	new CiqColorsheet1().ciqColorsheet1(file,"Career",fileName);
    }
    
    
    
    
  /*  PhyCell_ID.........................................................................*/
    //System.out.println(count1+" "+phycell.size());
    
    if(count1==phycell.size())
    {
    	//System.out.println("phycell Match");
    }
    else
    	new CiqColorsheet1().ciqColorsheet1(file,"phycell",fileName);
    
    
   
    
    
    
   
    
    
  /*  RSI...................................................................................*/
   
    int[]  diff=new int[3];
    int p=0;
    int d;
    int rsiflag=0;
    //System.out.println("rsi="+rsi.size());
    if(rsi.size()!=1)
    {
    for(String s:rsi)
    { 
        	diff[p]=Integer.parseInt(s);
        	p++;
    }
 // System.out.println("diff length="+diff.length);
    	for(int j=0;j<diff.length;j++)
    	{
    		
    		for(int i=j+1;i<diff.length;i++)
    		{
    		//System.out.println(diff[j]+" "+diff[i]);
    		 d=Math.abs(diff[j]-diff[i]);
    		 //System.out.println("d="+d);
    		if(d<8)
    			rsiflag=1;
    		}
    	}
    
    }
    
    	//System.out.println("rsiflag="+rsiflag+"count1="+count1);
    if(count1==rsi.size() && rsiflag==0){}
    else{
    	new CiqColorsheet1().ciqColorsheet1(file,"rsi",fileName);
    }
    
    
   
    
    /* Azimuth Verify ........................................................*/
    
    
    if(count1==antenna_counter.size())
    {}
    else
    	new CiqColorsheet1().ciqColorsheet1(file, "azimuth", fileName);
    
    
    //System.out.println("eNB size="+eNB_id.size());
    if(eNB_id.size()==1) {}
    else
    	new CiqColorsheet1().ciqColorsheet1(file, "eNB_id", fileName);
    
    
    
    
    
    /*  Verify rrh........................................................................*/
    
    //System.out.println(count1+" "+rrhcount);
    if(diversity.contains("8T8R"))
    {
    	if(count1!=rrhcount)
    		new CiqColorsheet1().ciqColorsheet1(file, "RRH", fileName);	
    }
   
    
    
    else if(diversity.contains("4T4R"))
    {
    	if(count1==3)
    	{
    		if(rrhcount==2) {}
    	else
    		new CiqColorsheet1().ciqColorsheet1(file, "RRH", fileName);	
    	}
    	else if(count1==2 || count1==1)
    	{
    		if(rrhcount==1)
    		{}
    		else
    			new CiqColorsheet1().ciqColorsheet1(file, "RRH", fileName);	
    	}
    	
    		
    }
 
   
    else if(diversity.contains("2T2R"))
    {
    	if(rrhcount==1) {}
    	else
    		new CiqColorsheet1().ciqColorsheet1(file, "RRH", fileName);	
    }
 
    
   /* Calling Second task.............................................................................*/ 
    
      
    
    
    String eNB_Id = null;     
     for(String st:eNB_id)
    	 eNB_Id=st;
     
     LOGGER.log(Level.SEVERE, "2.5 TDD CDU20/CIQFixValueAudit", lst);
     
   new ReadEcsfbDump().readEcsfbDump(file,cascade,fileName,eNB_Id,lst);      
            
            
            
   
     
    /*END.......................................................................................*/     
            System.out.println("Complete Task1....................>");
            
            LOGGER.log(Level.SEVERE, "2.5 TDD CDU20/CIQFixValueAudit", "Complete Task1....................>");
            
		    }catch(Exception e)
			{
		    	 LOGGER.log(Level.SEVERE, "2.5 TDD CDU20/CIQFixValueAudit", e);
				e.printStackTrace();
			}
		    
		
	}

	

}
		
