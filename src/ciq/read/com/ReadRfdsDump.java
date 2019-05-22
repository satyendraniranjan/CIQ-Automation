package ciq.read.com;
	
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import read.earfcn.com.Earfcn;

public class ReadRfdsDump {
	
	public void readRfdsDump() 
	{
		try
		{

	FileInputStream file = new FileInputStream(new File("C:\\CIQ Audit\\Inventory\\Sprint Vision 07232018.xlsx"));
	//OPCPackage opcPackage = OPCPackage.open(file);
    
    XSSFWorkbook workbook = new XSSFWorkbook(file);


    XSSFSheet sheet = workbook.getSheetAt(0);
    DataFormatter df = new DataFormatter();
    String values=null;
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
   // List lst= new ArrayList<>();
    int a=0;
   // System.out.println(sheet.getLastRowNum());
    for (int j = 1; j < sheet.getLastRowNum()+1; j++) {

		Row row = sheet.getRow(j);
		int flag = 0;

		int num = 0;
		
		for (int k = 0; k <= 0; k++) {

			
			String str = df.formatCellValue(row.getCell(k));

			String s = "";
			
			if (!str.equals("PT03XC150") && flag == 0) {

				

				break;
			} else {
				
				
				flag = 1;
				//System.out.println(df.formatCellValue(row.getCell(k)));
				//System.out.println(df.formatCellValue(row.getCell(8))+" "+df.formatCellValue(row.getCell(15))+" "+df.formatCellValue(row.getCell(16)));
				//System.out.println(df.formatCellValue(row.getCell(7)));
				
				/*while(row.getCell(7)!=null)
				{*/
					//System.out.println("Hi");
					//lst.add(df.formatCellValue(row.getCell(7)));
				//System.out.println(row.getLastCellNum());
				/*for(int i=0;i<row.getLastCellNum();i++)
				{*/
					//System.out.println(df.formatCellValue(row.getCell(i)));
				   /* if(df.formatCellValue(row.getCell(i)).equals("AG:SMS Schedule Name"))
				    	{*/
				    	hm.put(a, df.formatCellValue(row.getCell(8)));
				    	
					hm1.put(a, df.formatCellValue(row.getCell(11)));
					//System.out.println(a);
					
					//String add=Integer.toString(a)+df.formatCellValue(row.getCell(7));
					hm2.put(a, df.formatCellValue(row.getCell(10)));
					
					//String add1= add+df.formatCellValue(row.getCell(6));
					hm3.put(a,df.formatCellValue(row.getCell(12)));
					hm4.put(a,df.formatCellValue(row.getCell(2)));   //RFDS:Site Latitude RF Atoll
					hm5.put(a,df.formatCellValue(row.getCell(3)));   //RFDS:Site Longitude RF Atoll
					hm6.put(a,df.formatCellValue(row.getCell(1)));  //C:Finalized Backhaul / Midhaul / Fronthaul Type
					hm7.put(a,df.formatCellValue(row.getCell(13))); //RSEC:Antenna1 Model
					hm8.put(a,df.formatCellValue(row.getCell(15))); //RSEC:Radio Configuration
					hm9.put(a,df.formatCellValue(row.getCell(16)));  //RSEC:Antenna 1 Azimuth
					hm10.put(a,df.formatCellValue(row.getCell(4)));  //Market Name
					//hm11.put(a,df.formatCellValue(row.getCell(18)));  //Antenna Vendor
					
					
					a++;
				}
				
			
			
			}
		
    
		
                
    }
    /*System.out.println(hm1.entrySet());
    System.out.println(hm.entrySet());
    System.out.println(hm2.entrySet());
    System.out.println(hm3.entrySet());
    System.out.println(a);*/
   // System.out.println(hm2.);
    //System.out.println(hm2.get("41900 MHzGamma").contains("375"));
    //System.out.println(hm1.get(hm.get(1)).concat("Gamma"));
   // hm.get(0).split(regex)
    for(int i=0;i<a;i++)
    {
    
    	if(hm.get(i).contains("DO Macro Upgrade"))
    	{
    		if(hm1.get(i).contains("2500"))
    		{
    			if(hm2.get(i).contains("Alpha") )
    			{
    				values=hm4.get(i)+" "+hm5.get(i)+" "+hm6.get(i)+" "+hm7.get(i)+" "+hm8.get(i)+" "+hm9.get(i)+" "+hm10.get(i);
    		//new ReadCIQOtherValues().readCIQValue(values);
    				//hm6.get(i);
    				hmValues.put("Alpha", values);
    				//new Earfcn().earfcn(hm3.get(i));
    			}
    			else if (hm2.get(i).contains("Beta"))
    			{
    				values=hm4.get(i)+" "+hm5.get(i)+" "+hm6.get(i)+" "+hm7.get(i)+" "+hm8.get(i)+" "+hm9.get(i)+" "+hm10.get(i);
                    hmValues.put("Beta", values);
                    //+" "+hm6.get(i)
    			}
    			else if(hm2.get(i).contains("Gamma"))
    			{
    				values=hm4.get(i)+" "+hm5.get(i)+" "+hm6.get(i)+" "+hm7.get(i)+" "+hm8.get(i)+" "+hm9.get(i)+" "+hm10.get(i);
                    hmValues.put("Gamma", values);
                    //+" "+hm6.get(i)
    		    }
    			
    		}
    	}
    	
    }
    
    
    //hm.containsKey("2500")
    //System.out.println(hm2.entrySet());
    System.out.println(hmValues.entrySet());
  //new ReadCIQOtherValues().readCIQValue(hmValues);
     }catch(Exception e)
		{
	    e.printStackTrace();
		}
		
	
	
	}
}
