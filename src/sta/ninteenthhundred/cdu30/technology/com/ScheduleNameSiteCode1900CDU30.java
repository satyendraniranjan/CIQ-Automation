package sta.ninteenthhundred.cdu30.technology.com;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import awt.file.lincense.com.Ciqframe;
import sta.eighthundred.cdu30.technology.com.CiqColorsheet800CDU301;
import sta.eighthundred.cdu30.technology.com.ReadDump800CDU304;

public class ScheduleNameSiteCode1900CDU30 {

	private static final Logger LOGGER = Logger.getLogger(Ciqframe.class.getName());
	public void scheduleNameSiteCode(File file1, Object cascade, String fileName, String band)
	{
	try
	{

//FileInputStream file = new FileInputStream(new File("C:\\Users\\esatnir\\Videos\\CIQ\\Complete PT03XC150 STA 2.5 TDD  for BBU No_ 1 2018_07_16_15_57_01.xlsx"));
 

XSSFWorkbook workbook = new XSSFWorkbook("C:\\CIQ Audit\\Inventory\\All CIQ Report.xlsx");



XSSFSheet sheet = workbook.getSheetAt(0);
DataFormatter df = new DataFormatter();

int count = 0;
int count1 = 0;

HashSet<String> schedule= new HashSet<>();
HashSet<String> sitecode= new HashSet<>();
HashMap<Integer, String> hm1= new HashMap<>();
HashMap<Integer, String>hm2 = new HashMap<>();
HashMap<Integer, String>hm3 = new HashMap<>();
HashMap<Integer, String>hm4 = new HashMap<>();


int a=0;
String unique;

/*Reading CIQ .............................................................................*/
    int rownum=0;
    //Integer.toString(sheet.getLastRowNum());
   // System.out.println(rownum.trim());

for (int j = 1; j < sheet.getLastRowNum() + 1; j++) {
    
	try
	{
	
	Row row = sheet.getRow(j);
	//int st=Integer.parseInt(df.formatCellValue(row.getCell(0)));
	int flag = 0;

	int num = 0;
		
	for (int k = 0; k <= 0; k++) {
		
		

		
		String str = df.formatCellValue(row.getCell(k));

		String s = "";
		//System.out.println(str);
		if ((!str.equals(cascade)) && flag == 0) {

			

			break;
		} else {
			
			
			//unique= df.formatCellValue(row.getCell(0)) + df.formatCellValue(row.getCell(1));
			hm1.put(a, df.formatCellValue(row.getCell(0)));
			hm2.put(a, df.formatCellValue(row.getCell(1)));
			hm3.put(a, df.formatCellValue(row.getCell(2)));
			hm4.put(a, df.formatCellValue(row.getCell(3)));
			//System.out.println(df.formatCellValue(row.getCell(2)));
			/*if(df.formatCellValue(row.getCell(1)).equals(band))
			{
			System.out.println(df.formatCellValue(row.getCell(2)));
			schedule.add(df.formatCellValue(row.getCell(2)));
			sitecode.add(df.formatCellValue(row.getCell(3)));
			System.out.println(df.formatCellValue(row.getCell(3)));
			}
			*/
			
			a++;
           }
	}
	
	}catch(java.lang.NullPointerException a1)
	{
		continue;
	}
	
	
	}

/*System.out.println(hm1.entrySet());
System.out.println(hm2.entrySet());
System.out.println(hm3.entrySet());
System.out.println(hm4.entrySet());
//hm1.get(i).contains("cascade");
*///hm1.get(i).contains("cas")
for(int i=0;i<a;i++)
{
	if(hm1.get(i).contains((CharSequence) cascade))
	{
		if(hm2.get(i).contains(band))
		{
			schedule.add(hm3.get(i));
		    sitecode.add(hm4.get(i));
		}
	}
}

if(sitecode.contains(""))
{
	sitecode.add("satyendra");
	//System.out.println(sitecode);
}

if(!schedule.isEmpty() && !schedule.contains(""))
{
String schedule1 = null;
String sitecode1 = null;
for(String s:schedule)
	schedule1=s;

for(String s:sitecode)
	sitecode1=s;

System.out.println(schedule+" "+sitecode);
LOGGER.log(Level.SEVERE, "1900 FDDCDU30/ScheduleNameSiteCode1900CDU30", schedule+" "+sitecode);
new ReadDump1900CDU304().readDump4( file1, cascade, fileName, band,schedule1, sitecode1);
}
else
{
	new CiqColorsheet1900CDU301().ciqColorsheet1(file1,"channel",fileName);
	new CiqColorsheet1900CDU301().ciqColorsheet1(file1,"antenna_name",fileName);
	//new CiqColorsheet1900CDU301().ciqColorsheet1(file1,"sitecode",fileName);
	new CiqColorsheet1900CDU301().ciqColorsheet1(file1,"azimuth",fileName);
	new CiqColorsheet1900CDU301().ciqColorsheet1(file1,"diversity",fileName);
	//new CiqColorsheet1900CDU301().ciqColorsheet1(file1,"longitude",fileName);
}
System.out.println("Done");




//System.out.println(schedule);
//System.out.println(sitecode);
/*String schedule1 = null;
String sitecode1 = null;
for(String s:schedule)
	schedule1=s;

for(String s:sitecode)
	sitecode1=s;
*/
/*System.out.println(schedule+" "+sitecode);
LOGGER.log(Level.SEVERE, "1900 FDDCDU30/ScheduleNameSiteCode1900CDU30", schedule+" "+sitecode);
new ReadDump1900CDU304().readDump4( file1, cascade, fileName, band,schedule1, sitecode1);

System.out.println("Done");*/
	
	}catch(Exception e)
	{
		e.printStackTrace();
	}
	
	}
}
