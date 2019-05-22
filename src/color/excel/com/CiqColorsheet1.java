package color.excel.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.hssf.util.HSSFColor.GREEN;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CiqColorsheet1 {

	public void ciqColorsheet1(File file,String check , String fileName) {
		try {

			
          FileInputStream folder= new FileInputStream(file);
			 
		    
		   XSSFWorkbook  workbook = new XSSFWorkbook(folder);

		  
		    
		    XSSFSheet sheet = workbook.getSheetAt(0);
			
			
			CellStyle style = workbook.createCellStyle();
			style.setFillForegroundColor(IndexedColors.RED.getIndex());
			style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
			Font font = workbook.createFont();
	        font.setColor(IndexedColors.BLACK.getIndex());
	        style.setFont(font);
	            
			 String s=Integer.toString(sheet.getLastRowNum());
	            int a=Integer.parseInt(s.trim());
	         
	            
/* Start Reading File................................................................*/	            
	            
			 for(int i=1;i<a+1;i++)
			 {
				 try {
				Row row= sheet.getRow(i);
				 

				if(check.equals("sitecode"))
				{
					row.getCell(9).setCellStyle(style);
				}
				
				if(check.equals("antenna_name"))
				{
					row.getCell(30).setCellStyle(style);
				}
				
				if(check.equals("eNB_id"))
				{
					row.getCell(6).setCellStyle(style);
				}
				
				
				
               if(check.equals("cascade"))
               {
            	   row.getCell(0).setCellStyle(style);
               }
				
				if(check.equals("phycell"))
                 {
	                       row.getCell(17).setCellStyle(style);
                  }
				
				
				if(check.equals("rsi"))
				{
					row.getCell(18).setCellStyle(style);
				}
				
				
				if(check.equals("cellId"))
				{
					row.getCell(16).setCellStyle(style);
				}
				
				
				if(check.equals("channel"))
				{
					row.getCell(21).setCellStyle(style);
				}
				
				
				if(check.equals("latitude"))
				{
					row.getCell(32).setCellStyle(style);
				}
				
				if(check.equals("longitude"))
				{
					row.getCell(33).setCellStyle(style);
				}
				
				if(check.equals("azimuth"))
				{
					row.getCell(13).setCellStyle(style);
				}
				
				if(check.equals("diversity"))
				{
					row.getCell(28).setCellStyle(style);
				}
				
				
				if(check.equals("VLAN"))
				{
					
					row.getCell(41).setCellStyle(style);
					row.getCell(45).setCellStyle(style);
				}
				
				if(check.equals("bandwidth"))
                 {
	                  row.getCell(19).setCellStyle(style);
                 }
				
				if(check.equals("EnodeB"))
				{
					row.getCell(7).setCellStyle(style);
					//row.getCell(45).setCellStyle(style);
				}
				
				if(check.equals("Satellite"))
				{
					//System.out.println("hi");
					row.getCell(3).setCellStyle(style);
					//style.setFont(font);
					//row.getCell(45).setCellStyle(style);
				}
				
				if(check.equals("LSR"))
				{
					row.getCell(4).setCellStyle(style);
					//row.getCell(45).setCellStyle(style);
				}
				
				if(check.equals("LSM"))
				{
					row.getCell(5).setCellStyle(style);
					//row.getCell(45).setCellStyle(style);
				}
				
				if(check.equals("LSM_IP"))
				{
					row.getCell(8).setCellStyle(style);
					//row.getCell(45).setCellStyle(style);
				}
				
				if(check.equals("Eutran"))
				{
					row.getCell(10).setCellStyle(style);
					//row.getCell(45).setCellStyle(style);
				}
				
				if(check.equals("Eutran_Id"))
				{
					row.getCell(11).setCellStyle(style);
					//row.getCell(45).setCellStyle(style);
				}
				
				if(check.equals("RRH"))
				{
					row.getCell(12).setCellStyle(style);
					//row.getCell(45).setCellStyle(style);
				}
				
				if(check.equals("Electrical"))
				{
					row.getCell(14).setCellStyle(style);
					//row.getCell(45).setCellStyle(style);
				}
				
				if(check.equals("Mechanical"))
				{
					row.getCell(15).setCellStyle(style);
					//row.getCell(45).setCellStyle(style);
				}
				
				if(check.equals("SEarfcn"))
				{
					row.getCell(20).setCellStyle(style);
					//row.getCell(45).setCellStyle(style);
				}
				
				if(check.equals("Career"))
				{
					row.getCell(22).setCellStyle(style);
					//row.getCell(45).setCellStyle(style);
				}
				
				if(check.equals("Frame"))
				{
					row.getCell(23).setCellStyle(style);
					//row.getCell(45).setCellStyle(style);
				}
				
				if(check.equals("Trackcode"))
				{
					row.getCell(26).setCellStyle(style);
					//row.getCell(45).setCellStyle(style);
				}
				
				if(check.equals("Puncturing"))
				{
					row.getCell(27).setCellStyle(style);
					//row.getCell(45).setCellStyle(style);
				}
				
				
				if(check.equals("Cabinet"))
				{
					row.getCell(29).setCellStyle(style);
					//row.getCell(45).setCellStyle(style);
				}
				
				
				if(check.equals("Avendor"))
				{
					row.getCell(31).setCellStyle(style);
					//row.getCell(45).setCellStyle(style);
				}
				
				if(check.equals("MCC_ID"))
				{
					row.getCell(24).setCellStyle(style);
					//row.getCell(45).setCellStyle(style);
				}
				
				if(check.equals("MNC_ID"))
				{
					row.getCell(25).setCellStyle(style);
					
				}
				
				
				if(check.equals("Network_Mask"))
				{
					row.getCell(34).setCellStyle(style);
					
				}
				
				
				if(check.equals("CSR_Hostname"))
				{
					row.getCell(35).setCellStyle(style);
					
				}
				
				
				
				if(check.equals("CSR_Type"))
				{
					row.getCell(36).setCellStyle(style);
					
				}
				
				
				if(check.equals("CSR_Port"))
				{
					row.getCell(37).setCellStyle(style);
					
				}
				
				
				if(check.equals("CSR_MGMT"))
				{
					row.getCell(38).setCellStyle(style);
					
				}
				
				
				if(check.equals("DU_Fiber_CSR"))
				{
					row.getCell(39).setCellStyle(style);
					
				}
				
				
				if(check.equals("Fiber_SFP"))
				{
					row.getCell(40).setCellStyle(style);
					
				}
				
				
				if(check.equals("OAM_Prefix"))
				{
					row.getCell(42).setCellStyle(style);
					
				}
				
				
				if(check.equals("CSR_OAM_IP"))
				{
					row.getCell(43).setCellStyle(style);
					
				}
				
				
				if(check.equals("eNB_OAM"))
				{
					row.getCell(44).setCellStyle(style);
					
				}
				
				
				if(check.equals("eNB_Prefix"))
				{
					row.getCell(46).setCellStyle(style);
					
				}
				
				
				if(check.equals("CSR_S_B"))
				{
					row.getCell(47).setCellStyle(style);
					
				}
				
				
				if(check.equals("eNB_S_B"))
				{
					row.getCell(48).setCellStyle(style);
					
				}
				
				
				if(check.equals("IP_R1"))
				{
					row.getCell(49).setCellStyle(style);
					
				}
				
				
				if(check.equals("IP_R2"))
				{
					row.getCell(50).setCellStyle(style);
					
				}
				
				
				if(check.equals("IP_R3"))
				{
					row.getCell(51).setCellStyle(style);
					
				}
				
				
				if(check.equals("IP_R4"))
				{
					row.getCell(52).setCellStyle(style);
					
				}
				
				
				if(check.equals("IP_R5"))
				{
					row.getCell(53).setCellStyle(style);
					
				}
				
				
				if(check.equals("IP_R6"))
				{
					row.getCell(54).setCellStyle(style);
					
				}
				
				if(check.equals("IP_R7"))
				{
					row.getCell(55).setCellStyle(style);
					
				}
				
				if(check.equals("IP_R8"))
				{
					row.getCell(56).setCellStyle(style);
					
				}
				
				
				if(check.equals("EVC_BW"))
				{
					row.getCell(57).setCellStyle(style);
					
				}
				
				
				if(check.equals("EVC_Type"))
				{
					row.getCell(58).setCellStyle(style);
					
				}
				
				
				if(check.equals("Primary_IPA"))
				{
					row.getCell(59).setCellStyle(style);
					
				}
				
				
				if(check.equals("BH_60"))
				{
					row.getCell(60).setCellStyle(style);
					
				}
				
				
				if(check.equals("BH_61"))
				{
					row.getCell(61).setCellStyle(style);
					
				}
				
				
				if(check.equals("BH_62"))
				{
					row.getCell(62).setCellStyle(style);
					
				}
				
				
				if(check.equals("BH_63"))
				{
					row.getCell(63).setCellStyle(style);
					
				}
				
				
				if(check.equals("BH_64"))
				{
					row.getCell(64).setCellStyle(style);
					
				}
				
				
				if(check.equals("BH_65"))
				{
					row.getCell(65).setCellStyle(style);
					
				}
				
				
				if(check.equals("BH_66"))
				{
					row.getCell(66).setCellStyle(style);
					
				}
				
				
				if(check.equals("BH_67"))
				{
					row.getCell(67).setCellStyle(style);
					
				}
				
				if(check.equals("BH_68"))
				{
					row.getCell(68).setCellStyle(style);
					
				}
				
				if(check.equals("BH_69"))
				{
					row.getCell(69).setCellStyle(style);
					
				}
				
				if(check.equals("BH_70"))
				{
					row.getCell(70).setCellStyle(style);
					
				}
				
				if(check.equals("BH_71"))
				{
					row.getCell(71).setCellStyle(style);
					
				}
				
				
				
				
			 }catch(java.lang.NullPointerException ax)
				 {
				 continue;
				 }
				 
			 }
	
			 
			 
/* Start Writing File..............................................................................*/			
			
				 
			 
			FileOutputStream out = new FileOutputStream(new File("C:\\CIQ Audit\\"+fileName));
			workbook.write(out);
			out.close();
			folder.close();
			//System.out.println("Excel Color Done");
			
/* End Game..............................................................................*/			
			
		}   catch (Exception e) {
			e.printStackTrace();
		}

	}
}
