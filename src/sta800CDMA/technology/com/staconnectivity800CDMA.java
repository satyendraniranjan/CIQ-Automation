package sta800CDMA.technology.com;


import java.io.File;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import awt.file.lincense.com.Ciqframe;
import sta800CDMA.technology.com.CiqColorsheet800CDMA302;

public class staconnectivity800CDMA {

	private static final Logger LOGGER = Logger.getLogger(Ciqframe.class.getName());
	public void ipbh(File file, Object cascade, String fileName, String eNB_Id, List<String> lst)
	{
		try {
			
			 DataFormatter df = new DataFormatter();
			
			XSSFWorkbook wb= new XSSFWorkbook(file);
			XSSFSheet sheet= wb.getSheet("STA Connectivity");
			
		//	System.out.println("inside of connectivity");
			for(int i=1;i<2;i++)
			{
				Row row= sheet.getRow(1);
				
				//System.out.println("HI"+df.formatCellValue(row.getCell(0)));
				
				if(row.getCell(0)==null || df.formatCellValue(row.getCell(0)).equals("") || !df.formatCellValue(row.getCell(0)).equals(cascade))
					new CiqColorsheet800CDMA302().ciqColorsheet2(file,"zero",fileName);
				
				if(row.getCell(1)==null || df.formatCellValue(row.getCell(1)).equals("") || !df.formatCellValue(row.getCell(1)).equals(eNB_Id))
					new CiqColorsheet800CDMA302().ciqColorsheet2(file,"one",fileName);
				
				if(row.getCell(2)==null || df.formatCellValue(row.getCell(2)).equals(""))
					new CiqColorsheet800CDMA302().ciqColorsheet2(file,"two",fileName);
				
				
				if(row.getCell(3)==null || df.formatCellValue(row.getCell(3)).equals(""))
					new CiqColorsheet800CDMA302().ciqColorsheet2(file,"three",fileName);
				
				if(row.getCell(4)==null || df.formatCellValue(row.getCell(4)).equals(""))
				{
					//System.out.println("four");
					new CiqColorsheet800CDMA302().ciqColorsheet2(file,"four",fileName);
				}
				
				//System.out.println(df.formatCellValue(row.getCell(5)));
				if(row.getCell(5)==null || df.formatCellValue(row.getCell(5)).equals(""))
					new CiqColorsheet800CDMA302().ciqColorsheet2(file,"five",fileName);
				
				
				if(row.getCell(6)==null || df.formatCellValue(row.getCell(6)).equals("") || !df.formatCellValue(row.getCell(6)).equals("16"))
					new CiqColorsheet800CDMA302().ciqColorsheet2(file,"six",fileName);
				
				if(row.getCell(7)==null || df.formatCellValue(row.getCell(7)).equals("") || !df.formatCellValue(row.getCell(7)).equals("24"))
					new CiqColorsheet800CDMA302().ciqColorsheet2(file,"seven",fileName);
				
				
				
				if(row.getCell(8)==null || df.formatCellValue(row.getCell(8)).equals(""))
					new CiqColorsheet800CDMA302().ciqColorsheet2(file,"eight",fileName);
				
				
				if(row.getCell(9)==null || df.formatCellValue(row.getCell(9)).equals(""))
					new CiqColorsheet800CDMA302().ciqColorsheet2(file,"nine",fileName);
				
				if(row.getCell(10)==null || df.formatCellValue(row.getCell(10)).equals(""))
					new CiqColorsheet800CDMA302().ciqColorsheet2(file,"ten",fileName);
				
				
				if(row.getCell(11)==null || df.formatCellValue(row.getCell(11)).equals(""))
					new CiqColorsheet800CDMA302().ciqColorsheet2(file,"eleven",fileName);
				
				if(row.getCell(12)==null || df.formatCellValue(row.getCell(12)).equals(""))
					new CiqColorsheet800CDMA302().ciqColorsheet2(file,"twelve",fileName);
				
				if(row.getCell(13)==null || df.formatCellValue(row.getCell(13)).equals(""))
					new CiqColorsheet800CDMA302().ciqColorsheet2(file,"thirteen",fileName);
				
				if(row.getCell(14)==null || df.formatCellValue(row.getCell(14)).equals(""))
					new CiqColorsheet800CDMA302().ciqColorsheet2(file,"forteen",fileName);
				
				if(row.getCell(15)==null || df.formatCellValue(row.getCell(15)).equals(""))
					new CiqColorsheet800CDMA302().ciqColorsheet2(file,"fifteen",fileName);
				
				if(row.getCell(16)==null || df.formatCellValue(row.getCell(16)).equals(""))
					new CiqColorsheet800CDMA302().ciqColorsheet2(file,"sixteen",fileName);
				
				if(row.getCell(17)==null || df.formatCellValue(row.getCell(17)).equals(""))
					new CiqColorsheet800CDMA302().ciqColorsheet2(file,"seventeen",fileName);
				
				if(row.getCell(18)==null || df.formatCellValue(row.getCell(18)).equals(""))
					new CiqColorsheet800CDMA302().ciqColorsheet2(file,"eightteen",fileName);
				
				if(row.getCell(19)==null || df.formatCellValue(row.getCell(19)).equals(""))
						new CiqColorsheet800CDMA302().ciqColorsheet2(file,"nineteen",fileName);
				
				if(row.getCell(20)==null || df.formatCellValue(row.getCell(20)).equals(""))
					new CiqColorsheet800CDMA302().ciqColorsheet2(file,"twenty",fileName);
				
				if(row.getCell(21)==null || df.formatCellValue(row.getCell(21)).equals(""))
					new CiqColorsheet800CDMA302().ciqColorsheet2(file,"twentyone",fileName);
				
				if(row.getCell(22)==null || df.formatCellValue(row.getCell(22)).equals(""))
					new CiqColorsheet800CDMA302().ciqColorsheet2(file,"twentytwo",fileName);
				
				if(row.getCell(23)==null || df.formatCellValue(row.getCell(23)).equals("") )
					new CiqColorsheet800CDMA302().ciqColorsheet2(file,"twentythree",fileName);
				
				if(row.getCell(24)==null || df.formatCellValue(row.getCell(24)).equals(""))
					new CiqColorsheet800CDMA302().ciqColorsheet2(file,"twentyfour",fileName);
					
			}
			LOGGER.log(Level.SEVERE, "800 CDMA/CIQFixValueAudit800CDMA/staconnectivity800CDMA");
			//new ReadECSFBDUMP800CDMA().readCIQ(file,cascade,fileName,eNB_Id,lst,sectorno);
			new ReadECSFBDUMP800CDMA().readCIQ(file,cascade,fileName,eNB_Id,lst);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
