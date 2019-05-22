package sta800CDMA.technology.com;

import java.io.File;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import awt.file.lincense.com.Ciqframe;

public class MatchPaiValues {
	
	private static final Logger LOGGER = Logger.getLogger(Ciqframe.class.getName());
	public void switchMscPair(File file, String fileName, Object cascade, String ciqmscpair, HashSet<String> paiValues, String fabricate, String fabricate1)
	{
		try
		{
			
			XSSFWorkbook workbook = new XSSFWorkbook("C:\\CIQ Audit\\Inventory\\PA_Values_Dump.xlsx");

		    
		    
		    XSSFSheet sheet = workbook.getSheetAt(0);
		    DataFormatter df = new DataFormatter();
		    HashSet<String> mscpair= new HashSet<>();
		  //  HashSet<String> diversity= new HashSet<>();
		    
		   // System.out.println(ciqmscpair+" "+fabricate+" "+fabricate1);
		    int flag=0;
		    
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
					//System.out.println(str+" "+fabricate);
					
					if ((str.equals(ciqmscpair)) || (str.equals(fabricate)) || (str.equals(fabricate1))) {

						

					/*	break;
					} else {*/
						
						flag++;
						//System.out.println("flag");
						mscpair.add(df.formatCellValue(row.getCell(3)));
						mscpair.add(df.formatCellValue(row.getCell(4)));
						mscpair.add(df.formatCellValue(row.getCell(5)));
						 
						break;
						
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
		    
		    
		    
		    System.out.println("Pai Values of Dump = "+mscpair+"Pai Values of CIQ= "+paiValues);
		    LOGGER.log(Level.SEVERE, "800 CDMA/CIQFixValueAudit800CDMA/MatchPaiValues800CDMA","Pai Values of Dump = "+mscpair+"Pai Values of CIQ= "+paiValues);
			
		   // System.out.println(!mscpair.equals(paiValues));
		    if(!mscpair.equals(paiValues) || flag==0)
			{
				new CiqColorsheet800CDMA301().ciqColorsheet1(file,"fortytwo",fileName);
				new CiqColorsheet800CDMA301().ciqColorsheet1(file,"fortythree",fileName);
				new CiqColorsheet800CDMA301().ciqColorsheet1(file,"fortyfour",fileName);
			}
		    	
			
			
			
			
		
		
		
		
		
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	

}
	
}
	
