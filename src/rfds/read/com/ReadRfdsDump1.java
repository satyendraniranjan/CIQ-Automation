package rfds.read.com;
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

public class ReadRfdsDump1 {

	public static void main(String[] args) {
				try
				{

			FileInputStream file = new FileInputStream(new File("C:\\Users\\esatnir\\Videos\\sprint\\Sprint Vision Data1.xlsx"));
			 
		    
		    XSSFWorkbook workbook = new XSSFWorkbook(file);


		    XSSFSheet sheet = workbook.getSheetAt(0);
		    DataFormatter df = new DataFormatter();
		    HashMap<Integer, String> hm= new HashMap<>();
		    HashMap<Integer, String> hm2= new HashMap<>();
		    HashMap<Integer, String> hm1= new HashMap<>();
		    HashMap<Integer, String> hm3 = new HashMap<>();
		    
		   // List lst= new ArrayList<>();
		    int a=0;
		    for (int j = 0; j < sheet.getLastRowNum(); j++) {

				Row row = sheet.getRow(j);
				int flag = 0;

				int num = 0;
				
				if(df.formatCellValue(row.getCell(j)).equals("S:Cascade ID"))
				//for (int k = 0; k <= 0; k++) 
					{

					System.out.println(df.formatCellValue(row.getCell(j)));
					String str = df.formatCellValue(row.getCell(j));

					String s = "";
					
					if (!str.equals("CH03XC224") && flag == 0) {

						

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
						System.out.println(df.formatCellValue(row.getCell(j)));
						for(int i=0;i<row.getLastCellNum();i++)
						{
							//System.out.println(df.formatCellValue(row.getCell(i)));
						    if(df.formatCellValue(row.getCell(i)).equals("AG:SMS Schedule Name"))
						    	{
						    	hm.put(a, df.formatCellValue(row.getCell(i)));
						    	}
							hm1.put(a, df.formatCellValue(row.getCell(10)));
							//System.out.println(a);
							
							//String add=Integer.toString(a)+df.formatCellValue(row.getCell(7));
							hm2.put(a, df.formatCellValue(row.getCell(9)));
							
							//String add1= add+df.formatCellValue(row.getCell(6));
							hm3.put(a,df.formatCellValue(row.getCell(11)));
							a++;
						}
						}
					
					
					}
				
		    
				//System.out.println(hm.entrySet());
		                
		    }
		    
		    System.out.println(hm.entrySet());
		   // System.out.println(hm2.);
		    //System.out.println(hm2.get("41900 MHzGamma").contains("375"));
		    //System.out.println(hm1.get(hm.get(1)).concat("Gamma"));
		   /* for(int i=0;i<a;i++)
		    {
		    
		    	if(hm.get(i).contains("DO Macro Upgrade"))
		    	{
		    		if(hm1.get(i).contains("2500"))
		    		{
		    			if(hm2.get(i).contains("Alpha") || hm2.get(i).contains("Beta") || hm2.get(i).contains("Gamma") )
		    			{
		    				System.out.println(hm3.get(i));
		    				//new Earfcn().earfcn(hm3.get(i));
		    			}
		    		}
		    	}
		    	
		    }
		    */
		    
		    //hm.containsKey("2500")
		    
		     }catch(Exception e)
				{
			    e.printStackTrace();
				}
				
			
			
			}
		}


