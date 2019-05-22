package rfds.read.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Columnwise {

	public static void main(String[] args) throws IOException {
		
		  FileInputStream file = new FileInputStream(new File("C:\\Users\\esatnir\\Videos\\sprint\\Sprint Vision Data1.xlsx"));
		  XSSFWorkbook workbook = new XSSFWorkbook(file);
          XSSFSheet sheet = workbook.getSheetAt(0);
          DataFormatter df = new DataFormatter();
          HashMap<String, List<String>> hm= new HashMap<>();
          List<String> lst= new ArrayList<>();
          HashMap<String, List<String>> hm1=new HashMap<>();
          List<String> lst1= new ArrayList<>();
          HashMap<String, List<String>> hm2=new HashMap<>();
          List<String> lst2= new ArrayList<>();
          HashMap<String, List<String>> hm3=new HashMap<>();
          List<String> lst3= new ArrayList<>();
          
          for (int j = 1; j < sheet.getLastRowNum() + 1; j++) {

      		Row row = sheet.getRow(j);
      		int flag = 0;

      		int num = 0;
      		
      		for (int k = 0; k <= 0; k++) {

      			
      			String str = df.formatCellValue(row.getCell(k));

      			String s = "";
      			
      			if (!str.equals("CH03XC224") && flag == 0) {

      				

      				break;
      			} else {
      				
      				
      				flag = 1;
      				
      				//hm.put("S:Cascade ID", df.formatCellValue(row.getCell(0)));
      				lst.add(df.formatCellValue(row.getCell(7)));
      				lst1.add(df.formatCellValue(row.getCell(10)));
      				lst2.add(df.formatCellValue(row.getCell(9)));
      				lst3.add(df.formatCellValue(row.getCell(11)));
      				
		
	               }
                   }
      		       }
          hm.put("AG:SMS Schedule Name", lst);
          hm1.put("RSEC:Band", lst1);
          hm2.put("RSEC:Sector", lst2);
          hm3.put("RSEC:Channels", lst3);
          System.out.println(hm.entrySet()+"\n"+hm1.entrySet()+"\n"+hm2.entrySet()+"\n"+hm3.entrySet());
          System.out.println(hm1.get("RSEC:Band").contains("2500 MHz"));
          
          if(hm.get("AG:SMS Schedule Name").contains("DO Macro Upgrade"))
          {
        	  //System.out.println("hm");
        	  if(hm1.get("RSEC:Band").contains("2500 MHz"))
        	  {
        		  //System.out.println("hm1");
        		  if(hm2.get("RSEC:Sector").contains("Alpha"))
        		  {
        			 // System.out.println("hm2");
        			  System.out.println(hm3.get("RSEC:Channels"));
        		  }
        	  }
          }
}
}