package awt.file.lincense.com;

import java.io.File;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import ciq.read.com.CIQFixValueAudit;
import ciq.read.com.FirstCheck;
import ciq.read.com.ReadDump4;
import ciq.read.com.ReadEcsfbDump;
import ciq.read.com.ScheduleNameSiteCode;
import combine1900and800.cdu30.com.CIQFixValueAuditCombineCDU30;
import combine1900and800.cdu30.com.FirstCheckCombineCDU30;
import combine1900and800.cdu30.com.ScheduleNameSiteCodeCombine1900CDU30;
import combine1900and800.cdu30.com.ScheduleNameSiteCodeCombine800CDU30;
import sta.Combine800fdd.technology.com.CIQFixValueAuditCombine800FDD;
import sta.Combine800fdd.technology.com.ScheduleNameSiteCodeCombine800FDD;
import sta.eighthundred.cdu30.technology.com.CIQFixValueAudit800CDU30;
import sta.eighthundred.cdu30.technology.com.FirstCheck800CDU30;
import sta.eighthundred.cdu30.technology.com.ScheduleNameSiteCode800CDU30;
import sta.eighthundred.fdd.technology.com.CIQFixValueAudit800FDD;
import sta.eighthundred.fdd.technology.com.FirstCheck800FDD;
import sta.eighthundred.fdd.technology.com.ScheduleNameSiteCode800FDD;
import sta.ninteenthhundred.cdu30.technology.com.CIQFixValueAudit1900CDU30;
import sta.ninteenthhundred.cdu30.technology.com.FirstCheck1900CDU30;
import sta.ninteenthhundred.cdu30.technology.com.ScheduleNameSiteCode1900CDU30;
import sta.twentyfive.cdu30.technology.com.CIQFixValueAuditCDU30;
import sta.twentyfive.cdu30.technology.com.FirstCheckCDU30;
import sta.twentyfive.cdu30.technology.com.ScheduleNameSiteCodeCDU30;
import sta1900.fdd.technology.com.CIQFixValueAudit1900FDD;
import sta1900.fdd.technology.com.FirstCheck1900FDD;
import sta1900.fdd.technology.com.ScheduleNameSiteCode1900FDD;
import sta1900CDMA.technology.com.CIQFixValueAudit1900CDMA;
import sta1900CDMA.technology.com.FirstCheck1900CDMA;
import sta1900CDMA.technology.com.ScheduleNameSiteCode1900CDMA;
import sta800CDMA.technology.com.CIQFixValueAudit800CDMA;
import sta800CDMA.technology.com.FirstCheck800CDMA;
import sta800CDMA.technology.com.ScheduleNameSiteCode800CDMA301;
import staCombine1900.fdd.technology.com.CIQFixValueAuditCombine1900FDD;
import staCombine1900.fdd.technology.com.ScheduleNameSiteCodeCombine1900FDD;





public class FileName {
	
	private static final Logger LOGGER = Logger.getLogger(Ciqframe.class.getName());
	
	public void fileName() 
	{
		int flag=0;
		try {
			LOGGER.setLevel(Level.ALL);
			FileName ff = new FileName();
			Scanner scan = new Scanner(System.in);
			System.out.println(" the file to be searched.. ");
			//XSSFWorkbook workbook = new XSSFWorkbook();
			//XSSFSheet sheet = workbook.createSheet();
			//SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
			//format.setTimeZone(TimeZone.getTimeZone("CST"));
			//String newdate = format.format(new Date());
			//newdate = newdate.replace("/", "");
			
			
			String directory = "C:\\CIQ Audit";
			HashMap<Integer, Map> hm1 = new HashMap<>();
			HashMap<Integer, String> hm = new HashMap<>();
			
			
			File folder = new File(directory);
			String str = "";
			String[] str1 = null;
			File[] list = folder.listFiles();
			int j = 0;
			if (list != null)
				for (int i = 0; i < list.length; i++) {

					str = list[i].getName();

					str1 = str.split(" ", list[i].getName().length());
					j = 0;
					for (String str2 : str1) {
						hm.put(j, str2);
						j++;
					}
					hm1.put(i, hm);
					
					
					
/* Start Reading 2.5 TDD...............................................................................*/				

					
				  if (list[i].getName().contains("2.5 TDD") && !list[i].getName().contains("CDU30 2.5 TDD")) 
				 
					{
						
						try
						{
							//LOGGER.info("2.5 TDD CDU20"
							LOGGER.log(Level.SEVERE, "2.5 TDD CDU20", hm1.get(i).get(1));
                            System.out.println(hm1.get(i).get(1)); 
                           // System.out.println(new FirstCheck().firstCheck(hm1.get(i).get(1),list[i],list[i].getName()));
                              
                       if(new FirstCheck().firstCheck(hm1.get(i).get(1),list[i],list[i].getName()))
                       {
                    	   new CIQFixValueAudit().cIQFixValueAudit(list[i],list[i].getName(),hm1.get(i).get(1));
                           new ScheduleNameSiteCode().scheduleNameSiteCode(list[i],hm1.get(i).get(1),list[i].getName(),"2.5 TDD");
                       }
                       else
                       {
                    	   //flag=1;
                    	 continue;
                        }
                      
						
                        }catch(Exception e)
                         
						{
                        	 e.printStackTrace();
                        	 System.out.println("Exception Occure in 2.5 CDU20............................>");
                         }
                         
						
                       
					} 
			

/* Start Reading CDU30 2.5 TDD......................................................................*/					

					 if (list[i].getName().contains("CDU30 2.5 TDD")) 
					 {
						 try {
	                         
		                      LOGGER.log(Level.SEVERE, "2.5 TDD CDU30", hm1.get(i).get(1));
                            System.out.println(hm1.get(i).get(1)); 
                           // System.out.println(new FirstCheck().firstCheck(hm1.get(i).get(1),list[i],list[i].getName()));
                              
                       if(new FirstCheckCDU30().firstCheck(hm1.get(i).get(1),list[i],list[i].getName()))
                       {
                    	   new CIQFixValueAuditCDU30().cIQFixValueAudit(list[i],list[i].getName(),hm1.get(i).get(1));
                           new ScheduleNameSiteCodeCDU30().scheduleNameSiteCode(list[i],hm1.get(i).get(1),list[i].getName(),"2.5 TDD");
                       }
                       else
                       {
                         continue;
                       }
		                         }catch(Exception e)
		                         {
		                          e.printStackTrace();
		                          
		                          System.out.println("Exception Occure in Task1....................>");
		                          
		                         }
						
					 }
					 
					 
					 
				
					 
					 
					 
/* Start Reading 800 FDD........................................................................*/					 
					 
					 
				 if((list[i].getName().contains("800 FDD") && !list[i].getName().contains("STA CDU30 1900 FDD, 800 FDD") && !list[i].getName().contains("STA 1900 FDD, 800 FDD")))
					 {
						 
						 
					 
					 
					 if(list[i].getName().contains("CDU30"))
					 {
						 try
							{
								//LOGGER.info("2.5 TDD CDU20"
								LOGGER.log(Level.SEVERE, "800 FDD CDU30", hm1.get(i).get(1));
	                            System.out.println(hm1.get(i).get(1)); 
	                           // System.out.println(new FirstCheck().firstCheck(hm1.get(i).get(1),list[i],list[i].getName()));
	                              
	                       if(new FirstCheck800CDU30().firstCheck(hm1.get(i).get(1),list[i],list[i].getName()))
	                       {
	                    	   new CIQFixValueAudit800CDU30().cIQFixValueAudit(list[i],list[i].getName(),hm1.get(i).get(1));
	                           new ScheduleNameSiteCode800CDU30().scheduleNameSiteCode(list[i],hm1.get(i).get(1),list[i].getName(),"800 FDD");
	                       }
	                       else
	                       {
	                    	   //flag=1;
	                    	 continue;
	                        }
	                      
							
	                        }catch(Exception e)
	                         
							{
	                        	 e.printStackTrace();
	                        	 System.out.println("Exception Occure in 800 FDDCDU30............................>");
	                         }
					 }
					 else
					 {
						 
						 try
							{
								//LOGGER.info("2.5 TDD CDU20"
								LOGGER.log(Level.SEVERE, "800 FDD", hm1.get(i).get(1));
	                            System.out.println(hm1.get(i).get(1)); 
	                           // System.out.println(new FirstCheck().firstCheck(hm1.get(i).get(1),list[i],list[i].getName()));
	                              
	                       if(new FirstCheck800FDD().firstCheck(hm1.get(i).get(1),list[i],list[i].getName()))
	                       {
	                    	 new CIQFixValueAudit800FDD().cIQFixValueAudit(list[i],list[i].getName(),hm1.get(i).get(1));
	                         new ScheduleNameSiteCode800FDD().scheduleNameSiteCode(list[i],hm1.get(i).get(1),list[i].getName(),"800 FDD");
	                       }
	                       else
	                       {
	                    	   //flag=1;
	                    	 continue;
	                        }
	                      
							
	                        }catch(Exception e)
	                         
							{
	                        	 e.printStackTrace();
	                        	 System.out.println("Exception Occure in 800 FDD............................>");
	                         }
					 }
					 }
					 
					 
				 
				 
/* Start Reading 1900 .........................................................................*/
				 
					 if((list[i].getName().contains("1900 FDD") && !list[i].getName().contains("STA CDU30 1900 FDD, 800 FDD") && !list[i].getName().contains("STA 1900 FDD, 800 FDD")))
					 {
						 
						 
					 
					 
					 if(list[i].getName().contains("CDU30"))
					 {
						 try
							{
								//LOGGER.info("2.5 TDD CDU20"
								LOGGER.log(Level.SEVERE, "1900 FDD CDU30", hm1.get(i).get(1));
	                            System.out.println(hm1.get(i).get(1)); 
	                           // System.out.println(new FirstCheck().firstCheck(hm1.get(i).get(1),list[i],list[i].getName()));
	                              
	                       if(new FirstCheck1900CDU30().firstCheck(hm1.get(i).get(1),list[i],list[i].getName()))
	                       {
	                    	  new CIQFixValueAudit1900CDU30().cIQFixValueAudit(list[i],list[i].getName(),hm1.get(i).get(1));
	                          new ScheduleNameSiteCode1900CDU30().scheduleNameSiteCode(list[i],hm1.get(i).get(1),list[i].getName(),"1900 FDD");
	                       }
	                       else
	                       {
	                    	   //flag=1;
	                    	 continue;
	                        }
	                      
							
	                        }catch(Exception e)
	                         
							{
	                        	 e.printStackTrace();
	                        	 System.out.println("Exception Occure in 1900 FDD CDU30............................>");
	                         }
					 }
					 else
					 {
						 

						  try
							{
								
								LOGGER.log(Level.SEVERE, "1900 FDD", hm1.get(i).get(1));
	                            System.out.println(hm1.get(i).get(1)); 
	                           // System.out.println(new FirstCheck().firstCheck(hm1.get(i).get(1),list[i],list[i].getName()));
	                              
	                       if(new FirstCheck1900FDD().firstCheck(hm1.get(i).get(1),list[i],list[i].getName()))
	                       {
	                    	new CIQFixValueAudit1900FDD().cIQFixValueAudit(list[i],list[i].getName(),hm1.get(i).get(1));
	                        new ScheduleNameSiteCode1900FDD().scheduleNameSiteCode(list[i],hm1.get(i).get(1),list[i].getName(),"1900 FDD");
	                       }
	                       else
	                       {
	                    	   //flag=1;
	                    	 continue;
	                        }
	                      
							
	                        }catch(Exception e)
	                         
							{
	                        	 e.printStackTrace();
	                        	 System.out.println("Exception Occure in 1900 FDD............................>");
	                         }
					 
					 }
					 }
					 
	/* 800 CDMA................................................................................*/
					 
					 if(list[i].getName().contains("STA 800 CDMA") || list[i].getName().contains("STA 1900 CDMA, 800 CDMA") || list[i].getName().contains("STA 1900 CDMA 800 CDMA"))
					 {
						 try
							{
								//LOGGER.info("2.5 TDD CDU20"
								LOGGER.log(Level.SEVERE, "STA 800 CDMA", hm1.get(i).get(1));
	                            System.out.println(hm1.get(i).get(1)); 
	                           // System.out.println(new FirstCheck().firstCheck(hm1.get(i).get(1),list[i],list[i].getName()));
	                              
	                       if(new FirstCheck800CDMA().firstCheck(hm1.get(i).get(1),list[i],list[i].getName()))
	                       {
	                    	   
	                    	   new CIQFixValueAudit800CDMA().cIQFixValueAudit(list[i],list[i].getName(),hm1.get(i).get(1));
	                           
	                           new ScheduleNameSiteCode800CDMA301().scheduleNameSiteCode(list[i],hm1.get(i).get(1),list[i].getName(),"800 FDD");
	                       }
	                       else
	                       {
	                    	   //flag=1;
	                    	 continue;
	                        }
	                      
							
	                        }catch(Exception e)
	                         
							{
	                        	 e.printStackTrace();
	                        	 System.out.println("Exception Occure in 800 CDMA............................>");
	                         }
					 }
					 
/* 1900 CDMA...............................................................................*/
					 
					
					 if(list[i].getName().contains("STA 1900 CDMA") || list[i].getName().contains("STA 1900 CDMA, 800 CDMA"))
					 {
						 try
							{
								//LOGGER.info("2.5 TDD CDU20"
								LOGGER.log(Level.SEVERE, "STA 1900 CDMA", hm1.get(i).get(1));
	                            System.out.println(hm1.get(i).get(1)); 
	                           // System.out.println(new FirstCheck().firstCheck(hm1.get(i).get(1),list[i],list[i].getName()));
	                              
	                       if(new FirstCheck1900CDMA().firstCheck(hm1.get(i).get(1),list[i],list[i].getName()))
	                       {
	                    	   
	                    	   new CIQFixValueAudit1900CDMA().cIQFixValueAudit(list[i],list[i].getName(),hm1.get(i).get(1));
	                           
	                           new ScheduleNameSiteCode1900CDMA().scheduleNameSiteCode(list[i],hm1.get(i).get(1),list[i].getName(),"1900 FDD");
	                       }
	                       else
	                       {
	                    	   //flag=1;
	                    	 continue;
	                        }
	                      
							
	                        }catch(Exception e)
	                         
							{
	                        	 e.printStackTrace();
	                        	 System.out.println("Exception Occure in 1900 cdma............................>");
	                         }
					 }
					 
					 
					 
					
	/* Start Reading Combine 1900 and 800 CDU30......................................................*/
					 
					 if(list[i].getName().contains("STA CDU30 1900 FDD, 800 FDD"))
					 {
						 try
							{
								//LOGGER.info("2.5 TDD CDU20"
								LOGGER.log(Level.SEVERE, "STA CDU30 1900 FDD, 800 FDD", hm1.get(i).get(1));
	                            System.out.println(hm1.get(i).get(1)); 
	                           // System.out.println(new FirstCheck().firstCheck(hm1.get(i).get(1),list[i],list[i].getName()));
	                              
	                       if(new FirstCheckCombineCDU30().firstCheck(hm1.get(i).get(1),list[i],list[i].getName()))
	                       {
	                    	   
	                    	  new CIQFixValueAuditCombineCDU30().cIQFixValueAudit(list[i],list[i].getName(),hm1.get(i).get(1));
	                          new ScheduleNameSiteCodeCombine1900CDU30().scheduleNameSiteCode(list[i],hm1.get(i).get(1),list[i].getName(),"1900 FDD");
	                          new ScheduleNameSiteCodeCombine800CDU30().scheduleNameSiteCode(list[i],hm1.get(i).get(1),list[i].getName(),"800 FDD");
	                       }
	                       else
	                       {
	                    	   //flag=1;
	                    	 continue;
	                        }
	                      
							
	                        }catch(Exception e)
	                         
							{
	                        	 e.printStackTrace();
	                        	 System.out.println("Exception Occure in 800 && 1900 CDU30............................>");
	                         }
					 }
					 
/* Start Reading Combine STA 1900 FDD, 800 FDD..............................................*/					 
					 
					 
					 
					 if(list[i].getName().contains("STA 1900 FDD, 800 FDD"))
					 {
						 try
							{
								//LOGGER.info("2.5 TDD CDU20"
								LOGGER.log(Level.SEVERE, "STA 1900 FDD, 800 FDD", hm1.get(i).get(1));
	                            System.out.println(hm1.get(i).get(1)); 
	                           // System.out.println(new FirstCheck().firstCheck(hm1.get(i).get(1),list[i],list[i].getName()));
	/* 800 FDD...........................................................................................*/
	                            
	                            if(new FirstCheck800FDD().firstCheck(hm1.get(i).get(1),list[i],list[i].getName()))
	 	                       {
	 	                    	new CIQFixValueAuditCombine800FDD().cIQFixValueAudit(list[i],list[i].getName(),hm1.get(i).get(1));
	 	                        new ScheduleNameSiteCodeCombine800FDD().scheduleNameSiteCode(list[i],hm1.get(i).get(1),list[i].getName(),"800 FDD");
	 	                       }
	                          else
	                          {
	                    	   //flag=1;
	                    	   continue;
	                           }
	                      
	 /* 1900 FDD......................................................................................*/
	                       
	                       
	                            if(new FirstCheck1900FDD().firstCheck(hm1.get(i).get(1),list[i],list[i].getName()))
	 	                       {
	 	                    	new CIQFixValueAuditCombine1900FDD().cIQFixValueAudit(list[i],list[i].getName(),hm1.get(i).get(1));
	 	                        new ScheduleNameSiteCodeCombine1900FDD().scheduleNameSiteCode(list[i],hm1.get(i).get(1),list[i].getName(),"1900 FDD");
	 	                       }
	                       else
	                       {
	                    	   //flag=1;
	                    	 continue;
	                        }
	                      
	                       
							
	                        }catch(Exception e)
	                         
							{
	                        	 e.printStackTrace();
	                        	 System.out.println("Exception Occure in 800 && 1900 CDU30............................>");
	                         }
					 } 
					 
					 
					
					 
					 
						
				}

			

	} catch (Exception e) {
			e.printStackTrace();
		}
		 
		
      	   //return null;


	}

}
