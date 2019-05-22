package sta.Combine800fdd.technology.com;

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


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;

public class CIQFixValueAuditCombine800FDD {
	//private static final FillPatternType CellStyle = null;

	private static final Logger LOGGER = Logger.getLogger(Ciqframe.class.getName());
	public void cIQFixValueAudit(File file, String fileName, Object cascade) 
	{
		try
		{

			//System.out.println("Inside of CIQFixValueAudit800CDU30");
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
	//System.out.println("Yes"+cascade);
	
	String Bandwidth1="5";
	String Bandwidth2="3";
	
	String satellite = null ,Lsmr = null,LsmN = null,LsmS = null,Eutran,Eutran_id = null,Rrh,Electrical,Mechanical,StratE,Carrier = null,Frame = null,Trackingcode = null,Puncturing = null,Cabinet = null,AntennaVendor = null;
    String cell_Id = "";
    List<String> lst = null;
    lst=new ArrayList<String>();
   
    int a=0;
    int Vlan=0;
    int Enode_name=0;
    int Fixed_value=0;
    int rrhcount=0;
    String MCC_ID="310";
	String MNC_ID="120";
  
    /*Reading CIQ .............................................................................*/
        int rownum=0;//Integer.toString(sheet.getLastRowNum());
      System.out.println(sheet.getLastRowNum());
    
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
				
	 /* Matching Cascade........................................................................*/
					
					
					/*if(df.formatCellValue(row.getCell(0)).equals(cascade)) {}
					else
						new CiqColorsheet800FDD1().ciqColorsheet1(file, "cascade", fileName);
								*/
	/* Matching Other Values...............................................................*/
					
				flag = 1;
				cell_Id = df.formatCellValue(row.getCell(11));
				lst.add(cell_Id);
				count = Integer.parseInt(df.formatCellValue(row.getCell(10)));
				if (count == count1 && count1 < 3)
				{
		        count1++;
		        
		       // if(df.formatCellValue(row.getCell(28)).equals("1"))
		        	
		        }
				
				//System.out.println("count1="+count1);
				diversity.add(df.formatCellValue(row.getCell(32)));
				eNB_id.add(df.formatCellValue(row.getCell(6)));
			   // antenna_counter.add(df.formatCellValue(row.getCell(36)));
				phycell.add(df.formatCellValue(row.getCell(18)));
				rsi.add(df.formatCellValue(row.getCell(21)));
			    channelcounter.add(df.formatCellValue(row.getCell(25)));	
				
	/* VLAN_Check.....................................................................................*/			
				
			  
				
				if(df.formatCellValue(row.getCell(24)).equals(Bandwidth1) || df.formatCellValue(row.getCell(24)).equals(Bandwidth2))
				{}  // System.out.println("inside 20");                                 }
				
				else
					new CiqColorsheetCombine800FDD1().ciqColorsheet1(file, "bandwidth", fileName);
				
				
				
	/*			
	 ENODEB_Name..............................................................................*/			
				String enb_id=df.formatCellValue(row.getCell(6));
				String Network_sitecode=df.formatCellValue(row.getCell(7));
				String enode_name=Network_sitecode+"BBULTE0"+enb_id;
				//System.out.println(enode_name.equals(df.formatCellValue(row.getCell(9))));
				
				
				if(enode_name.equals(df.formatCellValue(row.getCell(8)))){
					//System.out.print("\tEnodeB_Name is Match");
					
				}
				else
				{
						new CiqColorsheetCombine800FDD1().ciqColorsheet1(file,"EnodeB",fileName);
				}
						
/*	 FIX Value..............................................................................*/		
				//System.out.println(df.formatCellValue(row.getCell(3)).equals(""));
				//System.out.println(row.getCell(3)==null);
				
				if(df.formatCellValue(row.getCell(29)).equals(MCC_ID))
				{
					//System.out.print("\tMCC_ID is Equal");
				}
				else new CiqColorsheetCombine800FDD1().ciqColorsheet1(file,"mcc",fileName);
				
				
				if(df.formatCellValue(row.getCell(30)).equals(MNC_ID))
				{
					//System.out.print("\tMNC_ID is Equal");
					
				}else
				new CiqColorsheetCombine800FDD1().ciqColorsheet1(file,"mnc",fileName);
					
				
				if(row.getCell(1)==null || df.formatCellValue(row.getCell(1)).equals(""))
					new CiqColorsheetCombine800FDD1().ciqColorsheet1(file,"market",fileName);
				
				if(row.getCell(2)==null || df.formatCellValue(row.getCell(2)).equals(""))
					new CiqColorsheetCombine800FDD1().ciqColorsheet1(file,"market_id",fileName);
				
				
				if(row.getCell(3)==null || df.formatCellValue(row.getCell(3)).equals(""))
					new CiqColorsheetCombine800FDD1().ciqColorsheet1(file,"LSR",fileName);
				
				if(row.getCell(4)==null || df.formatCellValue(row.getCell(4)).equals(""))
					new CiqColorsheetCombine800FDD1().ciqColorsheet1(file,"LSM",fileName);
				
				if(row.getCell(5)==null || df.formatCellValue(row.getCell(5)).equals(""))
					new CiqColorsheetCombine800FDD1().ciqColorsheet1(file,"LSM_IP",fileName);
				
				if(row.getCell(9)==null || df.formatCellValue(row.getCell(9)).equals(""))
					new CiqColorsheetCombine800FDD1().ciqColorsheet1(file,"Cabinet",fileName);
				
			/*	if(row.getCell(11)==null || df.formatCellValue(row.getCell(11)).equals(""))
					new CiqColorsheet800CDU301().ciqColorsheet1(file,"Eutran_Id",fileName);
				*/
				
				if(row.getCell(13)==null || df.formatCellValue(row.getCell(13)).equals(""))
					new CiqColorsheetCombine800FDD1().ciqColorsheet1(file,"Latitude_Ns",fileName);
				
				if(row.getCell(15)==null || df.formatCellValue(row.getCell(15)).equals(""))
					new CiqColorsheetCombine800FDD1().ciqColorsheet1(file,"Latitude_Ws",fileName);
				
				
				if(row.getCell(16)==null || df.formatCellValue(row.getCell(16)).equals(""))
					new CiqColorsheetCombine800FDD1().ciqColorsheet1(file,"Trackcode",fileName);
				
				if(row.getCell(17)==null || df.formatCellValue(row.getCell(17)).equals(""))
					new CiqColorsheetCombine800FDD1().ciqColorsheet1(file,"Tac_Hex",fileName);
				
				
				
				
				
				
				if(row.getCell(19)==null || df.formatCellValue(row.getCell(19)).equals(""))
					new CiqColorsheetCombine800FDD1().ciqColorsheet1(file,"sss",fileName);
				
				if(row.getCell(20)==null || df.formatCellValue(row.getCell(20)).equals(""))
					new CiqColorsheetCombine800FDD1().ciqColorsheet1(file,"pss",fileName);
				
				if(row.getCell(22)==null || df.formatCellValue(row.getCell(22)).equals(""))
					new CiqColorsheetCombine800FDD1().ciqColorsheet1(file,"plmn",fileName);
				
				if(row.getCell(23)==null || df.formatCellValue(row.getCell(23)).equals("") || !df.formatCellValue(row.getCell(23)).equals("26"))
					new CiqColorsheetCombine800FDD1().ciqColorsheet1(file,"band",fileName);
				
				if(row.getCell(24)==null || df.formatCellValue(row.getCell(24)).equals(""))
					new CiqColorsheetCombine800FDD1().ciqColorsheet1(file,"bandwidth",fileName);
				
				if(row.getCell(26)==null || df.formatCellValue(row.getCell(26)).equals(""))
				    new CiqColorsheetCombine800FDD1().ciqColorsheet1(file,"UEarfcn",fileName);
					
				
				if(row.getCell(27)==null || df.formatCellValue(row.getCell(27)).equals(""))
				    new CiqColorsheetCombine800FDD1().ciqColorsheet1(file,"rru",fileName);
				
				
				if(row.getCell(28)==null || df.formatCellValue(row.getCell(28)).equals(""))
				{
					//System.out.println("inside career");
					new CiqColorsheetCombine800FDD1().ciqColorsheet1(file,"Career",fileName);
				}
				
				if(row.getCell(31)==null || df.formatCellValue(row.getCell(31)).equals(""))
				{
					//System.out.println("Inside Frame");
					new CiqColorsheetCombine800FDD1().ciqColorsheet1(file,"ecgi",fileName);
				}
				
				
				
			
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
    	new CiqColorsheetCombine800FDD1().ciqColorsheet1(file,"phycell",fileName);
    
    
   
    
    
    
   
    
    
  /*  RSI...................................................................................*/
   
    int[]  diff=new int[3];
    int p=0;
    int d;
    int rsiflag=0;
    //System.out.println(rsi.size());
    if(rsi.size()!=1)
    {
    for(String s:rsi)
    { 
        	diff[p]=Integer.parseInt(s);
        	p++;
    }
  
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
    
    	//System.out.println("rsiflag="+rsiflag);
    if(count1==rsi.size() && rsiflag==0){}
    else{
    	new CiqColorsheetCombine800FDD1().ciqColorsheet1(file,"rsi",fileName);
    }
    
    
    
   /* Calling Second task.............................................................................*/ 
    
      
    
    
    String eNB_Id = null;     
     for(String st:eNB_id)
    	 eNB_Id=st;
     
     //System.out.println("count1="+count1);
     LOGGER.log(Level.SEVERE, "800 FDD/CIQFixValueAuditCombine800FDD","Cascade= "+lst);
     new IpbhCombine800().ipbh(file,cascade,fileName,eNB_Id,lst,count1);
   //new ReadECSFBDUMP800FDD().readCIQ(file,cascade,fileName,eNB_Id,lst);      
            
            
            
   
     
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
		
