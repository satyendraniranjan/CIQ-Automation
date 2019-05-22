package sta.twentyfive.cdu30.technology.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import awt.file.lincense.com.Ciqframe;
import sta1900.fdd.technology.com.CiqColorsheet1900FDD2;

public class ReadECSFBDUMPCDU30 {
	private static final Logger LOGGER = Logger.getLogger(Ciqframe.class.getName());
	public void readCIQ(File file1,Object object, String fileName, String eNB_id, List<String> lst, int sectorno, HashSet<String> diversity)
	{
		 try {
	           FileInputStream file = new FileInputStream(new File("C:\\\\CIQ Audit\\\\Inventory\\\\ECSFB_PARAM_DUMP.xlsx"));
	 
	            
	            XSSFWorkbook workbook = new XSSFWorkbook(file);
	 
	        
	            XSSFSheet sheet = workbook.getSheetAt(0);
	 
	            DataFormatter df = new DataFormatter();
	            String s ,PN_OFF;
	            String cell_Id;
	            int count1=0;
	            int count;
	            //LOGGER.log(Level.SEVERE, "2.5 TDD CDU30/CIQFixValueAuditCDU30", lst);
	            int flag1=0;
	           
	            
	            for (int j = 1; j < sheet.getLastRowNum() + 1; j++) 
	            {
	            	
	            try {

					Row row = sheet.getRow(j);
					int flag = 0;

					int num = 0;
					for (int k = 0; k <= 0; k++) {
						
					

						
						String str = df.formatCellValue(row.getCell(k));



						if (!str.equals(object) && flag == 0) {

							

							break;
						} else {
							
                            flag1++;
							flag = 1;
							
							s=df.formatCellValue(row.getCell(1))+" "+df.formatCellValue(row.getCell(2))+" "+df.formatCellValue(row.getCell(3))+" "+df.formatCellValue(row.getCell(4))+" "+df.formatCellValue(row.getCell(5))+" "+df.formatCellValue(row.getCell(9))+" "+df.formatCellValue(row.getCell(12))+" "+df.formatCellValue(row.getCell(14));
							
							PN_OFF=df.formatCellValue(row.getCell(15))+" "+df.formatCellValue(row.getCell(16))+" "+df.formatCellValue(row.getCell(17));
							//System.out.println(PN_OFF);
						    LOGGER.log(Level.SEVERE, "2.5 TDD CDU30/CIQFixValueAuditCDU30/ReadECSFBDUMPCDU30", "PN_OFF="+PN_OFF);
							new AuditEcsfbCDU30().readCIQ(file1,s,PN_OFF,fileName,eNB_id,lst,sectorno,diversity);
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
	            
	           if(flag1==0)
	            {
	            	new CiqColorsheetCDU302().ciqColorsheet2(file1,"PN_OFF",fileName);
	            	new CiqColorsheetCDU302().ciqColorsheet2(file1,"BandClass",fileName); 
	            	new CiqColorsheetCDU302().ciqColorsheet2(file1,"MCC_ID",fileName); 
	            	new CiqColorsheetCDU302().ciqColorsheet2(file1,"MNC_ID",fileName); 
	            	new CiqColorsheetCDU302().ciqColorsheet2(file1,"LTM_OFF",fileName); 
	            	new CiqColorsheetCDU302().ciqColorsheet2(file1,"REG_Z",fileName); 
	            	new CiqColorsheetCDU302().ciqColorsheet2(file1,"OTA_NID",fileName); 
	            	new CiqColorsheetCDU302().ciqColorsheet2(file1,"BSC_SId",fileName);
	            	new CiqColorsheetCDU302().ciqColorsheet2(file1,"OTA_SID",fileName);
	            }
	            
	            
	            
	            
	            
	            
	        }
	        catch (Exception e) {
	        	
	            e.printStackTrace();
	            
	        }

	}

}
