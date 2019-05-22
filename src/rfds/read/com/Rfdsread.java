package rfds.read.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Rfdsread {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file = new FileInputStream(new File("C:\\Users\\esatnir\\Videos\\sprint\\Sprint Vision Data.xlsx"));
		 XSSFWorkbook workbook = new XSSFWorkbook(file);


		    XSSFSheet sheet = workbook.getSheetAt(0);
		    DataFormatter df = new DataFormatter();
		    List<String> al1,al2,al3,al4,al5,al6;
		    al1= new ArrayList<String>();
		    al2= new ArrayList<String>();
		    al3= new ArrayList<String>();
		    al4= new ArrayList<String>();
		   
		    int a=0;
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
					
					al1.add(df.formatCellValue(row.getCell(4)));
					al2.add(df.formatCellValue(row.getCell(7)));
					al3.add(df.formatCellValue(row.getCell(6)));
					al4.add(df.formatCellValue(row.getCell(8)));
					     
						a++;
					}
				
				
				}
			
	    
	}

		   
		    	if(al1.contains("DO Macro Upgrade"))
		    	{
		    		if(al2.contains("2500"))
		    		{
		    			if(al3.contains("Alpha") || al3.contains("Beta") || al3.contains("Gamma"))
		    				System.out.println("yes");
		    		}
		    	}
		    	
		    
		   /* System.out.print(" \t ");
		    for(String s:al2)
		    {
		    	System.out.println("\t"+s);
		    }
		    System.out.print("\t");
		    for(String s:al3)
		    {
		    	System.out.println("\t"+s);
		    }
		    System.out.print("\t");
		    for(String s:al4)
		    {
		    	System.out.println("\t"+s);
		    }
		    */
		    
}
}
