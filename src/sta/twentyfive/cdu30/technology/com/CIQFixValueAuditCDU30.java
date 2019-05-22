package sta.twentyfive.cdu30.technology.com;

import java.io.File
;


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

public class CIQFixValueAuditCDU30 {
	//private static final FillPatternType CellStyle = null;
	private static final Logger LOGGER = Logger.getLogger(Ciqframe.class.getName());

	public void cIQFixValueAudit(File file, String fileName, Object cascade) 
	{
		try
		{

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
	//System.out.println("Yes"+cascade);
	
	String Bandwidth="20";
	String satellite = null ,Lsmr = null,LsmN = null,LsmS = null,Eutran,Eutran_id = null,Rrh,Electrical,Mechanical,StratE,Carrier = null,Frame = null,Trackingcode = null,Puncturing = null,Cabinet = null,AntennaVendor = null;
    String cell_Id = "";
    List<String> lst = null;
    lst=new ArrayList<String>();
    //lst1=new ArrayList<String>();
    int a=0;
    int Vlan=0;
    int rrhcount=0;
   
    /*Reading CIQ .............................................................................*/
        int rownum=0;
    for (int j = 1; j < sheet.getLastRowNum() + 1; j++) {
    	
    	try 
    	{
    	
		Row row = sheet.getRow(j);
		//int st=Integer.parseInt(df.formatCellValue(row.getCell(1)));
		int flag = 0;
		
		int num = 0;
			
		for (int k = 1; k <= 1; k++) {
			
			
           
			
			String str = df.formatCellValue(row.getCell(k));

			String s = "";
			
			if ((!str.equals(cascade)) && flag == 0) {

				

				break;
			} else {
				
				
				
				   rownum++;
				
	 /* Matching Cascade........................................................................*/
					
					
					/*if(df.formatCellValue(row.getCell(1)).equals(cascade)) {}
					else
						new CiqColorsheetCDU301().ciqColorsheet1(file, "cascade", fileName);
								*/
	/* Matching Other Values...............................................................*/
					
				flag = 1;
				cell_Id = df.formatCellValue(row.getCell(22));
				lst.add(cell_Id);
				count = Integer.parseInt(df.formatCellValue(row.getCell(21)));
				if (count == count1 && count1 < 3)
				{
		        count1++;
		        
		       // if(df.formatCellValue(row.getCell(28)).equals("1"))
		        	
		        }
				
				//System.out.println("count1="+count1);
				diversity.add(df.formatCellValue(row.getCell(30)));
				eNB_id.add(df.formatCellValue(row.getCell(8)));
			    antenna_counter.add(df.formatCellValue(row.getCell(36)));
				phycell.add(df.formatCellValue(row.getCell(24)));
				rsi.add(df.formatCellValue(row.getCell(25)));
			    channelcounter.add(df.formatCellValue(row.getCell(28)));	
				
	/* VLAN_Check.....................................................................................*/			
				
			   // System.out.println("hi");
				if(df.formatCellValue(row.getCell(44)).equals("34") && df.formatCellValue(row.getCell(47)).equals("42")){
					//System.out.print("\tVLAN is Match");
				}
				else
					new CiqColorsheetCDU301().ciqColorsheet1(file,"VLAN", fileName);
					
				
				if(df.formatCellValue(row.getCell(26)).equals("20"))
				{}  // System.out.println("inside 20");                                 }
				
				else
					new CiqColorsheetCDU301().ciqColorsheet1(file, "bandwidth", fileName);
				
				
				
	/*			
	 ENODEB_Name..............................................................................*/			
				String enb_id=df.formatCellValue(row.getCell(8));
				String Network_sitecode=df.formatCellValue(row.getCell(6));
				String enode_name=Network_sitecode+"BBULTE0"+enb_id;
				//System.out.println(enode_name.equals(df.formatCellValue(row.getCell(9))));
				
				
				if(enode_name.equals(df.formatCellValue(row.getCell(9)))){
					//System.out.print("\tEnodeB_Name is Match");
					
				}
				else
				{
						new CiqColorsheetCDU301().ciqColorsheet1(file,"EnodeB",fileName);
				}
				
				
				
   /* RRH ..................................................................................*/
				
			//System.out.println(df.formatCellValue(row.getCell(12)).equals("1"));
			if(df.formatCellValue(row.getCell(17)).equals("1"))
				rrhcount++;
				
				
				
				
			
/*	 FIX Value..............................................................................*/		
				//System.out.println(df.formatCellValue(row.getCell(3)).equals(""));
				//System.out.println(row.getCell(3)==null);
				
				
			if(row.getCell(2)==null || df.formatCellValue(row.getCell(2)).equals(""))
				new CiqColorsheetCDU301().ciqColorsheet1(file,"market",fileName);
			
			if(row.getCell(3)==null || df.formatCellValue(row.getCell(3)).equals(""))
				new CiqColorsheetCDU301().ciqColorsheet1(file,"market_id",fileName);
			
				if(row.getCell(4)==null || df.formatCellValue(row.getCell(4)).equals(""))
					new CiqColorsheetCDU301().ciqColorsheet1(file,"LSR",fileName);
				
				if(row.getCell(5)==null || df.formatCellValue(row.getCell(5)).equals(""))
					new CiqColorsheetCDU301().ciqColorsheet1(file,"LSM",fileName);
				
				if(row.getCell(7)==null || df.formatCellValue(row.getCell(7)).equals(""))
					new CiqColorsheetCDU301().ciqColorsheet1(file,"LSM_IP",fileName);
				
				if(row.getCell(10)==null || df.formatCellValue(row.getCell(10)).equals(""))
					new CiqColorsheetCDU301().ciqColorsheet1(file,"Cabinet",fileName);
				
				if(row.getCell(11)==null || df.formatCellValue(row.getCell(11)).equals(""))
					new CiqColorsheetCDU301().ciqColorsheet1(file,"Eutran_Id",fileName);
				
				if(row.getCell(12)==null || df.formatCellValue(row.getCell(12)).equals(""))
					new CiqColorsheetCDU301().ciqColorsheet1(file,"Latitude_Ns",fileName);
				
				if(row.getCell(14)==null || df.formatCellValue(row.getCell(14)).equals(""))
					new CiqColorsheetCDU301().ciqColorsheet1(file,"Latitude_Ws",fileName);
				
				if(row.getCell(11)==null || df.formatCellValue(row.getCell(11)).equals(""))
					new CiqColorsheetCDU301().ciqColorsheet1(file,"Eutran_Id",fileName);
				
				if(row.getCell(15)==null || df.formatCellValue(row.getCell(15)).equals(""))
					new CiqColorsheetCDU301().ciqColorsheet1(file,"Trackcode",fileName);
				
				if(row.getCell(16)==null || df.formatCellValue(row.getCell(16)).equals(""))
					new CiqColorsheetCDU301().ciqColorsheet1(file,"Tac_Hex",fileName);
				
				if(row.getCell(17)==null || df.formatCellValue(row.getCell(17)).equals(""))
					new CiqColorsheetCDU301().ciqColorsheet1(file,"RRH",fileName);
				
				if(row.getCell(18)==null || df.formatCellValue(row.getCell(18)).equals(""))
				{
					System.out.println("Inside RRHModel");
					new CiqColorsheetCDU301().ciqColorsheet1(file,"RRHModel",fileName);
				}
				
				
				if(row.getCell(19)==null || df.formatCellValue(row.getCell(19)).equals(""))
					new CiqColorsheetCDU301().ciqColorsheet1(file,"RRH_Top",fileName);
				
				if(row.getCell(20)==null || df.formatCellValue(row.getCell(20)).equals("") || !df.formatCellValue(row.getCell(20)).equals("2500"))
					new CiqColorsheetCDU301().ciqColorsheet1(file,"band",fileName);
				
				if(row.getCell(23)==null || df.formatCellValue(row.getCell(23)).equals(""))
					new CiqColorsheetCDU301().ciqColorsheet1(file,"Eutran",fileName);
				
				
				if(row.getCell(27)==null || df.formatCellValue(row.getCell(27)).equals(""))
				    new CiqColorsheetCDU301().ciqColorsheet1(file,"SEarfcn",fileName);
				
				
				if(row.getCell(29)==null || df.formatCellValue(row.getCell(29)).equals(""))
				    new CiqColorsheetCDU301().ciqColorsheet1(file,"UEarfcn",fileName);
				
				
				if(row.getCell(31)==null || df.formatCellValue(row.getCell(31)).equals(""))
				    new CiqColorsheetCDU301().ciqColorsheet1(file,"Initiate",fileName);
				
				
				if(row.getCell(32)==null || df.formatCellValue(row.getCell(32)).equals(""))
				{
					//System.out.println("inside career");
					new CiqColorsheetCDU301().ciqColorsheet1(file,"Career",fileName);
				}
				
				if(row.getCell(33)==null || df.formatCellValue(row.getCell(33)).equals(""))
				{
					//System.out.println("Inside Frame");
					new CiqColorsheetCDU301().ciqColorsheet1(file,"Frame",fileName);
				}
				
				
				if(row.getCell(35)==null || df.formatCellValue(row.getCell(35)).equals(""))
					new CiqColorsheetCDU301().ciqColorsheet1(file,"Avendor",fileName);
				
				

				if(row.getCell(37)==null || df.formatCellValue(row.getCell(37)).equals(""))
					new CiqColorsheetCDU301().ciqColorsheet1(file,"Electrical",fileName);
				
				if(row.getCell(38)==null || df.formatCellValue(row.getCell(38)).equals(""))
				{
					//System.out.println("Inside Mechanical");
					new CiqColorsheetCDU301().ciqColorsheet1(file,"Mechanical",fileName);
				}
				
				
		
				if(row.getCell(39)==null || df.formatCellValue(row.getCell(39)).equals(""))
				{
					//System.out.println("Inside Network_Mask");
					new CiqColorsheetCDU301().ciqColorsheet1(file,"Network_Mask",fileName);
				}
				
				
				if(row.getCell(40)==null || df.formatCellValue(row.getCell(40)).equals(""))
					new CiqColorsheetCDU301().ciqColorsheet1(file,"CSR_Hostname",fileName);
							
							
				if(row.getCell(41)==null || df.formatCellValue(row.getCell(41)).equals(""))
					new CiqColorsheetCDU301().ciqColorsheet1(file,"CSR_Type",fileName);
				
				if(row.getCell(42)==null || df.formatCellValue(row.getCell(42)).equals(""))
				{
					//System.out.println("Inside Csr_Port");
					new CiqColorsheetCDU301().ciqColorsheet1(file,"CSR_Port",fileName);
				
				}
				
				
				if(row.getCell(43)==null || df.formatCellValue(row.getCell(43)).equals(""))
					new CiqColorsheetCDU301().ciqColorsheet1(file,"Fiber_SFP",fileName);
				
				
				if(row.getCell(45)==null || df.formatCellValue(row.getCell(45)).equals(""))
					new CiqColorsheetCDU301().ciqColorsheet1(file,"CSR_OAM_IP",fileName);
				
				if(row.getCell(46)==null || df.formatCellValue(row.getCell(46)).equals(""))
				{
					//System.out.println("eNB_OAM");
					new CiqColorsheetCDU301().ciqColorsheet1(file,"eNB_OAM",fileName);
				}
				
				
				if(row.getCell(48)==null  || df.formatCellValue(row.getCell(48)).equals(""))
					new CiqColorsheetCDU301().ciqColorsheet1(file,"CSR_S_B",fileName);
				
				if(row.getCell(49)==null  || df.formatCellValue(row.getCell(49)).equals(""))
					new CiqColorsheetCDU301().ciqColorsheet1(file,"eNB_S_B",fileName);
				
				
				
				if(row.getCell(50)==null  || df.formatCellValue(row.getCell(50)).equals(""))
					new CiqColorsheetCDU301().ciqColorsheet1(file,"IP_R1",fileName);
				
				if(row.getCell(51)==null || df.formatCellValue(row.getCell(51)).equals(""))
					new CiqColorsheetCDU301().ciqColorsheet1(file,"IP_R2",fileName);
				
				if(row.getCell(52)==null || df.formatCellValue(row.getCell(52)).equals(""))
					new CiqColorsheetCDU301().ciqColorsheet1(file,"IP_R3",fileName);
				
				if(row.getCell(53)==null || df.formatCellValue(row.getCell(53)).equals(""))
					new CiqColorsheetCDU301().ciqColorsheet1(file,"IP_R4",fileName);
				
				if(row.getCell(54)==null || df.formatCellValue(row.getCell(54)).equals(""))
					new CiqColorsheetCDU301().ciqColorsheet1(file,"IP_R5",fileName);
				
				if(row.getCell(55)==null || df.formatCellValue(row.getCell(55)).equals(""))
					new CiqColorsheetCDU301().ciqColorsheet1(file,"IP_R6",fileName);
				
				if(row.getCell(56)==null || df.formatCellValue(row.getCell(56)).equals(""))
					new CiqColorsheetCDU301().ciqColorsheet1(file,"IP_R7",fileName);
				
				if(row.getCell(57)==null  || df.formatCellValue(row.getCell(57)).equals(""))
					new CiqColorsheetCDU301().ciqColorsheet1(file,"IP_R8",fileName);
				
				
			
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
    
    
    
   
  /*  PhyCell_ID.........................................................................*/
    //System.out.println(count1+" "+phycell.size());
    
    if(count1==phycell.size())
    {
    	//System.out.println("phycell Match");
    }
    else
    	new CiqColorsheetCDU301().ciqColorsheet1(file,"phycell",fileName);
    
    
   
    
    
    
   
    
    
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
    	new CiqColorsheetCDU301().ciqColorsheet1(file,"rsi",fileName);
    }
    
    
   
    
    /* Azimuth Verify ........................................................*/
    
    
    if(count1==antenna_counter.size())
    {}
    else
    	new CiqColorsheetCDU301().ciqColorsheet1(file, "azimuth", fileName);
    
    
    //System.out.println("eNB size="+eNB_id.size());
    if(eNB_id.size()==1) {}
    else
    	new CiqColorsheetCDU301().ciqColorsheet1(file, "eNB_id", fileName);
    
    
    
    
    
    /*  Verify rrh........................................................................*/
  
    
   /* Calling Second task.............................................................................*/ 
    
      
    
    
    String eNB_Id = null;     
     for(String st:eNB_id)
    	 eNB_Id=st;
     
     LOGGER.log(Level.SEVERE, "2.5 TDD CDU30/CIQFixValueAuditCDU30", lst);
   new ReadECSFBDUMPCDU30().readCIQ(file,cascade,fileName,eNB_Id,lst,count1,diversity);      
            
            
            
   
     
    /*END.......................................................................................*/     
            System.out.println("Complete Task1....................>");
           // return eNB_id.toString();
    
		    }catch(Exception e)
			{
				e.printStackTrace();
			}
		//return null;
	}

	

}
		
