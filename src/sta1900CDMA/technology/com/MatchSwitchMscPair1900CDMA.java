package sta1900CDMA.technology.com;


import java.io.File;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import awt.file.lincense.com.Ciqframe;

public class MatchSwitchMscPair1900CDMA {

	private static final Logger LOGGER = Logger.getLogger(Ciqframe.class.getName());
	
	public void matchSwithcMscPair(File file, Object cascade, String fileName, String bsmname, HashSet<String> ciqmscpair)
	{
		try
		{

			
			XSSFWorkbook workbook = new XSSFWorkbook("C:\\CIQ Audit\\Inventory\\BSM Mapping Dump.xlsx");

		    
		    
		    XSSFSheet sheet = workbook.getSheetAt(0);
		    DataFormatter df = new DataFormatter();
		    HashSet<String> mscpair= new HashSet<>();
		    String pair1=null;
		    String pair2=null;
		    
		  //  HashSet<String> diversity= new HashSet<>();
		    
		    //System.out.println(ciqmscpair);
		    
		    for (int j = 1; j < sheet.getLastRowNum() + 1; j++) {
		    	
		    	try 
		    	{
		    	
				Row row = sheet.getRow(j);
				//System.out.println("Hi");
				//int st=Integer.parseInt(df.formatCellValue(row.getCell(1)));
				//int flag = 0;
				
				int num = 0;
					
				for (int k = 2; k <= 2; k++) {
					
					
					
					
					String str = df.formatCellValue(row.getCell(k));

					String s = "";
					//System.out.println(str+" "+bsmname);
					
					if ((!str.equals(bsmname))) {

						

						break;
					} else {
						
						//flag=1;
						//System.out.println("flag");
						//mscpair.add(df.formatCellValue(row.getCell(8)));
						pair1=df.formatCellValue(row.getCell(3));
						pair2=df.formatCellValue(row.getCell(4));
						//mscpair.add(df.formatCellValue(row.getCell(4)));
						//mscpair.add(df.formatCellValue(row.getCell(5)));
						
						
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
		    
		    
		    mscpair.add(pair1+"/"+pair2);
		    System.out.println(mscpair+" "+ciqmscpair+" "+mscpair.equals(ciqmscpair));
		    LOGGER.log(Level.SEVERE, "1900 CDMA/CIQFixValueAudit1900CDMA/MatchSwitchMscPair1900CDMA",ciqmscpair+" MSC Pair should be= "+mscpair);
			if(!mscpair.equals(ciqmscpair))
			{
				System.out.println("Hi");
				new CiqColorsheet1900CDMA301().ciqColorsheet1(file,"third",fileName);
				new CiqColorsheet1900CDMA301().ciqColorsheet1(file,"eight",fileName);
				
			}
		    	
			
			
			
			
		
		
		
		
		
		
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
